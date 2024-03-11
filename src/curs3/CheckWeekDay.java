package curs3;

import java.util.Scanner;

/*
 * Program care intreaba utilizatorul ce zi este astazi.
 * Utilizatorul trebuie sa introduca un numar de la 1 -7
 * Daca introduce zero – printam “Te rog sa introduci un numar mai mare ca 0”
 * Daca introduce 1 – printam “Astazi este luni”
 * Daca introuce 2 – Printam ”Astazi este marti”
 * Si tot asa pana duminica
 * Daca introduce un numar mai mare ca 7 printam : ”Saptamana are doar 7 zile, te rog sa introduci un numar valid”
 */

public class CheckWeekDay {
	int valoare;
	String zi;
	
	public void askTheUserForDayNumber() {
		System.out.println("Introdu numarul zilei din saptamana: ");
		Scanner scan = new Scanner(System.in);
		valoare = scan.nextInt();
		scan.close();		
	}
	
	public void checkTheWeekDay() {
		askTheUserForDayNumber();
		if (valoare <=0) {
			System.out.println("Te rog sa introduci un numar mai mare ca 0!");
		}else if (valoare == 1) {
			zi = "Luni";
			System.out.println("Astazi este Luni!");			
		}else if (valoare == 2) {
			zi = "Marti";
			System.out.println("Astazi este Marti!");			
		}else if (valoare == 3) {
			zi = "Miercuri";
			System.out.println("Astazi este Miercuri!");			
		}else if (valoare == 4) {
			zi = "Joi";
			System.out.println("Astazi este Joi!");			
		}else if (valoare == 5) {
			zi = "Vineri";
			System.out.println("Astazi este Vineri!");			
		}else if (valoare == 6) {
			zi = "Sambata";
			System.out.println("Astazi este Sambata!");			
		}else if (valoare == 7) {
			zi = "Duminica";
			System.out.println("Astazi este Duminica!");			
		}else {
			System.out.println("Saptamana are doar 7 zile, te rog sa introduci un numar valid");
		}
		
	}

}
