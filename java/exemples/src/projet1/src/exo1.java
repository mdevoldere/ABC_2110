package projet1;

import java.util.Scanner;

public class exo1 {
	
	public static void main(String[] args) {
		
		// VARIABLES
		int min = 5;
		int max = 10;
		int nombre;
		Scanner sc;
		
		// DEBUT PROGRAMME
		System.out.println("ecrire un nombre entre 5 et 10");
		
		sc = new Scanner(System.in);
		
		nombre = sc.nextInt();
		
		if (nombre<min) {
			System.out.println ("trop petit");
		}
		else if (nombre > max) {
			System.out.print("trop grand");
		}
		else {
			System.out.print("OK");
		}
		
		sc.close();
		
	} // fin de la méthode main()
} // fin class 
