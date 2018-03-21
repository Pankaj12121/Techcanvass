package com.demo.oops.encapsulations;

public class EncapsulationDemo1 extends EncapsulationDemo{

	public static void main(String[] args) {
	EncapsulationDemo ed= new EncapsulationDemo();
	int x= ed.FDAmount;
	String y= ed.password;
	//System.out.println(x + y);
	
	int printbalance=ed.getBalance("Ganesh");
	ed.setBalance(2000,"vishal");
	System.out.println(printbalance);
	//System.out.println(printNewBalance);
	
	EncapsulationDemo1 pcrelation= new EncapsulationDemo1();
	
	pcrelation.m1();;
	pcrelation.getCustomerName();
	}
public void m1(){
		System.out.println("child method");
	}
}
