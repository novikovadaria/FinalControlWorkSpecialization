// Класс Main для запуска программы
public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Menu menu = new Menu(database);
        menu.displayMenu();
    }
}
