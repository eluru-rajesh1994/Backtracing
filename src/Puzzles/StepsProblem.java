package Puzzles;

public class StepsProblem {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 40;
		int totalsteps=start(0, n);
	System.out.println(totalsteps);

	}

	static int start(int i, int n) {
		if (i == n) {
			return 1;

		}
		if (i > n) {
			return 0;
		}
		
			int step1 = start(i + 1, n);//only one step
			int step2 = start(i + 2, n);//at  a time 2 steps
			 		
		return step1+step2;
	}

}
