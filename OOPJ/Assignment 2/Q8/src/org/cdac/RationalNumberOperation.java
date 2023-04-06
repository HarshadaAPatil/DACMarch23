package org.cdac;

/**
	 * You are required to write a Java program to perform arithmetic operations on rational numbers. Rational numbers are numbers that can be expressed as a 
	 * fraction of two integers (i.e., numerator and denominator). The program should take the following inputs from the user:
	Two rational numbers (i.e., two pairs of integers representing the numerator and 
	denominator of each number)
	The program should then perform the arithmetic operation on the two rational 
	numbers and output the result in the form of a reduced fraction (i.e., the numerator 
	and denominator should be as small as possible).
	Example Input
	Enter the first rational number:
	Numerator: 2
	Denominator: 3
	Enter the second rational number:
	Numerator: 1
	Denominator: 6
	Enter the arithmetic operation (+, -, *, /): 
 */
import java.util.*;

public class RationalNumberOperation {
	private static Scanner sc=new Scanner(System.in);
	private RationalNumber ratNum1=new RationalNumber();
	private RationalNumber ratNum2=new RationalNumber();

	
	static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Accept two pairs of integer representing the numerator and denominator of each number.");
		System.out.println("2.Addition");
		System.out.println("3.Substraction");
		System.out.println("4.Multiplication");
		System.out.println("5.Division");
		System.out.println("Enter your choise");
		return sc.nextInt();
	}

	public void acceptNum() {
		// TODO Auto-generated method stub
		System.out.println("Enter the first rational number: ");
		System.out.print("Numerator : ");
		ratNum1.setNum1(sc.nextInt());
		System.out.print("Denominator :");
		ratNum1.setNum2(sc.nextInt());
		System.out.println("Enter the second rational number: ");
		System.out.print("Numerator : ");
		ratNum2.setNum1(sc.nextInt());
		System.out.print("Denominator :");
		ratNum2.setNum2(sc.nextInt());
		
	}
	
	public double addition() {
		// TODO Auto-generated method stub
		if(ratNum1.getNum2()==ratNum2.getNum2()) {
			return ((ratNum1.getNum1()+ratNum2.getNum1())/ratNum1.getNum2());
		}
		else {
			return ((ratNum1.getNum1()*ratNum2.getNum2()+ratNum1.getNum2()*ratNum2.getNum1())/(ratNum1.getNum2()*ratNum2.getNum2()));
		}
	}

	public double substraction() {
		// TODO Auto-generated method stub
		if(ratNum1.getNum2()==ratNum2.getNum2()) {
			return ((ratNum1.getNum1()-ratNum2.getNum1())/ratNum1.getNum2());
		}
		else {
			return ((ratNum1.getNum1()*ratNum2.getNum2()-ratNum1.getNum2()*ratNum2.getNum1())/(ratNum1.getNum2()*ratNum2.getNum2()));
		}
	}

	public double multiplication() {
		// TODO Auto-generated method stub
		return ((ratNum1.getNum1()*ratNum2.getNum1())/(ratNum1.getNum2()*ratNum2.getNum2()));
	}

	public double division() {
		// TODO Auto-generated method stub
		return ((ratNum1.getNum1()*ratNum2.getNum2())/(ratNum1.getNum2()*ratNum2.getNum1()));
	}

}
