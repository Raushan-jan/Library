public class Supplierlmpl  implements Supplier, Reader{

    private  String nameSupplier;

    public Supplierlmpl(String nameSupplier) {
        this.nameSupplier = nameSupplier;
    }

    @Override
    public void bringBooks() {
        System.out.println(nameSupplier+"приносит книги в библиотеку");

    }

    @Override
    public void takeBook(Book book, Administratorlmpl administratorlmpl) {
        System.out.println(nameSupplier+" берет книгу "+book.getBookName()+" у "+administratorlmpl.getNameAdmin());
    }

    @Override
    public void returnBook(Book book) {
        System.out.println(nameSupplier+" возвращат книгу "+book.getBookName());
    }

    public String getNameSupplier() {
        return nameSupplier;
    }
}
