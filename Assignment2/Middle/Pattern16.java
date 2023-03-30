public class Pattern16{
	public static void main(String a[]){
		for(int j=1;j<=5;j++){
			for(int i=5;i>j;i--){
			System.out.print(" ");
			}
			 for (int k=1; k<=j; k++)
            {
                if( k == 1 || k == j || j == 5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
			System.out.println();
		}
		
	}
}