package com.competitive.programming.lcs.strings;

public class LcsProblems {

	public static int longestCommonSubsequence(char[] X, char[] Y, int m, int n) {
		int[] memo = new int[n + 1];

		for (int i = 1; i <= m; i++) {
			int prev = 0;
			for (int j = 1; j <= n; j++) {
				int temp = memo[j];
				if (X[i - 1] == Y[j - 1]) {
					memo[j] = prev + 1;

				} else {
					memo[j] = Math.max(memo[j], memo[j - 1]);
				}
				prev = temp;
			}
		}
		return memo[n];
	}

	public static void main(String[] args) {
		String s1 = "ABCDECD";
		String s2 = "BDAECD";
		System.out.println(longestCommonSubsequence(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length()));
	}

}
