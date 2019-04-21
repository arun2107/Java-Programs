package java_Programs;

public class PrintMatrixInSpiralForm {

	public static void main(String[] args) {

		/*Input:
	        1    2   3   4
	        5    6   7   8
	        9   10  11  12
	        13  14  15  16
	Output: 
	1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 */
		
		int mat[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
			
		int first_row=0;
		int first_col=0;
		int last_Col=3;
		int last_row=3 ;
		int i=0;
		while(first_row<=last_row && first_col<=last_Col) {
		for(i=first_col;i<=last_Col;i++)
		{	
				System.out.print("  " +mat[first_row][i]);
			}
		first_row++;
		
		
		for(i=first_row;i<=last_row;i++)
		{
			System.out.print(" "+ mat[i][last_Col]);
			
			
		}
		last_Col--;
		
		
		if(first_row<=last_row)
		{
			for(i=last_Col;i>=first_col;i--)
			{
				System.out.print(" " +mat[last_row][i]);
			}
			last_row--;
		}
		
		
		if(first_col<=last_Col)
		{
			for(i=last_row;i>=first_row;i--)
			{
				System.out.print(" " +mat[i][first_col]);
			}
			first_col++;
		}
		
	}

}}
 