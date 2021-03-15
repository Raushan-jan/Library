public class Main {
    public static void main(String[] args) {
        Book book = new Book("Абай жолы");
        Book book1 = new Book("Отырыс");
        Book book2 = new Book("Абай жолы");
        Readerlmpl readerlmpl = new Readerlmpl("Читатель");
        Administratorlmpl administratorlmpl = new Administratorlmpl("Администратор");
        Supplierlmpl supplierlmpl = new Supplierlmpl("Заказщик");
        Librarianlmpl librarianlmpl = new Librarianlmpl("Библиотекарь");
        readerlmpl.takeBook(book2, administratorlmpl);
    }
}