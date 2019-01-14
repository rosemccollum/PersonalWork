package inheritance;

public class SecondTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball bob = new Basketball();
		System.out.println(bob.method2());
		Storage ann = new Storage();
		System.out.println(ann.method3());
		Box hi = new Box();
		System.out.println(hi.method1());
		//Storage bobi = new Box(); doesn't work because Box doesn't know Storage
		
	}

}
