package composite;

public class Main {
    public static void main(String[] args) {
        // Создаем пункты меню
        MenuComponent newItem = new MenuItem("New", 0);
        MenuComponent openItem = new MenuItem("Open", 0);
        MenuComponent exitItem = new MenuItem("Exit", 0);

        MenuComponent copyItem = new MenuItem("Copy", 0);
        MenuComponent pasteItem = new MenuItem("Paste", 0);

        // Создаем подменю
        Menu fileMenu = new Menu("File");
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(exitItem);

        Menu editMenu = new Menu("Edit");
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Создаем главное меню
        Menu mainMenu = new Menu("Main Menu");
        mainMenu.add(fileMenu);
        mainMenu.add(editMenu);

        // Выводим меню
        mainMenu.print("");
        System.out.println("Total items: " + mainMenu.count());
    }
}