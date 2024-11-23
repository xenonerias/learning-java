package Java102;

public class Point {
	public final double x;
	public final double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point translateX(double t) {
		return new Point(x + t, y);
	}
	
	public Point translateY(double t) {
		return new Point(x, y + t);
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}


  public Point(int x, int y) {
    this.x = x;
    this.y = y;
}

public static Point centerOfMass(Point[] points) {
    int sumX = 0, sumY = 0;

    for (Point p : points) {
        sumX += p.x;
        sumY += p.y;
    }

    return new Point(sumX / points.length, sumY / points.length);
}

}

