package javdemo;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Original String");
		String original = Sc.nextLine();
		String reverse = " ";
		for (int i = 0; i < original.length(); i++) {
			reverse = original.charAt(i) + reverse;}
		
			System.out.println("The revesed string is " + reverse);
			Sc.close();

		}

	}

