package org.cdac;
/*
 * 
 * */
public class TollBoothBillGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TollBoothOperations tollOp=new TollBoothOperations();
		int ch=0;
		while((ch=tollOp.showMenu())!=0) {
			switch(ch) {
			case 1: tollOp.enterVehicleType();
				break;
			case 2: tollOp.enterAxles();
				break;
			case 3: tollOp.enterDistance();
				break;
			case 4: tollOp.calculateTollFee();
				break;
			case 5: tollOp.generateBill();
				break;
			default:System.out.println("Enter valid choice...");
				
			}
		}
	}

}
