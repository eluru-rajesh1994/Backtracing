package Puzzles;

public class NoofAlphbetsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		int index = 0;
		int possibleways = find(str, index);
		System.out.println(possibleways);
	}

	static int find(String str, int index) {
		if (index == str.length()) {

			return 1;
		}
		if (index > str.length()) {
			return 0;
		}
		if (str.charAt(index) == '0') {
			return 0;
		}

		int val1 = find(str, index + 1);
		int val2 = find(str, index + 2);
		int sum = val1 + val2;
		return sum;
	}

}
