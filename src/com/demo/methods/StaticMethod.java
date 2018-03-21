package com.demo.methods;

public class StaticMethod {
	public static int totalLength(String a, String b) {
        return a.length() + b.length();
    }

   public static int averageLength(String a, String b) {
        return totalLength(a, b) / 2;
    }

    public static void main(String[] args) {
        int total = totalLength("Golden", "Bowl");
        int average = averageLength("india", "cricket");

        System.out.println(total);
        System.out.println(average);
    }

}
