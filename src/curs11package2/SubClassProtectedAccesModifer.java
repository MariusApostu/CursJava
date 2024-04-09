package curs11package2;

import curs11package1.ProtectedAccesModifier;

public class SubClassProtectedAccesModifer extends ProtectedAccesModifier{
 //sub class different package: yes
	public static void main(String[] args) {

		SubClassProtectedAccesModifer obj =  new SubClassProtectedAccesModifer();
		obj.printMesaj();
		
	}

}
