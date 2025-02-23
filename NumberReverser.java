public class NumberReverser {
	public static void main(String[] args) {
		int n = 14642;
		int reverse = 0;

		for (int i = n; i > 0; i = i / 10) {
			reverse = reverse * 10 + i % 10;
		}
		System.out.println("\n" + reverse);
	}
}
