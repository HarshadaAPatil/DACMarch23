public class Pattern10{
	public static void main(String a[]){
		int i;
		for (i = 5; i >= 1; i--) 
        {
			int alphabet=64;
             for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = i; k <= 5; k++)
            {
                System.out.print((char)(k+alphabet)+" ");
            }
              
            System.out.println();
        }
	}
}
