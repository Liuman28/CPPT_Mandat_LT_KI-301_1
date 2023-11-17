public class Main {
    public static void main(String[] args) {
        Vocabulary<Data> book = new Vocabulary<Data>();
        book.addLine(new WordEnglish("Enemy"),new WordEnglish("Противник"));
        book.addLine(new WordEnglish("Animal"),new WordEnglish("Тварина"));
        book.addLine(new WordGerman("Schiff"),new WordGerman("Корабель"));
        book.showVocabulary();

        book.findMax();
        book.deleteLine(2);
        book.showVocabulary();
        book.findMax();
        book.addLine(new WordEnglish("32132132131232321312"),new WordEnglish("ds"));
        book.findMax();
        book.showVocabulary();


    }
}