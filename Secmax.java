
public class Secmax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int given[]={12,10,13,14,11};
		
		int max1=0;
		int max2=0;
		int i=0;
		while(i<given.length){
			
			if(max1<given[i]){
				max2=max1;
				max1=given[i];
				
			}
			else if(max2<given[i]){
				
				max2=given[i];			
				
			}
			i++;
		}
		
		
	
	System.out.println("the second maximum from the given array is " + max2);

}
}