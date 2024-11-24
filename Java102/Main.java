package Java102;

public class Main {
    public static void main(String[] args) {
        RightTriangle triangle1 = new RightTriangle(6, 8, "bottom-left");
        RightTriangle triangle2 = new RightTriangle(6, 8, "top-right");

        System.out.println("Area of triangle1: " + triangle1.area());
        System.out.println("Perimeter of triangle1: " + triangle1.perimeter());
        System.out.println("Area of triangle2: " + triangle2.area());
        System.out.println("Perimeter of triangle2: " + triangle2.perimeter());

        System.out.println("triangle1 and triangle2 are similar: " + RightTriangle.similar(triangle1, triangle2));
}
}