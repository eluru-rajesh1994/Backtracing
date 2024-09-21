package Arrays;

public class Matrixnoofwaystoreachtoptobottom {
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=10;
		int col=10;
		int [] [] a=new int [row][col];
		int i=0;
		int j=0;
		findway(i,j,row,col);
  System.out.println(count);
	}
	static void findway(int i,int j,int row,int col) {
		if(i==row-1&&j==col-1) {
			count++;
			return;
		}
		if(i<row) {
			findway(i+1,j,row,col);
		}
		if(j<col) {
			findway(i,j+1,row,col);
		}
	}

}
