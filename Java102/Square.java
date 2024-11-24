package Java102;

public class Square {
	public final Point corner;
	public final double sideLength;

	/**
	* @param corner The bottom left corner of the square
	* @param sideLength
	*/
	public Square(Point corner, double sideLength) {
		this.corner = corner;
		this.sideLength = sideLength;
	}

	public double area() {
        return sideLength * sideLength;
    }
	
	    public double perimeter() {
            return 4 * sideLength;
        }
    
	
	/** 
	* @return Whether point p is inside of the square.
	*/
	public boolean isInside(Point p) {
		double xDist = p.x - corner.x;
		double yDist = p.y - corner.y;
		return 0 < xDist && xDist < sideLength &&
			   0 < yDist && yDist < sideLength;
	}

	/** 
	* @return Whether point p part of/on the border of the square.
	*/
	public boolean isOn(Point p) {
        double xDist = p.x - corner.x;
        double yDist = p.y - corner.y;
        return (xDist == 0 || xDist == sideLength) &&  // On the vertical sides of the square
               (yDist >= 0 && yDist <= sideLength) ||  // Within y-range for the left or right sides
               (yDist == 0 || yDist == sideLength) &&  // On the horizontal sides of the square
               (xDist >= 0 && xDist <= sideLength);    // Within x-range for the top or bottom sides
    }
	
	/** 
	* @param x How much to translate the sqaure by in the + x direction.
	* @param y How much to translate the squarer by in the + y direction.
	* @return The sqaure that results from the translation.
	*/
	public Square translate(double x, double y) {
        Point newCorner = new Point(corner.x + x, corner.y + y);
	    return new Square(newCorner, sideLength);
    }

	/** 
	* @return The sqaure that results from scaling the side length and maintaining the bottom left corner
	*/
	public Square scale(double k) {
		return new Square(corner, sideLength * k);
	}

	public Point[] corners() {
        Point[] corners = new Point[4];
        corners[0] = corner; // Bottom-left corner
        corners[1] = new Point(corner.x + sideLength, corner.y); // Bottom-right corner
        corners[2] = new Point(corner.x, corner.y + sideLength); // Top-left corner
        corners[3] = new Point(corner.x + sideLength, corner.y + sideLength); // Top-right corner
        return corners;
    }
    
	@Override
	public String toString() {
		return "(corner: " + corner + "; side length: " + sideLength + ")";
	}
}