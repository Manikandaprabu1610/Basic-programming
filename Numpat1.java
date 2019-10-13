
public class Numpat1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//number pattern 1:
	/*for(int row=3;row>=1;row--){
			for(int col=1;col<=row;col++){
				System.out.print(" "+row);
				
			}
			System.out.println();
		}*/

	
for(int row=1;row>=1;row++){
	for(int col=1;col>=row;col++){
		System.out.print(" "+col);
	}
	System.out.println();
}
	}
}
