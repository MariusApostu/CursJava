package curs5;

import java.util.Scanner;

/*
 * Scriem un program care intreaba utilizatorul un numar si printeaza tabla inmultirii acelui numar de la 1 la 10
 * Exemplu :
 * Please enter a number: 
 * 3
 * Printam :
 * 3 * 1 = 3
 * 3 * 2 = 6
 * 3 * 3 = 9
 * 3 * 4 = 12
 * 3 * 5 = 15
 * ----etc
 * Nota : Folosim instructiunea for.
 */

public class TablaInmultirii {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int multiply = 0;
		int numar;
		
		System.out.println("Please enter number ");
		numar = scan.nextInt();
		
		for (int i=1 ; i<=10; i++) {			
			multiply = numar * i ;	
			System.out.println(numar + " * " + i + " = " + multiply);
	}
		

}
	
}
