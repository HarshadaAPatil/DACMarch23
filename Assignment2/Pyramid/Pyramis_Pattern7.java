public class Pyramis_Pattern7{
	public static void main(String a[]){
		for(int j=9;j>=1;j--){
			for(int i=1;i<=9-j;i++){
				System.out.print(" ");
			}
			for(int i=1;i<=j;i++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		/*for(int j=2;j<=5;j++){
			for(int i=5;i>=j;i--){
				System.out.print(" ");
			}
			for(int i=1;i<=j;i++){
				System.out.print(" *");
			}
			System.out.println();
		}*/
		
	}
}