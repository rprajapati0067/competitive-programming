package com.competitive.programming.lcs.strings;

public class ChangeCaseWithoutInbuildMethod {

	public static String toLowerCase(String word) {
		char[] charArray = word.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = (char) (charArray[i] + 32);

		}
		return new String(charArray);

	}

	public static String toUpperCase(String word) {
		char[] charArray = word.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = (char) (charArray[i] - 32);

		}
		return new String(charArray);

	}

	public static String toggleCases(String word) {
		char[] charArray = word.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
				charArray[i] = (char) (charArray[i] + 32);
			} else if (charArray[i] >= 'a' && charArray[i] <= 'z') {
				charArray[i] = (char) (charArray[i] - 32);
			}
		}
		return new String(charArray);

	}

	public static void main(String[] args) {
		System.out.println("Upper to Lower: " + toLowerCase("WELCOME"));
		System.out.println("Lower to Upper: " + toUpperCase("welcome"));
		System.out.println("Toggle Case: " + toggleCases("welCOME"));
	}

}
