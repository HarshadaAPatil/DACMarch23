/**
Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.
  */
class Byte_Casting{
    public static void main(String[] a){
        byte num=122;
        System.out.println("byte value into String (Boxing)    :"+Byte.toString(num));
        System.out.println("byte value into Byte instance      :"+Byte.valueOf(num));
        String str="124";
        System.out.println("String instance into Byte instance :"+Byte.valueOf(str));
    }
}