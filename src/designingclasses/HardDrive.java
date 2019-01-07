package designingclasses;

import java.util.ArrayList;

public class HardDrive {

	private String name = " ";
	ArrayList <Double> files = new ArrayList<Double>();
	private double totalSpace;
	private double freeSpace;
	public HardDrive (String xName, double xTotal, double xFree) {
		name = xName;
		totalSpace = xTotal;
		freeSpace = xFree;
	}
	public void addFile (double size) {
		files.add(new Double (size));
	}
	public void deleteFile (int index) {
		files.remove(index);
	}
	public boolean isFull() {
		if (freeSpace == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isEmpty() {
		if (freeSpace == totalSpace) {
			return true;
		}
		else {
			return false;
		}
	}
	public int returnSize() {
		return files.size();
	}
	
}
