package lab7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
	public static int[] modifyArray(int arr[])
	{
		Set<Integer> list=new HashSet<Integer>();
		for(int i:arr)
		{
			list.add(i);
			System.out.println(list);
		}
		return list.stream().mapToInt(Integer::intValue).toArray();

	
	}
	public static void main(String args[])
	{
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		modifyArray(arr);
		sc.close();
	}

}

