package Puzzles;

import java.util.Arrays;

public class StepsProblemOptimizedsolution {

	// static int count=0;
	static long[] arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		arr = new long[n];
		Arrays.fill(arr, -1);
		long numberofways = optimisedsolution(0, n);
		System.out.println(numberofways);
		// System.out.println(Arrays.toString(arr));//

	}

	static long optimisedsolution(int i, int n) {
		if (i == n) {
			return 1;

		}
		if (i > n) {
			return 0;
		}
		if (arr[i] != -1) {
			return arr[i];
		}
		if (i < n) {
			long step1 = optimisedsolution(i + 1, n);
			long step2 = optimisedsolution(i + 2, n);
			// int step3=optimisedsolution(i+3, n);
			arr[i] = step1 + step2;
		}

		return arr[i];
	}

}
