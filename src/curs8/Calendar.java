package curs8;

import java.nio.channels.SelectableChannel;
import java.util.Scanner;

/*
 * Scriem un program care printeaza in consola numele unei luni a anului bazandu-se pe inputul utilizatorului.
 * Intreba untilizatorul un numar si pe baza numarului va printa numele lunii. 
 * Ex : utilizatorul introduce 1 si printeaza Ianuarie
 * Folosim un array pentru numele lunilor
 * Daca ultilzatorul introduce un numar invalid, intreaba din nou pana numarul introdus este valid
 * Pentru numar invalid informeaza utilizatorul print-un mesaj ca numarul este invalid.
 */

public class Calendar {
	
	static String[] lunileAnului = {"Ianuarie","Februarie","Martie","Aprilie","Mai","Iunie","Iulie","August","Septembrie","Octombrie","Noiembrie","Decembrie"};
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
				Calendar luna = new Calendar();
				luna.selecteazaLuna();
		
		
	}
	public void selecteazaLuna() {
	   for(int i=0; i<lunileAnului.length-1; i++) {
	        System.out.println("Introdu ce luna cauti: ");
	        int lunaCautata = scan.nextInt();	        
	        if(lunileAnului[i].equals(lunaCautata)) {
	            System.out.println("Luna cautata " + lunaCautata + " este: " + i);
	        }else {
	            System.out.println("Introdu o valoare de la 1 la 12 pentru luna cautata!");
	        }
	        
	    }
		/*
		 * int i = 0; do { System.out.println("Introdu ce luna cauti: "); int
		 * lunaCautata = scan.nextInt(); if(lunaCautata == lunileAnului.length-1) {
		 * System.out.println("Luna cautata " + lunaCautata + " este :" + i); }else {
		 * System.out.println("Introdu o valoare de la 1 la 12 pentru luna cautata!"); }
		 * i++; } while(i<lunileAnului.length-1);
		 */
        
	} 
	
	}
	

