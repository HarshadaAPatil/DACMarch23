/**
   .Write a program to convert state of Short instance into byte, 
short, int, long, float and double.

 */
class Short_Status{
    public static void main(String[] args){
        short a = 122;
        Short s = new Short(a);
        //shortValue of the Short Object
        byte bv = s.byteValue();
        // printing the output
        System.out.println("byte value of "+ a + " is : " + bv);

        //shortValue of the Short Object
        short sv = s.shortValue();
        // printing the output
        System.out.println("Short value of "+ a + " is : " + sv);

        // intValue of the Short Object
        int iv = s.intValue();
        // printing the output
        System.out.println("Integer value of "+ a + " is : " + iv);

        // longValue of the Short Object
        long lv = s.longValue();
        // printing the output
        System.out.println("Long value of "+ a + " is  : " + lv);

        // floatValue of the Short Object
        float fv = s.floatValue();
        // printing the output
        System.out.println("Float value of "+ a + " is  : " + fv);

        // doubleValue of the Short Object
        double dv = s.doubleValue();
        // printing the output
        System.out.println("Double value of "+ a + " is : " + dv);
    }
}