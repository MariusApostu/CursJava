package curs2;

public class TestRectangle {

	public static void main(String[] args) {
/*
		Rectangle obiect = new Rectangle(); 
		obiect.latime = 5;
		obiect.lungime = 3;
		obiect.inaltime = 2;
		System.out.println(obiect.calculArie(obiect.lungime, obiect.latime));
		
		Rectangle obiect2 = new Rectangle(); 
		obiect2.lungime = 4;
		obiect2.latime = 3;
		System.out.println(obiect2.calculArie(obiect2.lungime, obiect2.latime));
		*/
		
		Rectangle obiect3 = new Rectangle(8, 12); 
		System.out.println(obiect3.calculArie());
		System.out.println(obiect3.afiseazaCuloareDreptunghi());
		//obiect3.calculPerimetru(2.0,12);
		

		Rectangle dreptunghi = new Rectangle ();
		dreptunghi.latime = 8;
		dreptunghi.lungime = 3;
		dreptunghi.inaltime = 2;
		dreptunghi.culoare = "alb";
		System.out.println(dreptunghi.afiseazaCuloareDreptunghi());
	
		
	

		
	}

}