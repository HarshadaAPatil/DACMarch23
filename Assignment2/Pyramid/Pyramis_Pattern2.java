public class Pyramis_Pattern2{
	public static void main(String args[]){
		for(int i=1;i<10;i++){
			for(int j=10-i;j>=1;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}