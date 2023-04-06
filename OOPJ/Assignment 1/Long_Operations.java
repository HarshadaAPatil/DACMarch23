/**
    Write a program to find minimum and maximum number as well as 
to add two long numbers using methods of Long.
 */
class Long_Operations{
    public static void main(String[] a){
        long num1=1376, num2=23233;
        System.out.println("Maximum using max class level method : "+Long.max(num1,num2));
        System.out.println("Minimum using min class level method : "+Long.min(num1,num2));
        System.out.println("Addition using sum class level method : "+Long.sum(num1,num2));
    }

}