/**
Write a program to perform below operations on char type to 
get:
a. The number of bits used to represent a char value
b. The number of bytes used to represent a char value
c. The minimum value a char
d. The maximum value a char
 */

class Char_Type{
    public static void main(String a[]){
        System.out.println("The number of bits used to represent a Character value    :: "+Character.SIZE);
        System.out.println("The number of bytes used to represent a Character value   :: "+Character.BYTES);
        System.out.println("The minimum value a Character                             :: "+(int)Character.MIN_VALUE);
        System.out.println("The maximum value a Character                             :: "+(int)Character.MAX_VALUE);
    }
}