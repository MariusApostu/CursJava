package curs6;

import java.util.Scanner;

/*
 * Facem un program care ii cere userului numere incontinuu
 * Le inmulteste cu 10 si printeaza
 * Face asta pana cand userul introduce 0
 * cand userul a introdus 0, iese din bucla
 * 
 */
public class ForVsWhile {
	
	
	

	public static void main(String[] args) {
	
		//rezolvareCuFor();
		//rezolvareCuFor2();
		//rezolvareCuWhile();
		rezolvareCuDoWhile();
		
	}
	
	public static void rezolvareCuDoWhile() {
		int i;
		do {
			System.out.println("Please enter a number: ");
			Scanner scan = new Scanner(System.in);
			i = scan.nextInt();
			if(i==0) {
				break;
			}
			i*=10;
			System.out.println(i);
		}while(i != 0);
		
		
	}
		
	public static void rezolvareCuWhile() {
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		
		while (i!=0) {
			i*=10; //i=i*10
			System.out.println(i);
			System.out.println("Please enter a number: ");
			i = scan.nextInt();
			scan.close();
		}
	}


	public static void rezolvareCuFor() {
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		
		for (int i = scan.nextInt(); i !=0; i = scan.nextInt()) {
			i*=10; //i=i*10
			System.out.println(i);
			System.out.println("Please enter a number: ");
			scan.close();
		}
	}
	
//SAU (alta rezolvare cu for)
	
	public static void rezolvareCuFor2() {
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			int i = scan.nextInt();
			if (i==0) {
				break;
			}i*=10; //i=i*10
			System.out.println(i);
			System.out.println("Please enter a number: ");
			scan.close();
		}
	}
	
}
