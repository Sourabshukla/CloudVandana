package CloudVandana;

import java.util.*;
public class CheckAnagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String str1 = scanner.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = scanner.nextLine();
		boolean isAnagram = checkAnagram(str1, str2);
		if (isAnagram) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");
		}
	}
	public static boolean checkAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		int[] count = new int[256];
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			count[ch]++;
		}
		for (int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);
			count[ch]--;
		}
		for (int i = 0; i < 256; i++) {
			if (count[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
