
public class RecursiveSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = fact(5);
		System.out.println(res);
		
	}
	static int no = 1;
	static  int fact(int i)
	{
		no = no * i;
		
		i=i-1;
		if(i>0)
		{	
			fact(i);
		}		
		return no;
	
	}

}
