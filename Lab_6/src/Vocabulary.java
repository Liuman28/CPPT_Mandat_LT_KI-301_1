import java.util.*;

public class Vocabulary<T extends Data> {

    private final List<T> words;
    private final List<T> interpretation;

    public Vocabulary(){

        words = new ArrayList<T>();
        interpretation = new ArrayList<T>();
    }

    public void addLine(T a, T b)
    {

        words.add(a);
        interpretation.add(b);
    }

    public void deleteLine(int index){
        words.remove(index-1);
        interpretation.remove(index-1);
    }
    public void showVocabulary(){
        System.out.println("Vocabulary: ");

        for(int i = 0;i < words.size();i++){
            System.out.println((i+1)+". "+"Word: " + words.get(i).getWord()+"\t-\t"+ interpretation.get(i).getWord());
        }
        System.out.println("\n");
    }

    public void findMax(){
        int maxIndex1 = 0;
        int maxIndex2 = 0;
        int maxSize1=0;
        int maxSize2=0;

        for(int i = 0; i < words.size();i++){
            if(words.get(i).getSize() > maxSize1){
                maxIndex1 = i+1;
                maxSize1 = words.get(i).getSize();
            }
            if(interpretation.get(i).getSize() > maxSize2){
                maxIndex2 = i+1;
                maxSize2 = interpretation.get(i).getSize();
            }
        }
        System.out.println("Max Length of vocabulary words in line: "+maxIndex1);
        System.out.println("Max Length of vocabulary interpretation in line: "+maxIndex2+"\n");

    }
    public void a(){
        System.out.println(words.size());
    }

}
