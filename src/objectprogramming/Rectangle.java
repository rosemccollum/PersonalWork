package objectprogramming;

public class Rectangle {
private double length;
private double width;
private double perimeter;
private double area;

public Rectangle()
{
	length = 4;
	width = 5;
}
public Rectangle(double newLength, double newWidth)
{
	length = newLength;
	width = newWidth;
}
public double returnLength()
{
	return length;
}
public double returnWidth()
{
	return width;
}
public double getPerimeter()
{
	return perimeter = (2*length) + (2*width);
}
public double getArea()
{
	return area = length*width;
}
public void changeLength(double newLength)
{
	length = newLength;
}
public void changeWidth(double newWidth)
{
	width = newWidth;
}
}
