public class Magic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for 3x3 matrix
		int arr[][] = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };
		int minrow = 0;
		int maxrow = 2;
		int mincol = 0;
		int maxcol = 2;
		int rowsum = 0;
		int colsum = 0;
		int diagsum = 0;
	  int i=0;
	  
	  for (int j = minrow; j <= maxrow; j++) {
			
			rowsum = rowsum + arr[i][j];
		}
	  
		for (int k = mincol; k <= maxcol; k++) {
		
			colsum = colsum + arr[k][i];
			}
		
		for (int f = minrow; f <= maxcol; f++) {
			diagsum = diagsum + arr[f][f];
		}
		System.out.println("the rowsum is " + rowsum + '\n' + "the colsum is "
				+ colsum + '\n' + "the diagsum is " + diagsum + '\n');

		if ((rowsum == colsum) && (rowsum == diagsum)) {
			System.out.println("hence it is magic square");
		} else
			System.out.println("it is not magic square");
	}
}
