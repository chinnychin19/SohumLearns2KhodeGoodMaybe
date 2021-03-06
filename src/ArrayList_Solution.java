
public class ArrayList_Solution<T> {
	private Object[] myArray;
	private int mySize;
	
	public ArrayList_Solution() {
		this(5); // this calls the constructor below,
		// which accepts a variable initial amount of memory
	}
	
	public ArrayList_Solution(int initialMemory) {
		// initialize empty myArray
		this.myArray = new Object[initialMemory];
		
		// initialize mySize variable
		this.mySize = 0;
	}
	
	// returns the number of objects stored in the list
	// note: this will be <= the length of this.myArray
	public int length() {
		return this.mySize;
		// return the correct size
	}
	
	// gets element at position i
	// returns null if out of bounds
	public T get(int i) {
		if (i < 0 || i >= this.mySize) {
			return null;
		}
		return (T) this.myArray[i];
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
	
	// inserts object at position i
	// returns false if i is invalid location
	public boolean add(T object, int i) {
		if (i < 0 || i > this.mySize) {
			return false;
		}
		
		if (this.myArray.length == this.mySize) {
			this.doubleMemory();
		}
		
		// shift all objects after i forward by one space
		for (int x = this.mySize; x > i; x--) {
			this.myArray[x] = this.myArray[x-1];
		}
		
		// assign object i
		this.myArray[i] = object;
		
		this.mySize++;
		return true;
		
		// insert object at position i
		// return true if successful and false if unsuccessful
		// should be unsuccessful if i is an invalid location
	}
	
	// removes and returns object at position i
	// return null if i is invalid location
	public T remove(int i) {
		if (i < 0 || i >= this.mySize) {
			return null;
		}
		
		T out = (T) this.myArray[i];
		
		// shift everything after i back one position
		// (this will also overwrite value at i)
		for (int x = i; x < this.mySize - 1; x++) {
			this.myArray[x] = this.myArray[x+1];
		}
		
		this.mySize--;
		return out;
		
		// remove and return the object at position i
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
	
	
	// doubles the size of the memory block being used for the private raw array
	private void doubleMemory() {
		Object[] newArray = new Object[this.myArray.length * 2];
		for (int i = 0; i < this.myArray.length; i++) {
			newArray[i] = this.myArray[i];
		}
		this.myArray = newArray;
	}
}
