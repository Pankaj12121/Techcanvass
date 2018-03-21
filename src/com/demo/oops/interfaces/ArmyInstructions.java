package com.demo.oops.interfaces;

public class ArmyInstructions implements Enemy,TestInterface,TestInterface1{

	@Override
	public void speak() {
	System.out.println("Soldiers should not take name and user codewords");	
	}
	@Override
	public void moveTo(int x, int y) {
		System.out.println("Enemy entered in the teritory and standing at" + x +"and"+ y +"cordinates");	
	}
	@Override
	public void attack(String code) {
		System.out.println("Soldiers need to start attack on listening this"+ code);	
	}
	@Override
	public void heal(int percentage) {
		// TODO Auto-generated method stub	
	}
	
	@Override
	public void samplecode() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void eventOnDeath() {
		// TODO Auto-generated method stub
		
	}
}
