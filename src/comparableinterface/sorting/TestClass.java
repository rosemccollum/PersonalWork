package comparableinterface.sorting;

import java.util.ArrayList;
import java.util.Random;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <WorkerStart> thing = new ArrayList<WorkerStart>();
		for (int i = 0; i < 100; i++) {
			int min = 0;
			int max = 100;
			Random generator = new Random();
			int random = min + generator.nextInt(max - min + 1);
			thing.add(new WorkerStart(random, random));
		}
		
	}

}
