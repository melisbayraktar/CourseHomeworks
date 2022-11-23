package firstHomeworks;

import java.util.Scanner;

public class SorterExample {

	public static void main(String[] args) {

		sorter();

	}

	public static void sorter() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter three number for sorting process: ");

		int numOne = scan.nextInt();
		int numTwo = scan.nextInt();
		int numThree = scan.nextInt();
		scan.close();

		int max = Math.max(Math.max(numOne, numTwo), numThree);
		int min = Math.min(Math.min(numOne, numTwo), numThree);
		int mid = numOne + numTwo + numThree - max - min;

		if (min < mid) {
			System.out.print(min + " < " + mid);
		} else if (min == mid) {
			System.out.print(min + " = " + mid);
		}

		if (mid < max) {
			System.out.print(" < " + max);
		} else if (mid == max) {
			System.out.print(" = " + max);
		}
	}

}
