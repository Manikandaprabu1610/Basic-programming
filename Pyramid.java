
public class Pyramid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h=5;
		for(int i=1;i<=h;i++){
			for(int j=h-1;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			
			System.out.print("\n");
				}
	}
	}
	

