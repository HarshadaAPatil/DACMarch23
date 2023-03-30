public class Pattern13{
	public static void main(String a[]){
		int alphabet = 65; 
		for (int i = 1; i <= 5; i++) { 
			
			for (int j = 5; j > i; j--)
        {
            System.out.print(" ");
        }
		//alphabet++;
        for (int k = 1; k <= i; k++)
        {
            System.out.print((char) (alphabet) + " ");
			
        }
		alphabet++;
        System.out.println();
    }
	}
}
