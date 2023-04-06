/**
    Telephone Bill Calculation
    You are required to write a Java program to calculate the telephone bill for a given customer based
    on their usage. The program should take the following inputs from the user:
        a. Customer name
        b. Phone number
        c. Number of calls made
        d. Duration of calls (in minutes)
    The program should then calculate the bill for the customerbased on the following criteria:
        a. The first 100 calls are charged at a rate of 50 cents per call.
        b. Calls beyond the first 100 are charged at a rate of 25 cents per call.
        c. All calls are subject to a minimum duration of 1 minute.
        d. Calls with a duration less than 1 minute are rounded up to 1 minute.
        e. There is a flat rate of $10 per month for all customers.
 */
import java.util.*;
class TelephoneDir{
    private String customerName;
    private long phoneNumber;
    private int numberOfCallsMade;
    private float durationOfCallsMade;

    void setCustomerName(String customerName){
        this.customerName=customerName;
    }

    void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    void setNumberOfCallsMade(int numberOfCallsMade){
        this.numberOfCallsMade=numberOfCallsMade;
    }

    void setDurationOfCallsMade(float durationOfCallsMade){
        if(durationOfCallsMade<1){
            durationOfCallsMade=Math.round(durationOfCallsMade);
        }
        this.durationOfCallsMade=durationOfCallsMade;
    }
    
    //Getter

    String getCustomerName( ){
        return this.customerName;
    }

    long getPhoneNumber( ){
        return this.phoneNumber;
    }

    int getNumberOfCallsMade( ){
        return this.numberOfCallsMade;
    }

    float getDurationOfCallsMade( ){
        return this.durationOfCallsMade;
    }
    void calculateBillAmount(){
        double bill=10;
        if(this.getNumberOfCallsMade() <=100){
            bill+=this.getNumberOfCallsMade()*0.5;
        }
        else
        {
            bill+=(100*0.5)+((this.getNumberOfCallsMade()-100)*0.25);
        }
        System.out.println("The Bill is : "+bill);
    }
}
class TelephoneBill{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        TelephoneDir td= new TelephoneDir();
        System.out.println("Enter customer details : ");
        System.out.print("Enter customer name : ");
        td.setCustomerName(sc.nextLine());
        System.out.print("Enter customer phone number : ");
        td.setPhoneNumber(sc.nextLong());
        System.out.print("Enter customer number of calls made : ");
        td.setNumberOfCallsMade(sc.nextInt());
        System.out.print("Enter customer duration of calls (in minutes) : ");
        td.setDurationOfCallsMade(sc.nextFloat());

        td.calculateBillAmount();
    }
}