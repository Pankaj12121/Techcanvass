package com.demo.collections.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");

		System.out.println("Before Reverse Order, ArrayList Contains : " + arrayList);

		/*
      To reverse the order of all elements of Java ArrayList use,
      static void reverse(List list) method of Collections class.

      This method reverse the order of elements of specified list.
		 */

		Collections.reverse(arrayList);

		System.out.println("After Reverse Order, ArrayList Contains : " + arrayList);

	}
}


