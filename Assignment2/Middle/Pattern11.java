public class Pattern11{
	public static void main(String a[]){
		for(int j=1;j<5;j++){
			for(int i=1;i<=j;i++){
				System.out.print(" ");
			}
			for(int i=1;i<=5;i++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}