package curs5;

/*
 *Scriem un program care verifica daca un string exte palindrom. 
 *Untext este palindrom atunci cand citit de la final are acelasi inteles ca atunci cand este citit de la inceput
 *Exemplu : radar
 *Folosim FOR
 */

public class Palindrom {

	public static void main(String[] args) {

		// radar

		String cuvant = "caiac";
		String cuvantIntors = "";

		for (int i = cuvant.length() - 1; i >= 0; i--) {
			cuvantIntors = cuvantIntors + cuvant.charAt(i);
		}	
		System.out.println(cuvantIntors.equals(cuvant) ? "Cuvantul " + cuvantIntors + " este palindrom" : "Cuvantul nu este palindrom");

		
		/*
		 * if(cuvantIntors.equals(cuvant)) {
		 * System.out.println("Cuvantul este palindrome"); } else {
		 * System.out.println("Cuvantul nu este palindrome"); }
		 */
		

		// NU MERGE! X(

		/*
		 * boolean estePalindrom = true; for (int i = cuvant.length()-1; i >=0; i--) {
		 * if(cuvant.indexOf(i) == -1) { estePalindrom = false; break; } }
		 * 
		 * System.out.println(estePalindrom ? "cuvantul este palindrom" :
		 * "cuvantul nu este palindrom");
		 */
	}

}
