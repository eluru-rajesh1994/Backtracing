package Arrays;

public class Inmatrixnoofwayshighestsum {
	static int Maxsum = Integer.MIN_VALUE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 3, 5, 1 }, { 0, 4, 1 }, { 3, 4, 0 } };
		int rows = arr.length - 1;
		int col = arr[0].length - 1;
		int i = 0;
		int j = 0;
		findnoofways(i, j, arr, rows, col, arr[0][0]);
		System.out.println(Maxsum);

	}

	static void findnoofways(int i, int j, int[][] arr, int rows, int col, int currentSum) {
		if (i == rows && j == col) {
			if (Maxsum < currentSum)
				Maxsum = currentSum;
			return;
		}
		if (i < rows) {
			findnoofways(i + 1, j, arr, rows, col, currentSum + arr[i + 1][j]);
		}
		if (j < col) {
			findnoofways(i, j + 1, arr, rows, col, currentSum + arr[i][j + 1]);

		}
	}

}
