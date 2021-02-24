package io.jagdesh.abCollections.acSortedInterface;

import java.util.SortedSet;
import java.util.TreeSet;

public class acSortedSetExample {

	public static void main(String[] args) {
		
		//	Creating a TreeSet
		SortedSet<String> fruits = new TreeSet<>();
		
		//	Adding new elements to a TreeSet
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Pineapple");
		fruits.add("Orange");
		  
		//	Returns the first (lowest) element currently in this set
		String first = fruits.first();
		System.out.println("First element : " + first);
		
		//	Returns the last (highest) element currently in this set
		String last = fruits.last();
		System.out.println("Last element : " + last);
		
		SortedSet<String> tailSet = fruits.tailSet("Orange");
		System.out.println("tailSet :" + tailSet);
		
	}
	
}
