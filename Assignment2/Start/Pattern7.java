public class Pattern7{
	public static void main(String a[]){
		int i;
		for (i=0; i<5; i++) //outer loop for number of rows(n) 
		{ 
			for (int j=5-i; j>1; j--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
            for (int j=1; j<=i+1; j++ ) //inner loop for number of columns
            { 
                System.out.print(j+" "); //print star
            } 
  
            System.out.println(); //ending line after each row
        }
	}
}
