package curs4;

import java.util.Scanner;

public class CalificativePunctaje {

	public static void main(String[] args) {
		 
		
		int punctaj;
	    String calificativ;
	    
	       Scanner scan =  new Scanner(System.in);
	       System.out.println("Introdu punctajul: ");
	       punctaj = scan.nextInt();
	       scan.close();
			/*
			 * calificativ = (punctaj >= 90) ? "Foarte Bine" : (punctaj>=80) ? "Bine" :
			 * "Suficient";
			 * 
			 * System.out.println("Ai primit : " + calificativ);
			 */
	      
	      calificativ = (punctaj>=90)?"FB":(punctaj<90&&punctaj>=80)?"B":"S";

	      String message = (calificativ == "FB" )? "Ai primit : FoarteBine" : (calificativ == "B") ?"Ai primit : Bine":"Ai primit : Suficient";
	      System.out.println(message);

	}

}
