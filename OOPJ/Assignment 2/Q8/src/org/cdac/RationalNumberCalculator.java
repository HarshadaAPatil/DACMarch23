package org.cdac;

public class RationalNumberCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RationalNumberOperation rationalNum=new RationalNumberOperation();
		int ch;
		while((ch=rationalNum.menuList())!=0) {
			switch(ch) {
			case 1: rationalNum.acceptNum();
				break;
			case 2: System.out.println("Addition is : "+rationalNum.addition());
				break;
			case 3: 
				System.out.println("Substraction is : "+rationalNum.substraction());
				break;
			case 4: System.out.println("Multiplication is : "+rationalNum.multiplication());
				break;
			case 5: System.out.println("Division is : "+rationalNum.division());
				break;
			default : System.out.println("Please enter valid choice...");
			}
		}

	}

}
