package org.cdac;
/*
 * The program should be able to calculate the toll fee for each vehicle based on the following criteria:
			a. Cars, vans, and buses pay a base rate of $0.25 per mile for each axle.
			b. Trucks pay a base rate of $0.50 per mile for each axle.
	The program should be able to generate a bill for each vehicle based on the following criteria:
			a. The bill should include the vehicle type, number of axles, distance travelled, toll fee, and total amount due.
			b. The total amount due should include a $2.00 processing fee.
			c. The toll fee calculation and total amount due should not be accessible outside of the class.
			
	The program should have the following methods:
			a. calculateTollFee(): A method to calculate the toll fee for a given vehicle based on the number of axles and distance travelled.
			b. generateBill(): A method to generate a bill for a given vehicle based on the toll fee and total amount due.
			c. showMenu(): A method to show the menu options for the user to input the vehicle information.
			
	
	The program should show the following menu options:
			a. Enter vehicle type (car, van, bus, or truck)
			b. Enter number of axles
			c. Enter distance travelled
			d. Calculate toll fee
			e. Generate bill
			f. Exit
 * */

import java.util.Scanner;
public class TollBoothOperations {

	private Toll tollInstance =new Toll();
	private static Scanner sc=new Scanner(System.in);
	
	//Enter vehicle type (car, van, bus, or truck)
	void enterVehicleType() {
		System.out.print("Enter vehicle type (car, van, bus, or truck) : ");
		sc.nextLine();
		tollInstance.setVehicleType(sc.nextLine());
	}
	
	//Enter number of axles
	void enterAxles() {
		System.out.print("Enter number of axles ");
		tollInstance.setNumberOfAxles(sc.nextInt());
	}
	
	//Enter distance travelled
	void enterDistance() {
		System.out.print("Enter distance travelled : ");
		tollInstance.setDistanceTravelled(sc.nextDouble());;
	}
	
	//calculateTollFee
	//Cars, vans, and buses pay a base rate of $0.25 per mile for each axle.
//	b. Trucks pay a base rate of $0.50 per mile for each axle.
	void calculateTollFee() {
		if(tollInstance.getVehicleType().equals("truck")) {
			tollInstance.setTollFee(0.5);
		}
		else
			tollInstance.setTollFee(0.25);
		System.out.println("Toll fee for your vehicle per mile is : "+tollInstance.getTollFee());
	}
	
	//A method to generate a bill for a given vehicle based on the toll fee and total amount due.
	/*		a. The bill should include the vehicle type, number of axles, distance travelled, toll fee, and total amount due.
			b. The total amount due should include a $2.00 processing fee.
			c. The toll fee calculation and total amount due should not be accessible outside of the class.
	*/
	void generateBill() {
		tollInstance.setTotalAnountDue(2);
		double totalBill=(tollInstance.getDistanceTravelled() * tollInstance.getTollFee())+2;
		System.out.println("The total bill generated is : "+totalBill);		
	}
	
	int showMenu() {
		
		System.out.println("0.Exit");
		System.out.println("1.Enter vehicle type (Car, Van, Bus, or Truck) ");
		System.out.println("2.Enter number of axles. ");
		System.out.println("3.Enter distance travelled.");
		System.out.println("4.Calculate toll fee. ");
		System.out.println("5.Generate bill.");
		System.out.print("Enter your choice : ");
		return sc.nextInt();
	}
	
}
