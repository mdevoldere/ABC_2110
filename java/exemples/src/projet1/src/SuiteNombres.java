package projet1;

import java.util.Scanner;

public class SuiteNombres {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nombre ;
		nombre = sc.nextInt() ;
		
		System.out.println(nombre) ;
		
		for (int i = 1 ; i <=10 ; i++ ) {
			System.out.println(nombre + i) ;
		}


	}

}
