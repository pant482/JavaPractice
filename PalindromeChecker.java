import java.util.Scanner;

public class JavaProject {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		int originalNumber = num;
		int reverse = 0;

		for (int temp = num; temp != 0; temp /= 10) {
			int digit = temp % 10;
			reverse = reverse * 10 + digit;
		}

		if (originalNumber == reverse) {
			System.out.println("It's a palindrome number");
		}

		else {
			System.out.println("It's not a palindrome number");
		}

		scanner.close();
	}
}
