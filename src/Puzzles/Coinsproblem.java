package Puzzles;

public class Coinsproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int totalways=0;
	for(int onerupee=0;onerupee<=3;onerupee++ ) {
		for(int twors=0;twors<=2;twors++) {
			for(int fivers=0;fivers<=1;fivers++) {
				if(1*onerupee+2*twors+5*fivers==5) {
					System.out.println("["+onerupee + " "+twors+" "+fivers+"]");
					totalways++;
				}
					
			}
		}
	}
	System.out.println("totalWays:"+totalways);
	}
	}