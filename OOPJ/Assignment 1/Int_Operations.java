/**
    Write a program to find minimum and maximum number as well as 
to add two integer numbers using methods of Integer.

 */

class Int_Operations{
    public static void main(String[] a){
        int num1=76, num2=23;
        System.out.println("Maximum using max class level method : "+Integer.max(num1,num2));
        System.out.println("Minimum using min class level method : "+Integer.min(num1,num2));
        System.out.println("Addition using sum class level method : "+Integer.sum(num1,num2));
        // System.out.println("Max : "+((num1>num2)?num1:num2));
        // System.out.println("Min : "+((num1<num2)?num1:num2));
    }

}