/**
Write a program to perform below operations on Boolean type to 
convert:
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance.
*/class Boolean_casting{
    public static void main(String a[]){
        boolean flag=false;
        String str=Boolean.toString(flag);
        System.out.println("boolean value into String (Boxing) : "+ str);
        System.out.println("boolean value into Boolean instance : "+ Boolean.valueOf(flag));
        String str2="true";
        System.out.println("String value into boolean value (Unboxing) : "+ Boolean.parseBoolean(str2));
        System.out.println("String value into Boolean instance : "+ Boolean.valueOf(str2));
    }
}