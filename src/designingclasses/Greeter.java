package designingclasses;

public class Greeter {

	private String name = " ";
	private int age;
	
	public Greeter(){
		age = 0;
		name = "Hello";
	}
	public Greeter (String xName, int xAge){
		name = xName;
		age = xAge;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}
