package javdemo;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Original String");
		String original = Sc.nextLine();
		String palindrome = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			palindrome += original.charAt(i);
		}
		if (original.equals(palindrome)) {
			System.out.println("The String is palindrome");
		} else {
			System.out.println("The String is not palindrome");
		}
		Sc.close();
	}

}
