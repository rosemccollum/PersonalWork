package strings;

import java.util.ArrayList;

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
			System.out.println(yeet.get(i));
		}
		ArrayList<Friend> skeet = new ArrayList<Friend>();
		skeet.add(new Friend("Angela",18));
		skeet.add(new Friend("Billy",17));
		skeet.add(new Friend("Joey",15));
		skeet.add(new Friend("Jane", 16));
		for (int i = 0; i < skeet.size(); i++) {
			String age = skeet.getAge(); //fix this
			System.out.println(skeet.get(i));
		}
	}
}
