package homeworks.ch06.circle;

import static java.lang.Math.*;

public class Circle {
	
	// The private instance variable
	private double radius;

	/*
	 * CONSTRUTORS
	 */

	// +Circle() - default constructor
	public Circle() {
		this(1.0);
	}

	// +Circle(radius: double) - smart constructor
	public Circle(double radius) {
		this.radius = radius;
	}


	// Getter method for protected instance variable 'radius'
	public double getRadius() {
		return radius;
	}

	// Setter method for protected instance variable 'radius'
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// toString()
	@Override
	public String toString() {
		return "Circle[" + super.toString() + ",radius=" + radius + "]";
	}

	// getArea()
	// +getArea(): double
	// this method is implemented to calculates the area of the circle object
	public double getArea() {
		return PI * pow(radius, 2);
	}

	// getPerimeter()
	// +getPerimeter(): double
	// this method is implemented to calculates the perimeter of the circle object
	public double getPerimeter() {
		return 2 * PI * radius;
	}
}
