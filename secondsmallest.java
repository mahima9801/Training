package lab7;

import java.util.Arrays;
import java.util.Scanner;

public class secondsmallest {
	public static int getSecondSmallest(int[] a){  
		  Arrays.sort(a);
		  return a[1];
		}  
		public static void main(String args[]){  
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the no. of elements:");
			int n = sc.nextInt();
			int[] a= new int[n];
			System.out.println("Enter the elements:");
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
			}
			System.out.println(getSecondSmallest(a));
			sc.close();
			 
		}
}
