package composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent {
    private final String name;
    private final List<MenuComponent> items = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void add(MenuComponent component) {
        items.add(component);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + name + ":");
        for (MenuComponent item : items) {
            item.print(indent + "  ");
        }
    }

    @Override
    public int count() {
        int total = 0;
        for (MenuComponent item : items) {
            total += item.count();
        }
        return total;
    }
}