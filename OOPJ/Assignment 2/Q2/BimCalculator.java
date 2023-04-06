/**
     BMI Calculator 
        You have been asked to write a Java program to implement a BMI (Body Mass Index) calculator. 
        The program should have the following functionality:
        The BMI calculator class should have the following fields:
            a. height: A double field to store the height of the person in meters.
            b. weight: A double field to store the weight of the person in kilograms.
        The BMI calculator class should have the following methods:
            a. A constructor to initialize the height and weight fields of the BMI calculator object.
            b. Getter and setter methods.
            c. Double calculateBMI(): A method to calculate the BMI of the person using the following 
                formula: 

        BMI = weight / (height * height).

        Write a Java program that creates an object of the BMI calculator class, prompts the user to
        input their height and weight, sets the height and weight fields of the BMI calculator object 
        using the setter methods, calculates the BMI using the calculateBMI() method, and prints the 
        calculated BMI to the console.
*/
import java.util.*;

class Information{
    private double height;
    private double weight;

    Information(){
        this.height=0;
        this.weight=0;
    }
    void setHeight(double height){
        this.height=height;
    }
    void setWeight(double weight){
        this.weight=weight;
    }
    double getHeight(){
        return this.height;
    }
    double getWeight(){
        return this.weight;
    }
}

class BimCalculator{
        private Information info=new Information();
    void acceptInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height : ");
        info.setHeight(sc.nextDouble());
        System.out.println("Enter your weight : ");
        info.setWeight(sc.nextDouble());
    }
    Double calculateBMI(){
        
        return (this.info.getWeight() / (this.info.getHeight() * this.info.getHeight()));
    }
    public static void main(String args[]){
        
        BimCalculator bim = new BimCalculator();
        bim.acceptInfo();
        System.out.print("Your calculated BMI is : "+bim.calculateBMI());
        
    }
}