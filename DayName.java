/*
 * Project: DayName.java
 * Description: Prints the name of the day of the week of an int input
 * Author: Seunghoon Park
 * Date: 23 September, 2015
 */
import java.util.Scanner;
public class DayName {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int day;
		System.out.println("Enter a number to find the day of the week: ");
		day = scan.nextInt();
		System.out.println("Today is day No." + day + ": " + getName(day));	
	}
	public static String getName(int day) {
		switch (day) {
			case 1:
				return "Sunday";
			case 2:
				return "Monday";
			case 3:
				return "Tuesday";
			case 4:
				return "Wednesday";
			case 5:
				return "Thursday";
			case 6:
				return "Friday";
			case 7:
				return "Saturday";
			default:
				return "ERROR NOT A DAY NUMBER";
		}
	}
}