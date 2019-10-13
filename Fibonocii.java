
public class Fibonocii {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		int i=1;
		int count=10;
		
		while(i<count){
			System.out.println(first);
			System.out.println(second);
			  
			first=first+second;
			second=first+second;
			i=i+2;
			if(i==count){
				System.out.println(first);
			}
		}
		
		}

	}


