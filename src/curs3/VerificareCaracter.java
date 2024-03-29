package curs3;

import java.util.Scanner;

/*
 * Facem un program care verifica daca userul a introdus o litera
 * Daca a introdus litera, printam: caracterul este o litera!
 * Daca a introdus alcteceva, printam: caracterul nu este o litera!
 */

public class VerificareCaracter {
	
	char caracter;
	
	/*
	 * Char
	 * String
	 * 
	 * televizor
	 * 012345678
	 * 
	 * televizor.charAT(5) == i
	 * 
	 */
	
	public void askTheUserForACharacter() {
		System.out.println("Please enter a character: ");
		Scanner scan = new Scanner(System.in);
		caracter = scan.next().charAt(0);
		scan.close();
	}
	
	public void checkIfCharacterIsLetter() {
		askTheUserForACharacter();
		if(Character.isLetter(caracter)) {
			System.out.println("caracterul este o litera!");
		}else {
			System.out.println("caracterul nu este o litera!");
		}
	}

}
