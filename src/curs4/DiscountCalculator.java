package curs4;

public class DiscountCalculator {

	public static void main(String[] args) {
		
			double total;
			int factura = 90;
			
			total = (factura>=100) ? factura - (factura*0.10) : factura -(factura*0.05);
			
			System.out.println("Totalul de plata este : " + total);

	}

}
