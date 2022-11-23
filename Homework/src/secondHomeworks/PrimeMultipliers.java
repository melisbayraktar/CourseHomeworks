package secondHomeworks;

import java.util.Scanner;

public class PrimeMultipliers {

	public static void main(String[] args) {

		multipliers(scanMethod());

	}

	public static void multipliers(int number) {
		boolean cont = true;
		int i = 2;
		while (cont) {

			if (number % i == 0) {
				number = number / i;
				System.out.print(i + " ");

			} else {
				i++;
			}

			if (i > number) {
				cont = false;
			}

		}

	}

	public static int scanMethod() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int num = Integer.parseInt(scan.nextLine());
		scan.close();
		return num;
	}
}
