/**
    Write a program to perform below operations on long type to 
get: 
a. The number of bits used to represent a long value
b. The number of bytes used to represent a long value
c. The minimum value a long
d. The maximum value a long
 */

class Long_Type{
    public static void main(String a[]){
        System.out.println("The number of bits used to represent a long value    :: "+Long.SIZE);
        System.out.println("The number of bytes used to represent a long value   :: "+Long.BYTES);
        System.out.println("The minimum value a long                             ::"+(long)Long.MIN_VALUE);
        System.out.println("The maximum value a long                             :: "+(long)Long.MAX_VALUE);
    }
}