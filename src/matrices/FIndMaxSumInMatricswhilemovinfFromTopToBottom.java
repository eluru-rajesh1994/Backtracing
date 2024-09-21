package matrices;

import java.util.Arrays;

public class FIndMaxSumInMatricswhilemovinfFromTopToBottom {
	static int Max = Integer.MIN_VALUE;
	static int[][] mem;
	static int rowVal = 0;
	static int colVal=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 3 }, { 4, 7 } };
		int row = arr.length;
		int col = arr[0].length;
		mem = new int[row][col];
//		for (int i = 0; i < mem.length; i++) {
//			// Arrays.fill(mem[i], -1);
//		}
//		
//Arrays.fill(arr, -1);
	int maxsum=	findMaxSum(arr, 0, 0, row - 1, col - 1, arr[0][0]);
		System.out.println(maxsum);
		for (int i = 0; i < mem.length; i++) {
			System.out.println(Arrays.toString(mem[i]));
			
		}

	}

	static int findMaxSum(int[][] arr, int i, int j, int row, int col, int currentSum) {

		//System.out.println(i+" "+j);
		if (i == row && j == col ) {
			if (currentSum > Max) {
				Max = currentSum;
			}
		 return Max;

		}
		if (mem[i][j] != 0) {
			return mem[i][j];
		}
		
		if (i < row) {
			rowVal = findMaxSum(arr, i + 1, j, row, col, currentSum + arr[i + 1][j]);
		}
		
		if (j < col)
			colVal = findMaxSum(arr, i, j + 1, row, col, currentSum + arr[i][j + 1]);
  System.out.println(rowVal+" "+colVal+" "+Max);
		mem[i][j] = Math.max(rowVal, colVal);
		return mem[i][j];

	}

}
