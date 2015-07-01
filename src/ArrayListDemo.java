
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList_Solution<Integer> arr = new ArrayList_Solution<Integer>();
		
		System.out.println("Adding 0-25 to end of list");
		for (int i = 0; i < 25; i++) {
			arr.addLast(i);
			System.out.println(arr);
		}
		System.out.println();
		
		System.out.println("Removing all elements from end of list");
		for (int i = 0; i < 25; i++) {
			arr.removeLast();
			System.out.println(arr);
		}
		System.out.println();
		
		System.out.println("Adding 0-25 to start of list");
		for (int i = 0; i < 25; i++) {
			arr.addFirst(i);
			System.out.println(arr);
		}
		System.out.println();
		
		System.out.println("Removing all elements from start of list");
		for (int i = 0; i < 25; i++) {
			arr.removeFirst();
			System.out.println(arr);
		}
		System.out.println();
		
		System.out.println("Adding 0-25 in random positions");
		for (int i = 0; i < 25; i++) {
			// position is any int from 0 to length of arr (inclusive)
			int position = (int) (Math.random() * (arr.length() + 1));
			arr.add(i, position);
			System.out.println("Adding "+i+" at position " + position);
			System.out.println(arr);
		}
		System.out.println();
		
		System.out.println("Removing all elements from random positions");
		for (int i = 0; i < 25; i++) {
			// position is any int from 0 to length of arr (exclusive)
			int position = (int) (Math.random() * arr.length());
			int valueRemoved = arr.remove(position);
			System.out.println("Value removed from position " + position+ ": "+valueRemoved);
			System.out.println(arr);
		}
		System.out.println();
	}
}
