package objectprogramming;

public class Circle {
	private double radius;
	private int circumference = 5;
	private double area = Math.PI * radius * radius;
public Circle()
{
	radius = 4;
}
public Circle(double newRadius)
{
	radius = newRadius;
}
public double returnRadius()
{
	return radius;
}
public double getCircumference()
{
	return circumference;
}
public double getArea()
{
	return area;
}
public void setRadius(double newRadius)
{
	radius = newRadius;
}
}
