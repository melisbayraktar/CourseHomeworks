package firstHomeworks;

import java.util.Scanner;

public class MidNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter three number ");

		int nmOne = scan.nextInt();
		int nmTwo = scan.nextInt();
		int nmThree = scan.nextInt();

		int res = midFinder(nmOne, nmTwo, nmThree);
		scan.close();
		System.out.println("Middle number is: " +res);
	}

	public static int midFinder(int numOne, int numTwo, int numThree) {

		int middle = 0;
		if (numTwo >= numOne && numOne >= numThree || numThree >= numOne && numOne >= numTwo) {
			middle = numOne;
		}

		else if (numOne >= numTwo && numTwo >= numThree || numThree >= numTwo && numTwo >= numOne) {
			middle = numTwo;
		}

		else if (numOne >= numThree && numThree >= numOne || numTwo >= numThree && numThree >= numOne) {
			middle = numThree;
		}

		return middle;
	}

}
