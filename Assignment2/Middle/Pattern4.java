public class Pattern4{
	public static void main(String a[]){
		for(int i=0;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print("*");
			}
			System.out.println();
			for(int j=1;j<=i+1;j++){
				System.out.print(" ");
			}
		}
	}
}