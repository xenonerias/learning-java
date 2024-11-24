package Java102;

public class RightTriangle implements Shape {
    private double base;
    private double height;
    private String corner;

    public RightTriangle(double base, double height, String corner) {
        this.base = base;
        this.height = height;
        this.corner = corner;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

    public static boolean similar(RightTriangle tri1, RightTriangle tri2) {
        return (tri1.base / tri1.height) == (tri2.base / tri2.height);
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public String getCorner() {
        return corner;
    }
}
