package com.demo.variables;
public class InstanceVariables {
	public String name;
	// salary variable is visible in Student class only.
	private int marks;
	
	public InstanceVariables(String StudName) {
		this.name = StudName;	
	}
	public void setMarks(int studMarks) {
		marks = studMarks;
		
	}
	public void printStud() {
		System.out.println("Student name : " + name);
		System.out.println("Marks :" + marks);
	}
	public static void main(String args[]) {
		InstanceVariables st = new InstanceVariables("John");
		st.setMarks(80);
		st.printStud();
	}
}


