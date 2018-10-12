package objectprogramming;

public class Worker {
private int hours;
private double pay;
private double salary;
private double raise;
public Worker()
{
	hours = 40;
	pay = 13.5;
}
public Worker(int newHours, double newPay)
{
	hours = newHours;
	pay = newPay;
}
public int getHours()
{
	return hours;
}
public double getPay()
{
	return pay;
}
public double payCheck()
{
	return salary = hours*pay;
}
public void changePay(double raise)
{
	pay = pay+raise;
}
public double getNewpay()
{
	return pay;
}
}
