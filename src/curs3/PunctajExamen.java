package curs3;

import java.util.Scanner;

/*
 * Program care intreaba utilizatorul punctajul unui test.
 * Daca utilizatorul introduce o valoare intre 0 si 65 atunci printeaza ”Ai picat. Mai incearca”
 * Daca utilizatorul introduce o valoare mai mare sau egala cu 66 atunci printeaza ”Felicitari, Ai trecut”
 */


public class PunctajExamen {
	
	int score;
	
	public void askTheUserForScore() {
		System.out.println("Introdu punctajul: ");
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		scan.close();
	}
	
	public void checkUserScore() {
		askTheUserForScore();
		if (score >= 0 && score <=65) {
		System.out.println("Ai picat. Mai incearca!");	
		}else if (score >=66 && score <=100){
		System.out.println("Felicitari, Ai trecut");			
		}else {
		System.out.println("Invalid! Te rog sa introduci un punctaj intre intre 0 si 100!");	
		}
	}
	

}
