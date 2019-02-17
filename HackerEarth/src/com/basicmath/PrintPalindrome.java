/**
 *
 */
package com.basicmath;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mnanjundegowda
 *
 */
public class PrintPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String palindrome = "aabbcadad";
		System.out.println(isPalindrome(palindrome));

	}

	/**
	 * isPalindrome
	 *
	 * @param palindrome
	 * @return
	 */
	public static boolean isPalindrome(String palindrome) {
		Map<Character, Integer> frequencyMap = new HashMap<Character, Integer>();
		for (int i = 0; i < palindrome.length(); i++) {
			if (frequencyMap.containsKey(palindrome.charAt(i))) {
				Integer count = frequencyMap.get(palindrome.charAt(i));
				frequencyMap.put(palindrome.charAt(i), ++count);
			} else {
				frequencyMap.put(palindrome.charAt(i), 1);
			}
		}

		int oddCount = 0;
		for (int count : frequencyMap.values()) {
			if (count % 2 == 1) {
				oddCount++;
			}
		}

		if (oddCount == 1) {
			return true;
		} else {
			return false;
		}
	}
}
