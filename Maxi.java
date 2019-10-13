import java.util.Arrays;
import java.util.Scanner;


public class Maxi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Scanner sc=new Scanner(System.in);
              System.out.println("number of elements in array is :");
              int a=sc.nextInt();
        	  int s[]=new int[a];

              System.out.println("enter the array values");
             
              for(int j=0;j<s.length;j++){
            	  s[j]=sc.nextInt();
            
              
              }
              
              int maxi=0;
              
              for(int i=0;i<s.length;i++){
            	   for(int k=1;k<s.length;k++){
            		   if(s[k]>s[i]){
            			   maxi=s[k];
            		   }
            	   }
              }
            	  System.out.println("The maximum number from the array is"+ maxi);
            	  sc.close();
            	  
            	  Arrays.sort(s);
            	  System.out.println("the ascending order is :");
            	  for(int i=0;i<s.length;i++){
            		  System.out.println(" "+ s[i]);
            	  }
            	  
              }
	
              
              
            		  
              
	}



