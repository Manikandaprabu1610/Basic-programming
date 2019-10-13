import java.util.Scanner;


public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Size of n");
   int n=sc.nextInt();
  int a[]=new int[n];
  int position;
  boolean flag=false;
  for(int i=0;i<a.length;i++){
	 
	  System.out.println("Enter the value of "+i);
	  a[i]=sc.nextInt();
	  
  }
  
  System.out.println("Enter the value of search");
  n=sc.nextInt(); 
  sc.close();
  
  for(int i=0;i<a.length;i++){
	  
		  if(n==a[i]){
	
			  flag=true;
    	 
	   System.out.println("index is "+i);
     
     
          position=i+1;	
	    
	  System.out.println("position is "+position);
	  
	  }
		 
     
     }
  System.out.println(flag);
	  
  //if(!flag){
	//  System.out.println("not found");
  
  
  
  }
	  
  }
	//}
	







