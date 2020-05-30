package com.competitive.programming.lcs.strings;

public class CountingVowelsAndConsonants {

	public static int wordsCount(String sentence) {
		String actualString = sentence.trim();
		int count = 0;
		for (int i = 0; i < actualString.length(); i++) {
			if (actualString.charAt(i) == ' ' && actualString.charAt(i - 1) != ' ') {
				count++;
			}
		}
		return count + 1;

	}

	public static String vowelsAndConsonants(String sentence) {
		char[] charArray = sentence.toCharArray();
		int countVowels = 0;
		int countCons = 0;

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o'
					|| charArray[i] == 'u' || charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I'
					|| charArray[i] == 'O' || charArray[i] == 'U') {
				countVowels++;
			} else {
				countCons++;
			}
		}

		return new String("Vowles : " + countVowels + " , " + "Consonants: " + countCons);

	}

	public static void main(String[] args) {
		System.out.println(vowelsAndConsonants("How are you?"));
		System.out.println("Total words: " + wordsCount("How are    you?"));
	}

}
