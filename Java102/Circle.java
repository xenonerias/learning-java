package Java102;

public class Circle {
	public final Point center;
	public final double radius;

	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	/** 
	* @return Whether point p is inside of the circle.
	*/
	public boolean isInside(Point p) {
		return Point.distance(center, p) < radius;
	}

	/** 
	* @return Whether point p part of/on the border of the circle.
	*/
	public boolean isOn(Point p) {
		return Point.distance(center, p) == radius;
	}

	/** 
	* @param x How much to translate the circle by in the + x direction.
	* @param y How much to translate the circle by in the + y direction.
	* @return The circle that results from the translation.
	*/
	public Circle translate(double x, double y) {
		return new Circle(center.translateX(x).translateY(y), radius);
	}

	/** 
	* @return The circle that results from scaling by k.
	*/
	public Circle scale(double k) {
		return new Circle(center, radius * k);
	}

    public static Circle fromPoints(Point p1, Point p2, Point p3) {

        Point mid1 = new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
        Point mid2 = new Point((p2.x + p3.x) / 2, (p2.y + p3.y) / 2);

        double slope1 = (p2.y - p1.y) / (p2.x - p1.x);
        double slope2 = (p3.y - p2.y) / (p3.x - p2.x);

        double perpSlope1 = -1 / slope1;
        double perpSlope2 = -1 / slope2;

        double b1 = mid1.y - perpSlope1 * mid1.x;
        double b2 = mid2.y - perpSlope2 * mid2.x;

        double xCenter = (b2 - b1) / (perpSlope1 - perpSlope2);
        double yCenter = perpSlope1 * xCenter + b1;

        Point center = new Point(xCenter, yCenter);

        double radius = Point.distance(center, p1);

        return new Circle(center, radius);
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

	@Override
	public String toString() {
		return "(center: " + center + "; radius: " + radius + ")";
	}
}