package project;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		
		Random random = new Random();
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = random.nextInt(101);
		}
		
		System.out.println("Table elements:");
		for (int number : numbers) {
			System.out.println(number);
		}
		
		Arrays.sort(numbers);
		System.out.println("Table elements after sorting:");
		for (int number : numbers) {
			System.out.println(number);
		}

	}

}
