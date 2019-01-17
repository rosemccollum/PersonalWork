package interfaces.polymorphism;

import java.util.ArrayList;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> school = new ArrayList<Person>();
		school.add(new Teacher());
		school.add(new Student());
		for (Person i:school) {
		if (i instanceof Student) {
			Student kid = (Student)i;
			kid.outSick();
		}
		}
		for (Person j:school) {
			//System.out.println(j.getName()); //whyyyyyy
		}
	}

}
