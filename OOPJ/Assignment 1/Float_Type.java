/**
    Write a program to perform below operations on float type to 
get: 
a. The number of bits used to represent a float value
b. The number of bytes used to represent a float value
c. The minimum value a float
d. The maximum value a float

 */

class Float_Type{
    public static void main(String a[]){
        System.out.println("The number of bits used to represent a float value    :: "+Float.SIZE);
        System.out.println("The number of bytes used to represent a float value   :: "+Float.BYTES);
        System.out.println("The minimum value a float                             ::"+(float)Float.MIN_VALUE);
        System.out.println("The maximum value a float                             :: "+(float)Float.MAX_VALUE);
    }
}