
public class ArrayList<T> {
	private Object[] myArray;
	private int mySize;
	
	public ArrayList() {
		this(5); // this calls the constructor below,
		// which accepts a variable initial amount of memory
	}
	
	// TODO
	public ArrayList(int initialMemory) {
		// initialize empty myArray with initialMemory elements
		
		// initialize mySize variable (for an empty list, the size is 0)
	}
	
	// TODO
	// returns the number of objects stored in the list
	public int length() {
		return 0;
		// return the correct size
	}
	
	// TODO
	// gets element at position i
	// returns null if out of bounds
	public T get(int i) {
		return null;
		// return the object at location i
		// if i is out of bounds, return null
	}
	
	// adds object to front of list
	public boolean addFirst(T object) {
		return this.add(object, 0);
	}
	
	// adds object to end of list
	public boolean addLast(T object) {
		return this.add(object, this.mySize);
	}
	
	// removes object from front of list
	public T removeFirst() {
		return this.remove(0);
	}
	
	// removes object from end of list
	public T removeLast() {
		return this.remove(this.mySize-1);
	}
	
	// TODO
	// inserts object at position i
	// returns false if i is invalid location
	public boolean add(T object, int i) {
		return true;
		// insert object at position i
		// don't forget to update size!!!
		// return true if successful and false if unsuccessful
		// should be unsuccessful if i is an invalid location
	}
	
	// TODO
	// removes and returns object at position i
	// return null if i is invalid location
	public T remove(int i) {
		return null;
		// remove and return the object at position i
		// don't forget to update size!!!
		// if i is invalid, return null
	}
	
	// returns string of form "[0, 1, 2, 3, 4, 5]"
	public String toString() {
		if (this.mySize == 0) {
			return "[]";
		}
		String out = "["+this.myArray[0];
		for (int i = 1; i < this.mySize; i++) {
			out += ", "+this.myArray[i];
		}
		return out + "]";
	}
	
	
	// TODO
	// doubles the size of the memory block being used for the private raw array
	private void doubleMemory() {
		// create a new array of twice the size of myArray
		// copy existing elements to the new array
		// assign myArray to this new array
	}
}
