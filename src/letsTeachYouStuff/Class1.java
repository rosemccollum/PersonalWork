package letsTeachYouStuff;

public class Class1 {
/*
 * So instance fields are fields you put at the top of your class
 * these are typically PRIAVTE, what that means is that only methods inside of this
 * class can access the variables listed up top. There are some other things like 
 * PUBLIC and STATIC but that's for later in the year. So when Mr.O wants instance fields
 * that just means that you should have variables up here. The benefit of instance fields
 * is that you don't have to declare the same variables throughout each method.
 */
	private int dabs;
	private int yeets;
	private final int FUCKSGIVEN = 0;
/*
 * i'm not sure if you've learned about constants yet, but its variables that you cannot
 * change, so in this case, fucksgiven will never change from 0, and can never be made 
 * into anything BUT 0. it is never changed. Typical naming conventions state that
 * they are in all caps
 */
	
	public Class1() {
		/*
		 * this is a default constructor. when the program is run it runs this by default
		 * this is typically used to initialize variables and shit.
		 */
		dabs = 5;
		yeets = 7;
	}
	
	public Class1(int xDabs, int xYeets) {
		/*
		 * this is an alternate constructor. as the name suggests it is an alternate
		 * for the normal constructor. if you call the class "Class1" from the 
		 * main method, and you initialize it, normall it looks like this:
		 * 
		 * Class1 kek = new Class1();
		 * 
		 * however, if you want certain variables to be set on class construction, you
		 * can use alternate constructors, such as this. So then your initialize statement 
		 * looks like this
		 * 
		 * Class 1 skeet = new Class1(8, 0);
		 * 
		 * This will send the value "8" to the first variable in the list(xDabs) and the value
		 * "0" to the second variable in the list (xYeets). You then typically set xDabs to dabs
		 * and xYeets to yeets because thats the variables you want, in more advanced programming
		 * you can do other stuff but this is the basics
		 */
		dabs = xDabs;
		yeets = xYeets;
	}
	
	public int getDabs() {
		return dabs;
		/*
		 * accessor methods are used to get information from various classes back to
		 * the main class. In this case, in the main method, when I call .getDabs(), it 
		 * will return whatever value 'dabs' has.
		 */
	}
	public int getYeets() {
		return yeets;
		/*
		 * this is also an acessor method, it returns the value of yeets.
		 * acessor methods do not change the value of any variables, they are just used
		 * for grabbing and returning variable values.
		 */
	}
	
	
	
	public void setDabs(int xDabs) {
		dabs = xDabs;
		/*
		 * This is a mutator method. It gets passed a value for 'dabs' then changes it.
		 * these methods do not return anything, they just change the value of variables.
		 */
		return;
	}
	public void setYeets(int xYeets) {
		yeets = xYeets;
		/*
		 * this is the same, it does not return anything, just sets the value to whatever
		 * u pass in.
		 */
		return;
	}
}
