package homeworks.ch07.point;

public class TestPoint {

	public static void main(String[] args) {
		System.out.println(Point.COORDINATE_SYSTEM);
		System.out.println(Point.ORIGIN);
		System.out.println(Point.getPointCount());
		
		System.out.println();
		
		Point p1 = Point.of(1, 3);
		Point p2 = Point.of(2, 3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(Point.getPointCount());
		System.out.println(Point.distanceFromOrigin(p1));
		System.out.println(Point.distance(p1, p2));
		
	}
}
