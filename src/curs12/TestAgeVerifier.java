package curs12;

import java.util.Scanner;

public class TestAgeVerifier {

	public static void main(String[] args) {
		
		AgeVerifier obj = new AgeVerifier();
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter you age: ");
		int age = scan.nextInt();
		
		try {
			obj.checkAgeLimit(age);
		} catch (InvalidAgeException e) {
			System.out.println("Invalid age to vote!");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("code after");

	}

}
