package JavaHomeWork1;

import java.util.Scanner;

public class java9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter any num: ");
		int num = scan.nextInt();

		// apply conditions using if, else if and else
		if (num < 1) {
			System.out.println("incorrect num");
		} else if (num >= 1 && num <= 12) {
			System.out.println("It is Morning");
		} else if (num > 12 && num <= 16) {
			System.out.println("It is Afternoon");
		} else if (num > 16 && num < +20) {
			System.out.println("It is Evening");
		} else if (num > 20 && num < +24) {
			System.out.println("It is Night");
		} else {
			System.out.println("incorrect num");
		}
	}
}
