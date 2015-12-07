package week2lesson5;

import java.util.Scanner;

//main class
public class ShapeClass {
	static Shape getShape() {
		System.out.println("Type	C – for Circle\n	R – for Rectangle\n	T – for Triangle");
		Scanner sc = new Scanner(System.in);
		char type = (char) (sc.next().toUpperCase().charAt(0));
		switch (type) {
		case 'R':
			return new Rectangle();
		case 'T':
			return new Triangle();
		case 'C':
			return new Circle();

		default:
			return null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = getShape();
		if (!s.equals(null)) {
			s.readShapeData();
			System.out.println(s.toString());
			System.out.println("Area is: " + s.computeArea());
			System.out.println("Perimeter is: " + s.computePerimeter());
		}
	}

}

// abstract class shape
abstract class Shape {
	protected String shapeName;

	public String getShapeName() {
		return shapeName;
	}

	public abstract String toString();

	public abstract double computeArea();

	public abstract double computePerimeter();

	public abstract void readShapeData();

}

// subclass rectangle
class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle() {
		this.shapeName = "Rectangle";
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is " + this.shapeName + ", Width: " + width + ", Height: " + height;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2 * width + 2 * height;
	}

	@Override
	public void readShapeData() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Type width of Rectangle: ");
		setWidth(sc.nextDouble());
		System.out.println("Type height of Rectangle: ");
		setHeight(sc.nextDouble());
	}
}
//subclass Circle
class Circle extends Shape {
	private double radius;

	public Circle() {
		this.shapeName = "Circle";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is " + this.shapeName + ", Radius is: " + radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return radius * radius * 3.14;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2 * radius * 3.14;
	}

	@Override
	public void readShapeData() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Type radius of Circle: ");
		setRadius(sc.nextDouble());
	}

}
//subclass triangle
class Triangle extends Shape {
	private double base;
	private double height;

	public Triangle() {
		this.shapeName = "RT Triangle";
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is " + this.shapeName + ", Base is: " + base + ", Height is: " + height;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return base * height / 2;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return Math.sqrt(base * base + height * height) + base + height;
	}

	@Override
	public void readShapeData() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Type base of Triangle: ");
		setBase(sc.nextDouble());
		System.out.println("Type height of Triangle: ");
		setHeight(sc.nextDouble());
	}

}
//Output
//==================================
/*
 * Type	C – for Circle
R – for Rectangle
T – for Triangle
c
Type radius of Circle: 
45
This is Circle, Radius is: 45.0
Area is: 6358.5
Perimeter is: 282.6
*/

/*
Type	C – for Circle
R – for Rectangle
T – for Triangle
r
Type width of Rectangle: 
12
Type height of Rectangle: 
34
This is Rectangle, Width: 12.0, Height: 34.0
Area is: 408.0
Perimeter is: 92.0
*/

/*
Type	C – for Circle
R – for Rectangle
T – for Triangle
t
Type base of Triangle: 
12
Type height of Triangle: 
23
This is RT Triangle, Base is: 12.0, Height is: 23.0
Area is: 138.0
Perimeter is: 60.94224354214569
*/