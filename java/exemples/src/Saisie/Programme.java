package Saisie;

import java.util.Scanner;

public class Programme {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		String saisie = "12 mi";
		// comment séparer "12" et "mi" ?
			
		
		String[] tableau = new String[3];
		
		tableau[0] = "A";
		tableau[1] = "Mike";
		tableau[2] = "12";
		
		System.out.println(
			"Le 2ème élément du tableau est : " + tableau[1] +
			" sur un total de " + tableau.length + " éléments"
		);
		
		int dernierIndice = tableau.length -1;
		
		//System.out.println(tableau[dernierIndice]);	
		
		
		for(int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
		}
		
	}

}
