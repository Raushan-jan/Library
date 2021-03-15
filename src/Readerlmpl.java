public class Readerlmpl implements Reader {
    private String nameReader;

    public Readerlmpl(String nameReader) {
        this.nameReader = nameReader;
    }

    @Override
    public void takeBook(Book book, Administratorlmpl administratorlmpl) {
        System.out.println(nameReader+" берет книгу "+book.getBookName()+" у "+administratorlmpl.getNameAdmin());
    }

    @Override
    public void returnBook(Book book) {
        System.out.println(nameReader+" возвращат книгу "+book.getBookName());
    }



    public String getNameReader() {
        return nameReader;
    }
}
