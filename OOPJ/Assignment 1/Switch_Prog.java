/**
   Pass integer, float and double value from command line. Parse 
it appropriately and perform arithmetic operations (+,-,*,/)
on it. Here you can you switch case. 
 */
import java.util.*;

 public class Switch_Prog{
    public static void main(String args[]){
        int num1=Integer.parseInt(args[0]);
        float num2=Float.parseFloat(args[1]);
        double num3=Double.parseDouble(args[2]);
        int ch;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Operations to perform: ");
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Mult");
            System.out.println("4. Div");
            System.out.println("5. Exit");
            System.out.println("Enter you choice : ");
            ch=sc.nextInt();
            switch(ch){
                case 1: System.out.println("The Addition is : "+(double)(num1+num2+num3));
                break;
                case 2: System.out.println("The Substraction is : "+(double)(num1-num2-num3));
                break;
                case 3: System.out.println("The Multiplication is : "+(double)(num1*num2*num3));
                break;
                case 4: System.out.println("The Division is : "+(double)((num1/num2)/num3));
                break;
                default: System.out.println("Please enter valid choice");

            }


        }while(ch<5);
    }
 }