package ua.lviv.desctop.part1;

import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		Integer[] myArray = { 13, 97, 449, 2497, 0, 5, 9, 796, 349, 478, 257, 25, 66, 79, 99 };

		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));

		Arrays.sort(myArray, Collections.reverseOrder());
		System.out.println(Arrays.toString(myArray));

	}

}
