package com.demo.oops.interfaces;

public interface Enemy {
	
	public void speak();
	   public void moveTo(int x, int y);
	   public void attack(String code);
	   public void heal(int percentage);
	   public void eventOnDeath();
}
