public class Pattern7{
	public static void main(String a[]){
		for(int j=1;j<=5;j++){
			for(int i=1;i<=5-j;i++){
				System.out.print(" ");
			}
			for(int i=1;i<=(2*j)-1;i++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print(" ");
		for(int j=4;j>=1;j--){
			for(int i=1;i<=(2*j)-1;i++){
				System.out.print("*");
			}
			System.out.println();
			for(int i=0;i<=5-j;i++){
				System.out.print(" ");
			}
		}
	}
}