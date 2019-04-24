package leetCode;

public class MatrixTranspose {

	public static void main(String[] args) {

		
		int[][] A= {{1,2,3},{4,5,6}};
		
		int firstColoumn=0;
		int lastColoumn=A[0].length;
		int firstrow=0;
		int lastrow=A.length;
		
		while(firstColoumn<lastColoumn) {
		for(int i=firstrow;i<lastrow;i++)
		{
			System.out.print(" "+A[i][firstColoumn]);

		}
		System.out.println("\n");
		firstColoumn++;
		}
		
		
		
		
	}

}
