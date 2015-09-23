/*
 * Project: TableOfBases.java
 * Description: Prints a table of Decimal, Binary, Octal, Hex, ASCII characters
 * Author: Seunghoon Park
 * Date: 23 September, 2015
 */
public class TableOfBases {
	public static void main(String args[]) {
		System.out.println("TABLE OF BASES");
		System.out.println("Decimal\tBinary\tOctal\tHex\tASCII");
		for (int i = 65; i <= 90; i++) {
			System.out.println(i + "\t" + Integer.toBinaryString(i) + "\t" + Integer.toOctalString(i) + "\t" + Integer.toHexString(i) + "\t" + (char)i);
		} 		
	}
}