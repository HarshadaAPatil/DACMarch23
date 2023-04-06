/**
     Electricity Bill Calculation

        Create a class named "ElectricityBill" that has the following instance variables:
            a. customerName (String)
            b. unitsConsumed (double)
            c. billAmount (double)
        Create a constructor that initializes the customerName and unitsConsumed instance variables.
        Define a method named "calculateBillAmount" that calculates the bill amount based on the number of units consumed. The formula for calculating the bill amount is:
            a. For the first 100 units: Rs. 5 per unit
            b. For the next 200 units: Rs. 7 per unit
            c. For the remaining units: Rs. 10 per unit

        Implement the "calculateBillAmount" method in the "ElectricityBill" class.
        Define a main method that creates an object of the "ElectricityBill" class and sets the 
        customerName and unitsConsumed instance variables. Then, call the "calculateBillAmount" 
        method to calculate the bill amount and display the customerName, unitsConsumed, and billAmount.
 */
class ElectricityBill{
    String customerName;
    double unitsConsumed;
    double billAmount;

    ElectricityBill(){

    }
    ElectricityBill(String customerName, double unitsConsumed){
        this.customerName=customerName;
        this.unitsConsumed=unitsConsumed;
    }

    void calculateBillAmount(){
            double unit=this.unitsConsumed;
            if(unit<=100){
                this.billAmount=unit*5;
            }
            else if(unit<=300){
                this.billAmount=(100*5)+((unit-100)*7);
            }
            else if(unit>300){
                this.billAmount=(100*5)+(200*7)+((unit-300)*10);
            }
    }
}
class ElectricityBillCalculate{
    public static void main(String args[]){
        ElectricityBill electricityBill = new ElectricityBill("Harshada", 500.32);
        electricityBill.calculateBillAmount();
        System.out.println("Customer Name : "+electricityBill.customerName);
        System.out.println("Unit Consumed : "+electricityBill.unitsConsumed);
        System.out.println("Bill Amount : "+electricityBill.billAmount);

    }
}



/*
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setUnitsConsumed(double unitsConsumed){
        this.unitsConsumed=unitsConsumed;
    }
    public void setBillAmount(double billAmount){
        this.billAmount=billAmount;
    }
//Getter

    public String getCustomerName( ){
        return this.customerName;
    }
    public double getUnitsConsumed( ){
        return this.unitsConsumed;
    }
    public double getBillAmount( ){
        return this.billAmount;
    }
 */