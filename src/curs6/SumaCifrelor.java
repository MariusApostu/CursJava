package curs6;

import java.util.Scanner;

/* Scriem un program care calculeaza suma cifrelor unui numar.
 * Numarul in primim de la tastatura.
 * 
 * Ex; Daca user-ul introduce numarul : 334
 * Suma numerelor este 10
 * 
 */

public class SumaCifrelor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int suma = 0;
		System.out.println("introduceti numarul: ");
		
		int numar = scan.nextInt();
		int digit;
		scan.close();
		
		while (numar>0) {
			digit = numar % 10;
			  	suma = suma + digit;
			  	numar = numar / 10;			  	
		}
		System.out.println("suma cifrelor este: " + suma);

	}

}
