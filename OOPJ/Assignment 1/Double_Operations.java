/**
    Write a program to find minimum and maximum number as well as 
to add two double numbers using methods of Double
 */

  class Double_Operations{
    public static void main(String[] a){
        double num1=13.76, num2=23.233;
        System.out.println("Maximum using max class level method : "+Double.max(num1,num2));
        System.out.println("Minimum using min class level method : "+Double.min(num1,num2));
        System.out.println("Addition using sum class level method : "+Double.sum(num1,num2));
    }

}