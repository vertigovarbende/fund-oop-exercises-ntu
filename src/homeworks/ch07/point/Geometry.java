package homeworks.ch07.point;

public class Geometry {

	// static final variables
	public static final String COORDINATE_SYSTEM = "Cartesian";
	public static final Point ORIGIN = new Point();
	
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
		return distanceBetweenTwoPoints(point, ORIGIN);
//		return Math.sqrt(point.getX() * point.getX() + point.getY() * point.getY());
//		return Math.sqrt(Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2));
	}
	
	public static double distanceBetweenTwoPoints(Point p1, Point p2) {
		double dx = p1.getX() - p2.getX();
		double dy = p1.getY() - p2.getY();
		return Math.sqrt(dx * dx + dy * dy);
//		return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
	}
}
