import java.util.Scanner;

public class Rank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		System.out.println("enter number of students count is :");
		int i = e.nextInt();
		int a[] = new int[i];
		int f[] = new int[i];
		System.out.println("enter the names :");
		for (int j = 0; j < a.length; j++) {
			String s= e.next();
		}
		System.out.println("enter the marks :");
		
		for (int k = 0; k < a.length; k++) {
			f[k] = e.nextInt();
			

		}
		System.out.println("marks and ranks are :");
       
		for (int y = 0; y < a.length; y++) {
			for (int j = y + 1; j < a.length; j++) {
				int temp;
				if (f[y] < f[j]) {
					temp = f[y];
					f[y] = f[j];
					f[j] = temp;
				}
			}
		}
		int rank = 1;
		for (int z = 0; z < a.length; z++) {

			System.out.println("mark is "+f[z] +" and  Rank is " + rank);
			rank++;

		}
		e.close();
		
	}

}
