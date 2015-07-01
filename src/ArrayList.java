
public class ArrayList<T> {
	
	private T[] myArray;
	private int mySize;
	
	public ArrayList() {
		// TODO
		// initialize empty myArray of arbitrary size
		// initialize mySize variable
	}
	
	public int length() {
		return 0;
		// TODO: return the correct size
	}
	
	public T get(int i) {
		return null;
		// TODO: return the object at location i
		// TODO: if i is out of bounds, return null
	}
	
	public boolean add(T object, int i) {
		return true;
		// TODO: insert object at position i
		// TODO: return true if successful and false if unsuccessful
		// should be unsuccessful if i is an invalid location
	}
	
	public T remove(int i) {
		return null;
		// TODO: remove and return the object at position i
		// TODO: if i is invalid, return null
	}
	
	public String toString() {
		if (this.myArray == null) {
			return "null";
		}
		if (this.myArray.length == 0) {
			return "[]";
		}
		String out = "["+this.myArray[0];
		for (int i = 1; i < this.myArray.length; i++) {
			out += ", "+this.myArray[i];
		}
		return out + "]";
	}
}
