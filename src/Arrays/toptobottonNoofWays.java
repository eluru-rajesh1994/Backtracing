package Arrays;

public class toptobottonNoofWays {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 3;

		int i = 0;
		int j = 0;

		int value = findpath(m - 1, n - 1, i, j);
		System.out.println(value);

	}

	public static int findpath(int m, int n, int i, int j) {
		//System.out.println(i + " " + j + " " + m + " " + n);
		if (i == m && j == n) {
			//System.out.println(count);
			count++;
			return 1;
		}
		if (i < m) {
			findpath(m, n, i + 1, j);
		}
		 if (j < n) {
			findpath(m, n, i, j + 1);

		}
		return count;

	}

}
