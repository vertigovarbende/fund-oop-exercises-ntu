package homeworks.ch07.point;

public class Point {

	/*
	 * MEMBER VARIABLES
	 */
	
	// static final variables
	public static final String COORDINATE_SYSTEM = "Cartesian";
	public static final Point ORIGIN = new Point();
	
	// static variables
	private static int pointCount = 0;
	
	// The private instance variables
	private int x;
	private int y;

	/*
	 * CONSTRUCTORS
	 */
	
	// +Point() - default constructor
	public Point() {
		this(0, 0);
		++pointCount;
	}

	// +Point(Point other)
	// to copy the created point object to the new point to be created
	public Point(Point other) {
		this(other.getX(), other.getY());
		++pointCount;
	}

	// +Point(x: int, y: int)
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		++pointCount;
	}
	
	/*
	 * GETTER AND SETTER METHODS
	 */

	// Getter method for private instance variable 'x'
	public int getX() {
		return x;
	}

	// Setter method for private instance variable 'x'
	public void setX(int x) {
		this.x = x;
	}

	// Getter method for private instance variable 'y'
	public int getY() {
		return y;
	}

	// Setter method for private instance variable 'y'
	public void setY(int y) {
		this.y = y;
	}

	// +getXY(): int[2]
	// this method returns integer array of point's x and y
	public int[] getXY() {
		return new int[] { x, y };
	}

	// +setXY(x: int, y: int): void
	// this method sets both x and y
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/*
	 * INSTANCE METHODS
	 */
	
	// we may override 'equals' ?
	public boolean isSame(Point other) {
	    return this.x == other.x && this.y == other.y;
	}
	
	public boolean isOrigin() {
		return isSame(ORIGIN);
//	    return ORIGIN.isSame(this);
	}
	
	public int quadrant() {
	    if (x > 0 && y > 0) 
	    	return 1;
	    if (x < 0 && y > 0) 
	    	return 2;
	    if (x < 0 && y < 0) 
	    	return 3;
	    if (x > 0 && y < 0) 
	    	return 4;
	    return 0;
	}
	
	// distanceTo(): double
	// this method calculates and returns the distance of ‘point’ from origin
	public double distanceTo() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	// distanceTo(Point point): double
	// this method calculates and returns the distance of 'point' from 'another
	// point'
	public double distanceTo(Point point) {
		return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
	}

	// distanceTo(int x, int y)
	// this method calculates and returns the distance of 'point' from given values
	public double distanceTo(int x, int y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
	}

	// moveX(x: int): void
	// this method moves the apsis by the entered values
	public void moveX(int x) {
		this.x += x;
	}
	
	// moveY(y: int): void
	// this method moves the ordinate by the entered values
	public void moveY(int y) {
		this.y += y;
	}
	
	// move(x: int, y: int): void
	// this method moves the point by the entered values
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	// necessary??? - we can use set methods?
	// moveTo(x: int, y: int): void 
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
//		setXY(x, y);
	}
	
	// necessary??? - we can use set methods?
	// moveTo(point: Point): void
	// this method moves the point to given point
	public void moveTo(Point point) {
		x = point.getX();
		y = point.getY();
//		setXY(point.getX(), point.getY());
	}
	
	// +getSymmetricToXAxis(): Point
	public Point getSymmetricToXAxis() {
		return new Point(x, -y);
	}
	
	// +getSymmetricToYAxis(): Point
	public Point getSymmetricToYAxis() {
		return new Point(-x, y);
	}
	
	// +getSymmetricToOrigin(): Point
	public Point getSymmetricToOrigin() {
		return new Point(-x, -y);
	}
	
	public Point midpoint(Point other) {
	    return new Point(
	        (this.x + other.x) / 2,
	        (this.y + other.y) / 2
	    );
	}

	// clone(): Point
	// this method copies the 'this' point to another point
	public Point clone() {
		return new Point(this);
		// return new Point(this.x, this.y)
	}

	// toString()
	public String toString() {
		return ".(" + x + "," + y + ")";
	}
	
	
	/*
	 * STATIC METHODS
	 */
	
	// Getter method for private static variable 'pointCount'
	public static int getPointCount() {
		return Point.pointCount;
	}
	
	// Factory method
	public static Point of(int x, int y) {
	    return new Point(x, y);
	}
	
	// Copy
	public static Point of(Point point) {
		return new Point(point);
	}
	
	// distance from origin
	public static double distanceFromOrigin(Point point) {
		return distance(point, ORIGIN);
//		return Math.sqrt(point.getX() * point.getX() + point.getY() * point.getY());
//		return Math.sqrt(Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2));
	}
	
	public static double distance(Point p1, Point p2) {
		double dx = p1.getX() - p2.getX();
		double dy = p1.getY() - p2.getY();
		return Math.sqrt(dx * dx + dy * dy);
//		return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
	}
	
	public static Point midpoint(Point p1, Point p2) {
		return new Point(
				(p1.getX() + p2.getX()) / 2,
				(p1.getY() + p2.getY()) / 2
			);
	}
	
}
