package com.demo.flowcontrol;

public class SwitchStatement {
	public static void main(String[] args) {
		//for (int i = 0; i <= 2; i++) {
			// Switch on number.
		int i= 2;
			switch (i) {
			case 1: {
				System.out.println("One: " + i);
				break;
				
			}
			case 2:
			case 3: {
				System.out.println("Two or three: " + i);
				
			}
			default: {
				System.out.println("Default case: " + i);
			}
			}
		}

	//}
}
