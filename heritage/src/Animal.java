
public class Animal implements IAnimal
{

	static final public int AFFAME = 0;
	static final public int KITKAT = 1;
	static final public int RASSASIE = 2;
	
	
	
	private String espece;
	private int satiete;
	
	public Animal() 
	{
		this.satiete = Animal.KITKAT;
	}
	
	public Animal(String _espece) 
	{		
		this.setEspece(_espece);
	}
	
	public void manger() 
	{
		if(this.satiete == 0) {
			
		}
		
		if(this.satiete == Animal.AFFAME) {
			
		}
		
		
		System.out.println("L'animal mange ! ");
	}
	
	public String getEspece() 
	{
		return this.espece.toUpperCase();
	}
	
	public void setEspece(String nouvelleEspece) 
	{
		this.espece = nouvelleEspece;
	}

}
