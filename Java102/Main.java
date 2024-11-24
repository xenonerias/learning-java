package Java102;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 1);
        Point p2 = new Point(2, 0);
        Point p3 = new Point(2, 4);
        Circle circle = Circle.fromPoints(p1, p2, p3);
        System.out.println(circle);
}
}