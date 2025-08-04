package composite;

public class MenuItem implements MenuComponent {
    private final String name;
    private final double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + name + " - $" + price);
    }

    @Override
    public int count() {
        return 1;
    }
}