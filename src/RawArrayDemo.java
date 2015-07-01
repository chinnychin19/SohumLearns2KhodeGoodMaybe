
public class RawArrayDemo {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length * 2; i++) {
			arr[i] = (int) (Math.random() * arr.length);
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
