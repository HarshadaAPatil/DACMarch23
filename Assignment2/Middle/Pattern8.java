public class Pattern8{
	public static void main(String a[]){
		for(int j=1;j<5;j++){
			for(int i=1;i<=j;i++){
				System.out.print("*");
		}System.out.println();}
		for(int j=1;j<=5;j++){
			for(int i=5;i>=j;i--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}