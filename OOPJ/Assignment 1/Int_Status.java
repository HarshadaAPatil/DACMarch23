/**
    Write a program to convert state of Integer instance into 
    byte, short, int, long, float and double.
 */
class Int_Status{
    public static void main(String[] args){
        int a = 122;
        Integer i = new Integer(a);
        //byteValue of the Integer Object
        byte bv = i.byteValue();
        // printing the output
        System.out.println("byte value of "+ a + " is : " + bv);

        //shortValue of the Integer Object
        short sv = i.shortValue();
        // printing the output
        System.out.println("Short value of "+ a + " is : " + sv);

        // intValue of the Integer Object
        int iv = i.intValue();
        // printing the output
        System.out.println("Integer value of "+ a + " is : " + iv);

        // longValue of the Integer Object
        long lv = i.longValue();
        // printing the output
        System.out.println("Long value of "+ a + " is  : " + lv);

        // floatValue of the Integer Object
        float fv = i.floatValue();
        // printing the output
        System.out.println("Float value of "+ a + " is  : " + fv);

        // doubleValue of the Integer Object
        double dv = i.doubleValue();
        // printing the output
        System.out.println("Double value of "+ a + " is : " + dv);
    }
}