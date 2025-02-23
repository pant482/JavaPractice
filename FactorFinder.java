import java.util.Scanner;

public class FactorFinder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		System.out.println("The factors of " + num + " are: ");

		int i = 1;

		while (i <= num) {
			if (num % i == 0) {
				System.out.println(i);
			}
			i++;
		}
		scanner.close();
	}
}
