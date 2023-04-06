/**
    Write a program to perform below operations on Double type to 
get: 
a. The number of bits used to represent a double value
b. The number of bytes used to represent a double value
c. The minimum value a double
d. The maximum value a double
 */

 class Double_Type{
    public static void main(String a[]){
        System.out.println("The number of bits used to represent a integer value    :: "+Double.SIZE);
        System.out.println("The number of bytes used to represent a integer value   :: "+Double.BYTES);
        System.out.println("The minimum value a integer                             ::"+(double)Double.MIN_VALUE);
        System.out.println("The maximum value a integer                             :: "+(double)Double.MAX_VALUE);
    }
}