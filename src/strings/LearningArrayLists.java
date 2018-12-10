package strings;

import java.util.ArrayList;
import java.util.Random;

public class LearningArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> yeet = new ArrayList<String>();
		yeet.add(new String("Angela"));
		yeet.add(new String("Billy"));
		yeet.add(new String("Joey"));
		yeet.add(new String("Jane"));
		for (int i = 0; i < yeet.size(); i++) {
			String name = yeet.get(i);
			// System.out.println(yeet.get(i));
		}
		ArrayList<Friend> skeet = new ArrayList<Friend>();
		skeet.add(new Friend("Angela", 18));
		skeet.add(new Friend("Billy", 17));
		skeet.add(new Friend("Joey", 15));
		skeet.add(new Friend("Jane", 16));
		for (int i = 0; i < skeet.size(); i++) {
			// String age = skeet.getAge(); //fix this
			// System.out.println(skeet.get(i));
		}
		int length;
		int width;
		int min = 50;
		int max = 70;
		Random generator = new Random();
		ArrayList<Rectangle> lit = new ArrayList<Rectangle>();
		for (int i = 0; i <= -4; i++) {
			length = min + generator.nextInt(max - min + 1);
			width = min + generator.nextInt(max - min + 1);
			lit.add(new Rectangle(length, width));
		}
		for (int j = lit.size() - 1; j > 0; j--) {
			// System.out.println(lit.get(j).returnArea());
		}
		ArrayList<String> names = new ArrayList<String>();
		names.add(new String("Angela"));
		names.add(new String("Christian"));
		names.add(new String("Dobi"));
		names.add(new String("Kenny"));
		names.remove(0);
		names.remove(names.size() - 1);
		System.out.println(names);
	}
}

		
