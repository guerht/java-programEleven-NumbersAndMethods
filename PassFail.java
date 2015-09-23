/*
 * Project: PassFail.java
 * Description: Returnes true or false if you passed or failed respectively a class or test
 * Author: Seunghoon Park
 * Date: 23 September, 2015
 */
import java.util.Scanner;
class PassFail {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int userScore;
		System.out.println("Enter your PSAT score: ");
		userScore = scan.nextInt();
		System.out.println("Passed: " + checkPassed(userScore));
	}
	public static boolean checkPassed (int psatScore) {
		if (psatScore > 320 && psatScore <= 1520) {
			if (psatScore < 320) {
				return false;
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}
}