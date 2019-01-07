package designingclasses;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HardDrive bob = new HardDrive ("hi" , 32.0 , 24.0);
		bob.addFile(42.4);
		bob.addFile(312.3);
		bob.addFile(42.32);
		bob.addFile(423.3);
		bob.deleteFile(2);
		System.out.println(bob.isEmpty());
		System.out.println(bob.isFull());
		System.out.println(bob.returnSize());
		
	}

}
