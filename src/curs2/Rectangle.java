package curs2;

public class Rectangle {
	
	int lungime;
	int latime;
	int inaltime;
	String culoare;
	
	public int calculArie() {
		
		return lungime * latime;
	}
	
	
	public int calculPerimetru(int lungime, int latime) {
	
	 return 2 * (lungime + latime);
	}
	
	//constructor default
	public Rectangle() {}
	
	public Rectangle(int lungime, int latime, String culoare) {
		this.lungime = lungime;
		this.latime = latime;
		this.culoare = culoare;
	}
	
	public String afiseazaCuloareDreptunghi() {
		return culoare;
	}



}