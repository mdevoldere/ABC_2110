package Majeur;

public class Programme {

	public static void main(String[] args) {

		direBonjour();
		direBonjour();
		
		int ageATester = 17;
		
		String resultat = estIlMajeur(ageATester);
		
		System.out.println(resultat);
		
		int annee = lireAnnee();
		
		System.out.println(annee);
		

	}
	
	public static void direBonjour() 
	{
		System.out.println("Bonjour");
		return;
	}
	
	public static int lireAnnee() 
	{
		System.out.println("année: ");
		return 2022;
	}
	
	public static String estIlMajeur(int age)
	{
		if(age >= 18) {
			return "Majeur !";
		}
		else {
			return "";
		}
	}

}
