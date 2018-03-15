import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void SortArray(int a[])
	{
		int n =a.length;
		int[] sortedArray = new int[n];
		for (int i = 0; i <n-1 ; i++) 
        {
          if (a[i] > a[i+1] && a[i] - a[i+1]== 1)
          {
             int temp = a[i];
             a[i] = a[i+1];
            a[i+1] = temp;
          }
            
        }
       // System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
           // System.out.print(a[i] + ",");
            sortedArray[i] = a[i];
        }
        
        
       // System.out.print(a[n - 1]);
        
       // System.out.print("Sorted Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            //System.out.print(sortedArray[i] + ",");
        }
        sortedArray[n-1] = a[n-1];
       // System.out.print( sortedArray[n-1]);
       Boolean sortResult = checkSort(sortedArray);
       if(sortResult)
       {
    	   System.out.println("Yes");
       }
       else
       {
    	   System.out.println("No");
       }
	}
	
	public static Boolean checkSort(int [] arr)
	{
		boolean sorted = true;

		for (int i = 0; i < arr.length - 1; i++) {
		    if (arr[i+1] - arr[i] != 1) {
		        sorted = false;
		        break;
		    }
		}
		return sorted;
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            SortArray(a);
            // Write Your Code Here
        }
    }}
