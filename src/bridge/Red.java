package bridge;

public class Red implements Color {
    @Override
    public String apply(String shape) {
        return "Red " + shape;
    }
}