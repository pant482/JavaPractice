import java.util.Scanner;

public class GradeAssigner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int marks = scanner.nextInt();

		if (marks >= 90 && marks <= 100) {
			System.out.println("A+ Grade");
		}

		else if (marks >= 70 && marks <= 89) {
			System.out.println("B+ Grade");
		}

		else if (marks >= 60 && marks <= 69) {
			System.out.println("First Division");
		}

		else if (marks >= 33 && marks <= 59) {
			System.out.println("Just passed");
		}

		else if (marks >= 0 && marks <= 32) {
			System.out.println("Fail");
		}

		else {
			System.out.println("Invalid input");
		}
		scanner.close();
	}
}
