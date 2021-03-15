public class Administratorlmpl implements Administrator, Reader {
    private String nameAdmin;

    public Administratorlmpl(String nameAdmin) {
        this.nameAdmin = nameAdmin;
    }

    @Override
    public void findBook(Book book) {

        System.out.println(nameAdmin + " находит книгу " + book.getBookName());
    }

    @Override
    public void overdueNotiFacation(Readerlmpl readerlmpl) {

        System.out.println(nameAdmin + " уведомляет " + readerlmpl.getNameReader() + " о просрочках времени возврата");

    }

    @Override
    public void takeBook(Book book, Administratorlmpl administratorlmpl) {
        System.out.println(nameAdmin + " берет книгу " + book.getBookName());
    }

    @Override
    public void returnBook(Book book) {
        System.out.println(nameAdmin + " возвращат книгу " + book.getBookName());
    }



    public String getNameAdmin() {
        return nameAdmin;
    }
}
