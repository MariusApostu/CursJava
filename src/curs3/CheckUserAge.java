package curs3;

import java.util.Scanner;

/*
 * Program care intreaba utilizatorul ce varsta are.
 * Daca utilizatorul introduce o valoare sub 18 , printeaza ”Esti minor”
 * Daca utilizatorul introduce o valoare intre 18 si 65, printeaza ”Esti adult”
 * Daca utilizatorul introduce o valoare peste 65 , printeaza ”Esti batran”
 */

public class CheckUserAge {
	
int age;
	
	public void askTheUserForAge() {
		System.out.println("Introduceti varsta: ");
		Scanner scan = new Scanner(System.in);
		age = scan.nextInt();
		scan.close();
	}
	
	public void checkTheUserAge() {
		askTheUserForAge();
		if (age > 0 && age < 18) {
			System.out.println("Esti minor!");			
		}else if (age >= 18 && age <= 65) {
			System.out.println("Esti adult!");			
		}else if (age >65) {
			System.out.println("Esti batran!");			
		}else {
			System.out.println("Varsta trebuie sa fie mai mare decat 0!");
		}
	}

}
