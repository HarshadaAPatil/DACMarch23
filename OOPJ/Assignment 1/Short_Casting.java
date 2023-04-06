/**
    Write a program to convert:
        a. short value into String
        b. short value into Short instance.
        c. String instance into Short instance.
 */

class Short_Casting{
    public static void main(String a[]){
        short num=111;
        String str=Short.toString(num);
        System.out.println("short value into String (Boxing) : "+ str);
        System.out.println("short value into Short instance : "+ Short.valueOf(num));
        String str2="112";
        System.out.println("String value into short value (Unboxing) : "+ Short.parseShort(str2));
        System.out.println("String value into Short instance : "+ Short.valueOf(str2));
    }
}