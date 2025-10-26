package lesson43_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		// Retrieving
		System.out.println(numbers.get(0));
		
		System.out.println("\nIteration #1: ");
		// Indexed for loop iteration
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		System.out.println("\nIteration #2: ");
		for(Integer value: numbers) {
			System.out.println(value);
		}
		
		// Removing items (careful!)
		numbers.remove(numbers.size() -1);
		
		// This is very slow
		numbers.remove(0);
		
		System.out.println("\nIteration #2: ");
		for(Integer value: numbers) {
			System.out.println(value);
		}
		
		// List interface ...
		List value = new ArrayList<String>();

	}

}
