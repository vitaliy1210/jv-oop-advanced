package core.basesyntax;

public abstract class Figure {
    protected String color;
    protected double area;

    protected Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }
}