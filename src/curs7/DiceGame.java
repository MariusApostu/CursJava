package curs7;

import java.util.Scanner;

/*
 * Facem un joc de zaruri in care avem urmatoarele reguli:
 * 1. Daca userul da in total una dintre valorile 2, 6, 11 --> Pierde Jocul --> facem exit
 * 2. Daca userul da in total una dintre valorile 8, 12 --> Castiga jocul --> facem exit
 * 3. Daca userul da in total una dintre valorile 3, 9 --> Repeta automat aruncarea
 * 4. Daca userul da orice alta varianta decat cele de mai sus, il intrebam daca vrea sa mai dea inca odata
 * Raspunsul trebuie sa fie de forma yes - no si mapam in spate pe un true - false 
 * Daca raspunde Nu, facem exit. Daca raspunde da, o luam de la capat
 * 
 * 
 */

public class DiceGame {

	public static void main(String[] args) {
		
		boolean incercare = true;
				
		while (incercare) {
			int dice = (int) (Math.random() * 6 + 1);
			
			int dice2 = (int) (Math.random() * 6 + 1);
			
			int total = dice + dice2; 
			if(total == 2 || total == 6 || total == 11) {
				System.out.println("Imi pare rau! Ai dat " + total + " Ai pierdut jocul");
				break;
			}else if (total == 8 || total == 12 ) {
	            System.out.println("Felicitari! Ai dat: " + total + " Ai castigat jocul!!!");
	            break;				
			}else if (total == 3 || total == 9) {
				System.out.println("Ai dat " + total + " Automat mai dai odata" );
				continue;
			}else {
				System.out.println("ai dat " + total);
				boolean continuare = true;
				while(continuare) {					
				System.out.println("Mai vrei sa continui jocul?");
				Scanner scan = new Scanner (System.in);
				String raspuns = scan.next().toLowerCase();
				
				
				//incercare = scan.next().equalsIgnoreCase("da") ? incercare==true : incercare == false;
				
				if (raspuns.equals("da")) {
					incercare = true;
					continuare = false;
					
				}else if (raspuns.equals("nu")) {
					incercare = false;
					continuare = false;
				}else {
					System.out.println("Raspuns invalid! Raspunde cu Da sau Nu");
					continuare = true;
				}
				//scan.close();	
				}		
			}
		}
		System.out.println("Game Over!");
	

	}

}
