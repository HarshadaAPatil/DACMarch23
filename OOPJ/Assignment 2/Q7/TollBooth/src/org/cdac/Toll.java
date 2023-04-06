package org.cdac;
/*			
		The program should have the following fields:
			a. vehicleType: A string field to store the type of vehicle.
			b. numAxles: An integer field to store the number of axles.
			c. distanceTraveled: A double field to store the distance traveled.
			d. tollFee: A double field to store the calculated toll fee.
			e. totalAmountDue: A double field to store the total amount due. 
			
			You are required to write a Java program to implement a Toll Booth Bill Generator. 
			The program should be able to calculate the toll fee for each 
			vehicle based on the number of axles and the distance travelled. The program should also be able to generate a bill for each vehicle.
			
 * */

public class Toll {

	private String vehicleType;
	private int numberOfAxles;
	private double totalAnountDue;
	private double distanceTravelled;
	private double tollFee;
	
	Toll(){
		//Parameterless Constructor...
	}
	
	public Toll(String vehicleType, int numberOfAxles, double totalAnountDue, double distanceTravelled, double tollFee) {
		super();
		this.vehicleType = vehicleType;
		this.numberOfAxles = numberOfAxles;
		this.totalAnountDue = totalAnountDue;
		this.distanceTravelled = distanceTravelled;
		this.tollFee = tollFee;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getNumberOfAxles() {
		return numberOfAxles;
	}
	public void setNumberOfAxles(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}
	public double getTotalAnountDue() {
		return totalAnountDue;
	}
	public void setTotalAnountDue(double totalAnountDue) {
		this.totalAnountDue = totalAnountDue;
	}
	public double getDistanceTravelled() {
		return distanceTravelled;
	}
	public void setDistanceTravelled(double distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}
	public double getTollFee() {
		return tollFee;
	}
	public void setTollFee(double tollFee) {
		this.tollFee = tollFee;
	}
	@Override
	public String toString() {
		return "Toll [vehicleType=" + vehicleType + ", numberOfAxles=" + numberOfAxles + ", totalAnountDue="
				+ totalAnountDue + ", distanceTravelled=" + distanceTravelled + ", tollFee=" + tollFee + "]";
	}
	
	
	

}
