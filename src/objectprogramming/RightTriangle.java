package objectprogramming;

public class RightTriangle {
	private int height;
	private int base;
	private double hypot;
	private double area;
	private double perimeter;
public RightTriangle()
{
	height = 5;
	base = 4;
}
public RightTriangle(int newHeight, int newBase)
{
	height = newHeight;
	base = newBase;
}
public double getHypot()
{
	return hypot = (Math.sqrt((height*height)+(base*base)) );
}
public double getArea()
{
	return area = (.5 * height * base);
}
public double getPerimeter()
{
	return perimeter = hypot + base + height;
}
}
