/**
    Write a program to convert:
        a. int value into String
        b. int value into Integer instance.
        c. String instance into Integer instance.
        d. int value into binary, octal and hexadecimal string.

 */
class Int_Casting{
    public static void main(String a[]){
        int num=111;
        System.out.println("integer value into String (Boxing) : "+ Integer.toString(num));
        System.out.println("integer value into Integer instance : "+ Integer.valueOf(num));
        String str2="112";
        System.out.println("String instance into Integer instance : "+ Integer.valueOf(str2));
        System.out.println("int value into binary : "+Integer.toBinaryString(num));
        System.out.println("int value into hexadecimal : "+Integer.toHexString(num));
        System.out.println("int value into octal : "+Integer.toOctalString(num));

    }
}