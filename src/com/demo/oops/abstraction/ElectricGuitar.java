
package com.demo.oops.abstraction;

public class ElectricGuitar extends StringInstrument{

	public ElectricGuitar() {
		super();
		this.name = "Guitar";
		this.numberOfStrings = 6;
	}
	public ElectricGuitar(int numberOfStrings) {
		super();
		this.name = "Guitar";
		this.numberOfStrings = numberOfStrings;
	}
	@Override
	public void play() {
		System.out.println("An electric " + numberOfStrings + "-string " + name
				+ " is rocking!");
	}
	
}
