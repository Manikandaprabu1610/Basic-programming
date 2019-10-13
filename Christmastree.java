
public class Christmastree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int k=1;k<=4;k++){
		for(int i=0;i<n;i++){
			
			for(int j=n-i;j>1;j--){
			
					System.out.print(" ");
				}
				for(int f=0;f<=i;f++){
					System.out.print("* ");
					
				}
				
				System.out.println();
			}
		}
		for(int a=1;a<=7;a++){
			System.out.print("  ");
		
		for(int b=1;b<=3;b++){
			System.out.print("* ");
			
		}
		System.out.println();
		}
	}
	}



