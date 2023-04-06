/**
    Write a program to convert state of Double instance into byte, 
short, int, long, float and double.
 */

class Double_Status{
    public static void main(String[] args){
        double a = 12.342;
        Double d = new Double(a);
        //byteValue of the Double Object
        byte bv = d.byteValue();
        // printing the output
        System.out.println("byte value of "+ a + " is : " + bv);

        //shortValue of the Double Object
        short sv = d.shortValue();
        // printing the output
        System.out.println("Short value of "+ a + " is : " + sv);

        // intValue of the Double Object
        int iv = d.intValue();
        // printing the output
        System.out.println("Integer value of "+ a + " is : " + iv);

        // longValue of the Double Object
        long lv = d.longValue();
        // printing the output
        System.out.println("Long value of "+ a + " is  : " + lv);

        // floatValue of the Double Object
        float fv = d.floatValue();
        // printing the output
        System.out.println("Float value of "+ a + " is  : " + fv);

        // doubleValue of the Double Object
        double dv = d.doubleValue();
        // printing the output
        System.out.println("Double value of "+ a + " is : " + dv);
    }
}