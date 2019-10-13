
public class Thirdmax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={12,17,13,16,19};
		int max1=0;
		int max2=0;
		int max3=0;
		for(int i=0;i<a.length;i++){
			if(max1<a[i]){
				max3=max2;
				max2=max1;
				max1=a[i];
				
			
		}
			else if(max2<a[i]){
				max3=max2;
				max2=a[i];
				
				
			}
			else if(max3<a[i]){
				
				max3=a[i];
		
			}
			}
		
		
        System.out.println("the third maxi is "+max3);
	}
}


