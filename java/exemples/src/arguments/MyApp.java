package arguments;

public class MyApp {

	public static void main(String[] args) 
	{
		
		for(int i = 0; i < args.length; i++) {
			System.out.println("L'argument N°" + i + " vaut "+ args[i]);
		}
		
		for(int i = 0; i < args.length; i++) {
			
			String sentence;;
			
			sentence = String.format("L'argument %d vaut %s.", i, args[i]);
			
			System.out.println(sentence);
		}

	}

}
