package myProjects.point;

public class TestPoint {

	public static void main(String[] args) {
		Point[] allPoints = { new Point(3, 4), new Point(-3, 2), new Point(-7, -8), new Point(6, -8) };

		System.out.println("allPoints\n");
		printAllPoints(allPoints);
		System.out.println();

		printDot("allPoints distance to origin");

		System.out.println("\n\nallPoints distance to origin\n");
		printDistanceToOrigin(allPoints);
		System.out.println();

		printDot("allPoints distance to each other");

		System.out.println("\n\nallPoints distance to each other");
		printDistanceTo(allPoints);
		System.out.println();

		printDot("move allPoints like x -> 3, y -> -2");

		System.out.println("\n\nmove allPoints like x -> 3, y -> -2\n");
		printMove(allPoints);
		System.out.println();

		printDot("move allPoints like x -> -1");

		System.out.println("\n\nmove allPoints like x -> -1\n");
		printMoveX(allPoints);
		System.out.println();

		printDot("move allPoints like y - > 4");

		System.out.println("\n\n move allPoints like y -> 4\n");
		printMoveY(allPoints);
		System.out.println();

	}

	public static void printMoveY(Point... allPoints) {
		for (int i = 0; i < allPoints.length; ++i) {
			System.out.format(".(%d,%d) -> ", allPoints[i].getX(), allPoints[i].getY());
			allPoints[i].move("y", 4);
			System.out.format(".(%d,%d)\n", allPoints[i].getX(), allPoints[i].getY());
		}
	}

	public static void printMoveX(Point... allPoints) {
		for (int i = 0; i < allPoints.length; ++i) {
			System.out.format(".(%d,%d) -> ", allPoints[i].getX(), allPoints[i].getY());
			allPoints[i].move("x", -1);
			System.out.format(".(%d,%d)\n", allPoints[i].getX(), allPoints[i].getY());
		}
	}

	public static void printMove(Point... allPoints) {
		for (int i = 0; i < allPoints.length; ++i) {
			System.out.format(".(%d,%d) -> ", allPoints[i].getX(), allPoints[i].getY());
			allPoints[i].move(3, -2);
			System.out.format(".(%d,%d)\n", allPoints[i].getX(), allPoints[i].getY());
		}
	}

	public static void printDistanceTo(Point... allPoints) {
		for (int i = 0; i < allPoints.length; ++i) {
			System.out.println("\n.(" + allPoints[i].getX() + "," + allPoints[i].getY() + ")\n");
			for (int j = 0; j < allPoints.length; ++j) {
				if (j == i)
					continue;
				System.out.format(".(%d,%d) to .(%d,%d) -> %.3f\n", allPoints[i].getX(), allPoints[i].getY(),
						allPoints[j].getX(), allPoints[j].getY(), allPoints[i].calculate(allPoints[j]));
			}
		}
	}

	public static void printDistanceToOrigin(Point... allPoints) {
		for (int i = 0; i < allPoints.length; ++i)
			System.out.format("[%d] -> .(%d,%d) to .(%d,%d) -> %.3f\n", (i + 1), allPoints[i].getX(),
					allPoints[i].getY(), 0, 0, allPoints[i].calculate());
	}

	public static void printAllPoints(Point... allPoints) {
		for (int i = 0; i < allPoints.length; ++i)
			System.out
					.println("[" + (i + 1) + "] -> " + allPoints[i].toString() + " -> " + allPoints[i].whichQuadrant());
	}

	public static void printDot(String value) {
		for (int i = 0; i < value.length(); ++i)
			System.out.print(".");
	}
}
