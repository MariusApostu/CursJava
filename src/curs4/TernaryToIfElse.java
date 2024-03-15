package curs4;

public class TernaryToIfElse {

	public static void main(String[] args) {
		int comision;
		int vanzari = 1500;
		
		comision = (vanzari>2500) ? vanzari * 5/100 : 0;
		
		System.out.println("comisionul tau este : " + comision);
		
		if (vanzari > 2500) {
			comision = vanzari * 5/100;
			System.out.println("comisionul tau este : " + comision);
		}else {
			comision = 0;
			System.out.println("comisionul tau este : " + comision);
		}
		
		
		
	

	}

}
