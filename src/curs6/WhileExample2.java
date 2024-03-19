package curs6;

import java.util.Scanner;

/*
 * facem un program care calculeaza salariul pe o saptamana
 * intrebam userul cate ore a lucrat 
 * calculam doar daca a lucrat maxim 40 ore si minim 1 ora
 * daca introduce un numar invalid de ore il rugam sa introduca din nou pana introduce un numar valid
 * rate per hour = 25
 */

public class WhileExample2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("cate ore ai lucrat? ");
		
		int oreLucrate = scan.nextInt();
		
		while (oreLucrate < 1 || oreLucrate > 40) {
			System.out.println("Nr de ore inavlid");
			System.out.println("Introdu un numar valid de ore :");
            oreLucrate = scan.nextInt();
		}
		
		System.out.println("Salariu de plata este : " + oreLucrate*25);
		
		scan.close();

	}

}
