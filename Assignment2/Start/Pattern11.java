public class Pattern11{
	public static void main(String args[])
{
int i, j, space;
space = 5 - 1;
for (j = 1; j<= 5; j++)
{
for (i = 1; i<= space; i++)
{
System.out.print(" ");
}
space--;
for (i = 1; i <= 2 * j - 1; i++)
{
System.out.print("*");
}
System.out.println();
}

System.out.println("");
}
}

