import java.io.*;
import java.util.Scanner;

public class fileClass {
    private  double result;



    public void calc(double x){
        Calculate object = new Calculate();
        result = object.calc(x);
    }
    public double getResult(){return result;}


    public void writeResFile(String filename) throws FileNotFoundException{
        PrintWriter file=new PrintWriter(filename);
        file.printf("%f\n", result);
        file.close();
    }
    public void readResFile(String filename)
    {
        try{

            File f = new File(filename);
            if(f.exists()){
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            }
            else throw new FileNotFoundException("File " + filename + " does not exist");


        }
        catch(FileNotFoundException e){
            System.out.print(e.getMessage());
        }

    }
    public void writeResFileBinary(String filename) throws IOException {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(filename));
        f.writeDouble(result);
    }

    public void readResFileBinary(String filename) throws IOException {
        DataInputStream f = new DataInputStream(new FileInputStream(filename));
        result=f.readDouble();
        f.close();

    }


}
