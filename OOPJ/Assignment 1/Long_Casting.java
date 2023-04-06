/**
    Write a program to convert:
        a. long value into String
        b. long value into Long instance.
        c. String instance into Long instance.
        d. long value into binary, octal and hexadecimal string.
 */

class Long_Casting{
    public static void main(String a[]){
        long num=111000111;
        System.out.println("long value into String (Boxing) : "+ Long.toString(num));
        System.out.println("long value into Long instance : "+ Long.valueOf(num));
        String str2="112";
        System.out.println("String instance into long instance : "+ Long.valueOf(str2));
        System.out.println("long value into binary : "+Long.toBinaryString(num));
        System.out.println("long value into hexadecimal : "+Long.toHexString(num));
        System.out.println("long value into octal : "+Long.toOctalString(num));

    }
}