/**
    Write a program to convert state of Long instance into byte, 
short, int, long, float and double.

 */

 class Long_Status{
    public static void main(String[] args){
        long a = 122;
        Long l = new Long(a);
        //byteValue of the Long Object
        byte bv = l.byteValue();
        // printing the output
        System.out.println("byte value of "+ a + " is : " + bv);

        //shortValue of the Long Object
        short sv = l.shortValue();
        // printing the output
        System.out.println("Short value of "+ a + " is : " + sv);

        // intValue of the Long Object
        int iv = l.intValue();
        // printing the output
        System.out.println("Integer value of "+ a + " is : " + iv);

        // longValue of the Long Object
        long lv = l.longValue();
        // printing the output
        System.out.println("Long value of "+ a + " is  : " + lv);

        // floatValue of the Long Object
        float fv = l.floatValue();
        // printing the output
        System.out.println("Float value of "+ a + " is  : " + fv);

        // doubleValue of the Long Object
        double dv = l.doubleValue();
        // printing the output
        System.out.println("Double value of "+ a + " is : " + dv);
    }
}