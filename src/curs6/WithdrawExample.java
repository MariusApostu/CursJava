package curs6;
/*
 * avem un sold de 1000
 * vreau sa retrag din sold
 * nu pot retrage toata suma sau mai mult decat am in sold
 * vreau sa intreb userul cat vrea sa retraga si fac asta pana introduce o valoare valida
 */

import java.util.Scanner;

public class WithdrawExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ce suma vrei sa retragi?:");

		int sold = 1000;
		int sumaRetrasa =  scan.nextInt();
		
		while(sumaRetrasa < 1 || sumaRetrasa >= sold) {
			
			System.out.println("Suma indisponibila. Introdu alta suma:");
			sumaRetrasa =  scan.nextInt();
		}
		
		System.out.println("Va rugam ridicati banii!");
		System.out.println("Noul sold este " + (sold-sumaRetrasa));
		
		scan.close();
		
		
		

	}

}
