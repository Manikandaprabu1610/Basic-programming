
public class AngleBwHands {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n=3.0;
		double m=25.0;
		 double angle=(11.0/2.0)*(m-30*n);
		 angle=Math.abs(angle);
		 if(angle>180)
		 {
			 angle=angle-180;
			 
		 }
             System.out.println(angle);
	}

}
