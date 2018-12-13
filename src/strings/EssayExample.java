package strings;

public class EssayExample {
	private String name;
	private String text;

	public EssayExample() {

	}

	public void setName(String newname) {
		name = newname;
	}

	public void setText(String newtext) {
		text = newtext;
	}

	public String getLastName() {
		String lastname = " ";
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ' ') {
				lastname = name.substring(index + 1, name.length());
			}
		}
		return lastname.toUpperCase();
	}

	public int getFirstName() {
		int count = 0;
		for (int index = 0; name.charAt(index) != ' '; index++) {
			count = count + 1;
		}
		return count;
	}

	public boolean getX() {
		return name.contains("x");
	}

	public int getTextCount() {
		int words = 0;
		for (int index = 0; index < text.length(); index++) {
			if (text.charAt(index) == ' ') {
				words++;
			}
		}
		return words+1;
	}

}
