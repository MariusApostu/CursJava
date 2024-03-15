package curs5;

import java.util.Scanner;

/*
 * O pangramă (din limba greacă παν γραμμα, „toate literele”) sau „propoziție holoalfabetică” 
 * este un text care folosește toate literele alfabetului unei limbi
 * 
 * facem un program care verifica daca un text este pangram.
 * 
 */

public class PangramCheck {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		String text = "The quick brown fox jumps over the lazy dog.".toLowerCase();
		        //     01234...
		//text.indexOf(0);
		//System.out.println(text.indexOf('h'));
		/*
		 * char litera = 'a'; //litera++; //System.out.println(litera);
		 
			for(int i=0; i<100; i++) {
			System.out.println(++litera);
		}*/
		
		boolean estePangram = true;
		for (char ch='a'; ch<='z'; ch++) {
			if(text.indexOf(ch) == -1) {
				estePangram = false;
				break;
			}
		}
		
		System.out.println(estePangram ? "textul este pangram" : "textul nu este pangram");

	}

}
