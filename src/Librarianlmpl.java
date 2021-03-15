public class Librarianlmpl implements Librarian, Administrator {
    private String nameLibrarian;

    public Librarianlmpl(String nameLibrarian) {
        this.nameLibrarian = nameLibrarian;
    }

    @Override
    public void findBook(Book book) {
        System.out.println(nameLibrarian + " находит книгу " + book.getBookName());

    }

    @Override
    public void overdueNotiFacation(Readerlmpl readerlmpl) {
        System.out.println(nameLibrarian + " уведомляет " + readerlmpl.getNameReader() + " о просрочках времени возврата");

    }

    @Override
    public void orderBook(Book book, Supplierlmpl supplierlmpl) {
        System.out.println(nameLibrarian + " заказывает  книгу" + book.getBookName()+" у "+supplierlmpl.getNameSupplier());
    }

    public String getNameLibrarian() {
        return nameLibrarian;
    }
}
