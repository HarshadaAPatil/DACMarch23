/**
Write a program to perform below operations on byte type to 
get:
    a. The number of bits used to represent a byte value
    b. The number of bytes used to represent a byte value
    c. The minimum value a byte
    d. The maximum value a byte

 */
class Byte_Type{
    public static void main(String a[]){
        System.out.println("The number of bits used to represent a byte value    :: "+Byte.SIZE);
        System.out.println("The number of bytes used to represent a byte value   :: "+Byte.BYTES);
        System.out.println("The minimum value a byte                             ::"+Byte.MIN_VALUE);
        System.out.println("The maximum value a byte                             :: "+Byte.MAX_VALUE);
    }
}