public class Pattern2{
	public static void main(String a[]){
		for(int i=1;i<=5;i++){
			for(int j=5-i;j>=1;j--){
				System.out.print(" ");
			}
			for(int j=1; j<i+1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}