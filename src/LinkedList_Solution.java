
public class LinkedList_Solution<T> {
	private Node<T> head;
	//private Node<T> tail;
	private int length;
	
	public LinkedList_Solution() {
		this.head = null;
		//this.tail = null;
		this.length = 0;
	}
	
	// returns the number of objects stored in the list
	// note: this will be <= the length of this.myArray
	public int length() {
		return this.length;
		// return the correct size
	}
	
	// gets element at position i
	// returns null if out of bounds
	public T get(int i) {
		if (i < 0 || i >= this.length) {
			return null;
		}
		
		Node<T> cur = head;
		for (int p = 0; p < i; p++) {
			cur = cur.getNext();
		}
		
		return cur.getValue();
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
		if (i < 0 || i > this.length) {
			return false;
		}
		
		if (i == 0) {
			this.head = new Node<T>(object, this.head);
			this.length++;
			return true;
		}
		
		// at this point, we know i > 0, so that means length > 0
		Node<T> cur = head; // guaranteed not null
		for (int p = 1; p < i; p++) {
			cur = cur.getNext();
		}
		cur.setNext(new Node<T>(object, cur.getNext()));
		
		this.length++;
		return true;
		
		// insert object at position i
		// return true if successful and false if unsuccessful
		// should be unsuccessful if i is an invalid location
	}
	
	// removes and returns object at position i
	// return null if i is invalid location
	public T remove(int i) {
		if (i < 0 || i >= this.length || this.length == 0) {
			return null;
		}
		
		if (i == 0) {
			T out = this.head.getValue();
			this.head = this.head.getNext();
			this.length--;
			return out;
		}
		
		// at this point, we know i > 0 and length > 0
		Node<T> cur = head; // guaranteed not null
		for (int p = 1; p < i; p++) {
			cur = cur.getNext();
		}
		T out = cur.getNext().getValue();
		cur.setNext(cur.getNext().getNext());
		
		this.length--;
		return out;
		
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