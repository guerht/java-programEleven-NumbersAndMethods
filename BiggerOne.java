/*
 * Project: BiggerOne.java
 * Description: Returns the bigger of 2 user input numbers
 * Author: Seunghoon Park
 * Date: 23 September, 2015
 */
import java.util.Scanner;
public class BiggerOne {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter the first number: ");
		num1 = scan.nextInt();
		System.out.println("Enter the second number: ");
		num2 = scan.nextInt();
		System.out.println(isBigger(num1, num2) + " is the bigger number");
	}
	public static int isBigger(int x, int y) {
		if (x == y) {
			return x;
		}
		else if (x > y) {
			return x;
		}
		else {
			return y;
		}
	}
}