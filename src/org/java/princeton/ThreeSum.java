package org.java.princeton;
import java.util.*;

public class ThreeSum {

	public static int count(int[] a) 
	{
		int N = a.length;
		int count = 0;
		for(int i=0;i<N;i++)
			for(int j=i+1;j<N;j++)
				for(int k=j+1;k<N;k++)
				{
					if(a[i]+a[j]+a[k]== 0)
					{
						count++;
					}
					System.out.println("Sum equals to Zero " +count);
				}
		return count;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the length");
		Scanner s = new Scanner(System.in);
		int length  = s.nextInt();
		int[] a = new int[length];
		System.out.println("Enter the numbers");
		for(int i=0;i<length;i++)
		{
		  int num = s.nextInt();
		  num = a[i];
		  System.out.println(a[i]);
		}
		System.out.println("Array Contains Numbers" +a);
	   System.out.println(count(a));
	}
	
	}
