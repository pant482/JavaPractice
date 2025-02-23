import java.util.Scanner;

public class JavaProject {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		if (num < 0) {
			System.out.println("Error: Factorial is not defined for negative numbers");
		}

		else {
			int factorial = 1;

			for (int i = 2; i <= num; i++) {
				factorial *= i;
			}

			System.out.println("Factorial of " + num + " is " + factorial);
		}
		scanner.close();
	}
}
