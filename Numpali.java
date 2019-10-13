
public class Numpali {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String no1="525";
	String no2="";
	for(int i=no1.length()-1;i>=0;i--){
		no2=no2+no1.charAt(i);
		
	}
	if(no1.equals(no2)){
		System.out.println("the number "+no1+" is palindrome");
		
	}
	else{
		System.out.println("not a palindrome");
	}

}
}