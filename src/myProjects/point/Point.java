package myProjects.point;

public class Point {

	// The private instance variables
	private int x;
	private int y;

	// Constructor

	// +Point() - default constructor
	public Point() {

	}

	// +Point(x: int, y: int)
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	// Getters and Setters methods

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

	// calculate(): double
	// this method calculates and returns the distance of ‘point’ from origin
	public double calculate() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	// calculate(Point point): double
	// this method calculates and returns the distance of 'point' from 'another
	// point'
	public double calculate(Point point) {
		return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
	}

	// calculate(int valueX, int valueY)
	// this method calculates and returns the distance of 'point' from given values
	public double calculate(int valueX, int valueY) {
		return Math.sqrt(Math.pow(valueX - x, 2) + Math.pow(valueY - y, 2));
	}

	// move(char axis, int value): void
	// apsis or ordinate
	// this method moves the point to given values
	// overloaded
	public void move(String e, int value) {
		switch (e) {
		case "x":
			x += value;
			break;
		case "y":
			y += value;
			break;
		}

		// if-else
		// ternary operator
	}

	// move(int value1, int value2): void
	// x and y
	// this method moves the point to given values
	// overloaded
	public void move(int valueX, int valueY) {
		x += valueX;
		y += valueY;
	}

	// whichQuadrant(): String
	// this method returns the quadrant of the point
	public String whichQuadrant() {
		if (x > 0 & y > 0)
			return "I";
		else if (x < 0 & y > 0)
			return "II";
		else if (x < 0 & y < 0)
			return "III";
		else
			return "IV";
	}

	// clone(): Point
	// this method clones the 'this' point to another point
	public Point clone() {
		Point point = new Point();
		point.x = x;
		point.y = y;
		return point;
	}

	// toString()
	public String toString() {
		return ".(" + x + "," + y + ")";
	}
}
