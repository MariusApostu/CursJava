package curs5;

import java.util.Scanner;

/*
 *Scriem un program face conversie din grade celsius in grade farenheit.
 *Intrebam userul cate temperaturi vrea sa transforme
 *Pentru fiecare temperatura transormam gradele celsius in farneheit si printam
 *Exemplu :
 *Temperatura Celsius de 56.0 grade este in Farenheit 132.8 grade
 */

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int calcule;
		double celsius = 0;
		double fahrenheit = 0;
		
		System.out.println("Cate calcule vrei sa faci? ");
		calcule = scan.nextInt();
		
		for (int i=0 ; i<calcule; i++) {	
			System.out.println("Introdu temperatura in grade celsius ");
		celsius = scan.nextInt();
		fahrenheit = (celsius * 9/5) + 32;
		System.out.println( "Temperatura Celsius de " + celsius + " de grade este in Farenheit " + fahrenheit + " grade");
			
	}
		

	}

}
