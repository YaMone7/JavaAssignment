package AssiShape;
abstract class Shape{

	
	String color;
	Boolean filled=true;
	
	
	abstract double getArea();
	public double Area;
	
	abstract double getPerimeter();
	public double Perimeter;
	
	public Shape() {}


	public Shape(String color, Boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Boolean getFilled() {
		return filled;
	}


	public void setFilled(Boolean filled) {
		this.filled = filled;
	}


	@Override
	public String toString() {
		return "Color: \t"+color+"\nFilled: \t"+filled+"\nArea \t"+getArea()+"\nPerimeter: \t"+getPerimeter();
	}
	
	
}

class Circle extends Shape{
double radius=1.0;

public Circle() {}

public Circle(double radius) {
super();
this.radius = radius;
}

public Circle(double radius,String color, Boolean filled) {
super(color,filled);
this.radius = radius;

}

@Override
double getArea() {
Area=Math.PI*radius*radius;
return Area;
}

@Override
double getPerimeter() {
Perimeter=2 * Math.PI * radius;
return Perimeter;
}

@Override
public String toString() {
return "\nArea of Circle: \t"+getArea()+"\nPerimeter of Circle: \t"+getPerimeter()+"\nColor: \t"+color+"\nFilled: \t"+filled;
}


}

class Rectangle extends Shape{
	
double width=1.0;
double length=1.0;


public Rectangle() {}


public Rectangle(double width, double length) {
	super();
	this.width = width;
	this.length = length;
}
public Rectangle(double width, double length,String color, Boolean filled) {
	super(color,filled);
	this.width = width;
	this.length = length;
}


public double getWidth() {
	return width;
}


public void setWidth(double width) {
	this.width = width;
}


public double getLength() {
	return length;
}


public void setLength(double length) {
	this.length = length;
}


@Override
double getArea() {
	 Area = width*length;
	  return Area;
}


@Override
double getPerimeter() {
	Perimeter=2*(width+length);
	return Perimeter;
}

public String toString() {
	return "\nArea of Rectangle:\t"+getArea()+"\nPerimeter of Rectangle:\t"+getPerimeter()+"\nColor:\t\t"+color+"\nFilled:\t\t"+filled;
}



}


class Square extends Rectangle{
double side;
public Square() {}

public Square(double side) {
super();
this.side = side;
}

public Square(double side,String color,Boolean filled) {
super();
this.side=side;
}

public void setWidth(double width) {
this.width = width;
}
public void setLength(double length) {
this.length = length;
}

@Override
double getArea() {
	return side*side;
}
@Override
double getPerimeter() {
	return 4*side;
}
public String toString() {
return "\nSide:\t"+side+"\nWidth:\t"+width+"\nLength:\t"+length+"\nColor:\t\t"+color+"\nFilled:\t\t"+filled+"\nArea of square:\t"+getArea()+"\nPerimeter of square:\t"+getPerimeter();
}

}

public class oopAbstract {

	public static void main(String[] args) {
		Shape s1=new Circle(1.5, "green", true);
		System.out.println(s1.toString());
		
		
		
		Shape s2=new Rectangle(4.5, 3, "blue", false);
		System.out.println(s2.toString());
		
		
		Shape s3=new Square(1.2, "Grey", true);
		System.out.println(s3.toString());
	
	}

}
