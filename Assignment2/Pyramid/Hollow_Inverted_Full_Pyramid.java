public class Hollow_Inverted_Full_Pyramid{
	public static void main(String a[]){
		int i,j,k,cnt=0;
		for (i = 1; i <= 6; i++) // row=6
        {
            // Print spaces
            for (j = i; j < 6; j++) {
                System.out.print("  ");
            }
            // Print *
			for(k=0;k<=(2*i-1);k++){
            //while (k != (2 * i - 1)) {
                if (k == 0 || k == 2 * i - 2)
                    System.out.print("*  ");
                else if(i==6  )
				{System.out.print(" *  "); cnt++;
					if(cnt==5)
						break;
				}
				else
					System.out.print("  ");
                //k++;
            }
           // k = 0;
            System.out.println();
			//for (j= 1; j<=6; j++) {
			//}
        }
        // print last row
        
    }
}