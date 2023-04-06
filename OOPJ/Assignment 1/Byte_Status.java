/**
    Write a program to convert state of Byte instance into byte, 
short, int. long, float and double.

 */
class Byte_Status{
    public static void main(String[] args){
        byte a = 122;
        Byte b = new Byte(a);
        //byteValue of the Byte Object
        byte bv = b.byteValue();
        // printing the output
        System.out.println("Byte value of "+ a + " is : " + bv);

        //shortValue of the Byte Object
        short sv = b.shortValue();
        // printing the output
        System.out.println("Short value of "+ a + " is : " + bv);

        // intValue of the Byte Object
        int iv = b.intValue();
        // printing the output
        System.out.println("Integer value of "+ a + " is : " + iv);

        // longValue of the Byte Object
        long lv = b.longValue();
        // printing the output
        System.out.println("Long value of "+ a + " is  : " + lv);

        // floatValue of the Byte Object
        float fv = b.floatValue();
        // printing the output
        System.out.println("Float value of "+ a + " is  : " + fv);

        // doubleValue of the Byte Object
        double dv = b.doubleValue();
        // printing the output
        System.out.println("Double value of "+ a + " is : " + dv);
    }
}