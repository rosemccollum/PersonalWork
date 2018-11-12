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
	if (radius <= 0) // this is an unacceptable value 
	{
		radius=10; // assign it an acceptable value (not the best way to deal with this but baby steps)
		// this makes is so your radius value will always be acceptable
	}
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
	return area = Math.PI * radius * radius;
}
public void setRadius(double newRadius)
{
	radius = newRadius;
}
}
