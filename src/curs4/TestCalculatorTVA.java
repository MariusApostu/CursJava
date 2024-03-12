package curs4;

public class TestCalculatorTVA {

	public static void main(String[] args) {

		CalculatorTVA produs1 = new CalculatorTVA(19);
		CalculatorTVA produs2 = new CalculatorTVA(5);
		CalculatorTVA produs3 = new CalculatorTVA(9);
		
		double rezultat1 = produs1.calculeazaTVA(200);
		double rezultat2 = produs2.calculeazaTVA(30);
		double rezultat3 = produs3.calculeazaTVA(44);
		
		System.out.println("rezultat produs1 = " + rezultat1);
		System.out.println("rezultat produs2 = " + rezultat2);
		System.out.println("rezultat produs3 = " + rezultat3);
		
		System.out.println("Numar total de calcule: " + CalculatorTVA.getCounterGlobal());




		
		
	}

}
