
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) { // This will go out of bounds!
			arr.add((int) (Math.random() * 50), i);
		}
		
		System.out.println(arr);
	}
}
