public class Inverted_Pyramid_Pattern6{
	public static void main(String a[]){
		int i;
		for( i=9;i>=1;i--){
			for(int k=9;k>i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(" *");
			}
			System.out.println();
		}	
	}
}