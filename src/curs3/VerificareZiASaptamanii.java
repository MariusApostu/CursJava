package curs3;

import java.util.Scanner;

/*
 * Program care verifica daca suntem intr-o zi lucratoare sau in weekend!
 * Daca suntem in zi lucratoare, printam: Este zi lucratoare :(
 * Daca suntem in weekend, printam: Este weekend! YAY!
 * Daca nu este o zi valida, printam: Ziua nu exista!
 * 
 */

public class VerificareZiASaptamanii {
	
	int zi;
	
	public void askTheUserForADay() {
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		zi = scan.nextInt();
		scan.close();
	}
	
	public void checkWeekday() {
		askTheUserForADay();
		 if(zi >= 1 && zi <=5) {
			 System.out.println("Este zi lucratoare :( ");
		 }else if(zi == 6 || zi == 7) {
			 System.out.println("Este weekend! YAY!");			 
		 }else {
			 System.out.println("Ziua nu exista!");
		 }
	}

}
