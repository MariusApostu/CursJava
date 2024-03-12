package curs4;

import java.util.Scanner;

//var = (conditia) ? expresie daca true : expresie daca false

public class TernaryOperator {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number");
		int num1 = scan.nextInt();	
		System.out.println("Please enter the second number");
		int num2 = scan.nextInt();		
		scan.close();
		if (num1>0) {
			System.out.println("Num1 este pozitiv");
		}else {
			System.out.println("Num1 este negativ");
		}
		
		// var = conditie ? true : false
		
		String result = (num1 > 0) ? "Num1 este pozitiv" : "Num1 este negativ";
		System.out.println(result);
		
		//verific daca num1 si num2 sunt pozitive
		result = num1 > 0 && num2 > 0 ? "ambele sunt pozitive" : "unul din numere este negativ";
		System.out.println(result);
		
		//verific care numar este mai mare si daca sunt egale
		if (num1 > num2) {
			System.out.println("num1 este mai mare");
		}else if(num1==num2){
			System.out.println("numerele sunt egale");			
		}else {
			System.out.println("num2 este mai mare");
		}
		
		result = num1 == num2 ? "numerele sunt egale" : num1>num2 ? "num1 este mai mare" : "num2 este mai mare";
		System.out.println(result);
	}

}
