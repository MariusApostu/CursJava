package curs7;

import java.util.Scanner;

/*
 * Scriem un program care simuleaza validarea unui cod PIN
 * Programul primeste input de la utilizator un PIN si il compara cu un PIN default care are valoarea 2244
 * Are trei incercari de acces
 * Atata timp cat incearca de trei ori si PIN este gresit programul va printa: 
 * "Maximum attempts reached. Card blocked"
 * Pentru fiecare incercare gresit programul printeaza: "Wrong PIN"
 * Daca PIN este valid programul printeaza: "Access granted"
 */
public class PinCodeValidator {
	Scanner scan = new Scanner (System.in);
	int enteredPin;
	int correctPin = 2244;
	int numberOfTries = 0;
		
	
		
	public void validatePIN() {
						
		do  {
			System.out.println("Please enter you PIN: ");
			enteredPin = scan.nextInt();
			numberOfTries++;
			if(correctPin == enteredPin) {
			System.out.println("Acces Granted");
			break;
		}else{
			System.out.println("Wrong PIN!");
		}	
	}while(numberOfTries<3);
		
		if (numberOfTries ==3 && enteredPin != correctPin) {
			System.out.println("Maximum attempts reached. Card blocked!");
		}
	
	}
	
}
