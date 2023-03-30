public class Hollow_Inverted_Half_Pyramid{
	public static void main(String a[]){
		for(int j=1;j<=6;j++){
			for(int i=1;i<=6;i++){
				if(j==1 || i==1){
					System.out.print("* ");
				}
				//else 
				//	System.out.print("-");
			}
			for(int i=5;i>j;i--){
			System.out.print("  ");
			}
			 for (int k=1; k<j; k++)
            {
                if( k == 1 && j!=6 )
                    System.out.print("*");
            }
			System.out.println();
		}
	}/*public static void main(String a[]){
		for(int i=6;i>0;i--)
{
 
for(int j=1;j<=6-i;j++)
 
{
System.out.print(" ");
}
if(i==1 || i==6)
for(int j=1;j<=i*2-1;j++)
 
{
System.out.print("*");
}
else
{
for(int j=1;j<=i*2-1;j++)
 
{ 
if(j==1 || j==i*2-1)
System.out.print("*");
else
 
System.out.print(" ");
}
}
System.out.println();
} 
 }*/
}