package com.basicmath;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MaxNumber {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		List<Integer> integers = Arrays.asList(548, 560, 59, 70);
		int max = 0;
		for (int number : integers) {
			int nthDigit = returnNthDigit(number);
			if (nthDigit > max) {
				max = nthDigit;
			}
		}
		System.out.println(max);
	}

	public static int returnNthDigit(int number) {
		while (number > 10) {
			number = number / 10;
		}
		return number;
	}

}
