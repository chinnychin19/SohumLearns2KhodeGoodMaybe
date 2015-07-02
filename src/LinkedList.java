
public class LinkedList<T> {
	private Node<T> head;
	private int length;
	
	public LinkedList() {
		// TODO
	}
	
	// returns the number of objects stored in the list
	// note: this will be <= the length of this.myArray
	public int length() {
		// TODO
		return 0;
		// return the correct size
	}
	
	// gets element at position i
	// returns null if out of bounds
	public T get(int i) {
		// TODO
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
		return this.add(object, this.length);
	}
	
	// removes object from front of list
	public T removeFirst() {
		return this.remove(0);
	}
	
	// removes object from end of list
	public T removeLast() {
		return this.remove(this.length - 1);
	}
	
	// inserts object at position i
	// returns false if i is invalid location
	public boolean add(T object, int i) {
		// TODO
		return true;
		
		// insert object at position i
		// return true if successful and false if unsuccessful
		// should be unsuccessful if i is an invalid location
	}
	
	// removes and returns object at position i
	// return null if i is invalid location
	public T remove(int i) {
		// TODO
		return null;
		
		// remove and return the object at position i
		// if i is invalid, return null
	}
	
	// returns string of form "[0, 1, 2, 3, 4, 5]"
	public String toString() {
		String out = "[";
		for (Node<T> cur = head; cur != null; cur = cur.getNext()) {
			out += cur.getValue();
			if (cur.getNext() != null) {
				out+= ", ";
			}
		}
		return out + "]";
	}
}