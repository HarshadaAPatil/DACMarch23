/**
    .Write a program to convert:
        a. float value into String
        b. float value into Float instance.
        c. String instance into Float instance.
        d. float value into hexadecimal string.

 */

class Float_Casting{
    public static void main(String a[]){
        float num=10.3f;
        System.out.println("Float value into String (Boxing) : "+ Float.toString(num));
        System.out.println("Float value into Float instance : "+ Float.valueOf(num));
        String str2="11.8f";
        System.out.println("String instance into Float instance : "+ Float.valueOf(str2));
        System.out.println("Float value into hexadecimal : "+Float.toHexString(num));

    }
}