package firstHomeworks;

import java.util.Scanner;

public class SignumExample {

	public static void main(String[] args) {
		int num = scanMethod();
		System.out.println(signum(num));
	}

	public static int signum(int num) {
		int res;
		if (num > 0)
			res = 1;
		else if (num < 0)
			res = -1;
		else
			res = 0;

		return res;
	}

	public static int scanMethod() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int num = Integer.parseInt(scan.nextLine());
		scan.close();
		return num;
	}

}
