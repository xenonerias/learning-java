package Java102;

public class Main {
    public static void main(String[] args) {
Point[] points = { new Point(3, 5), new Point(7, 2), new Point(10, 8) };
Point center = Point.centerOfMass(points);
System.out.println("Center of Mass: (" + center.x + ", " + center.y + ")");
}
}
