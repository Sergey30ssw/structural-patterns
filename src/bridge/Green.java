package bridge;

public class Green implements Color {
    @Override
    public String apply(String shape) {
        return "Green " + shape;
    }
}