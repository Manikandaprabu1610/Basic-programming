
public class Palin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s1="madam";
          String s2="";
          System.out.println(s1.length());
          for(int i=s1.length()-1;i>=0;i--)
          {
        	  System.out.println(s1.charAt(i));
        	  s2=s2+s1.charAt(i);
        	          	  
          }
          
          if(s2.equals(s1)){
        	  System.out.println("palindrome");
          
          }
          else{
        	  System.out.println("not a palindrome");
          }
            
	}

}
