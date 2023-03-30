public class Pattern13{
	public static void main(String a[]){
		for(int j=1;j<=5;j++){
			for(int i=1;i<j;i++){
				System.out.print(" ");
			}
			for(int i=5;i>=j;i--){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++){
			for(int j=5;j>i;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}