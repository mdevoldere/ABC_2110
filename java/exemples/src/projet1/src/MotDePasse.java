import java.util.Scanner;

public class MotDePasse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		String pswd;
		int tries =0;
		boolean pswdok = false;
		
	
		do {
			System.out.println("veuillez entrer le mot de passe");
			pswd = sc.nextLine();
			tries++;
			
			/*if(pswd.equals("Bonjour"))  {
				pswdok = true;	
			}*/
			
			pswdok = pswd.equals("Bonjour");
			
		}
		while (!pswdok && (tries<3));
		
			if (pswdok) { 
			System.out.println("vous etes connecte");
			
			}
			else {
				System.out.println("vous n'etes pas connecte");
			}
		}
		
		
		
	} // fin du main


