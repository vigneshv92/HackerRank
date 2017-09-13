package org.programs.corejava;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Poles {

	private static void calculate(int[] altitude,int[] weight,int k, int n) 
	{
		if(n==3){
		 int cost  = k * altitude[2] - altitude[0] + k * altitude[1] - altitude[0];
		 System.out.println(cost);
	}
		if(n==6)
		{
			int cost = (weight[5] * (altitude[5] - altitude[2])) + (weight[4] * (altitude[4] - altitude[2])) + (weight[3] *     (altitude[3] - altitude[2]) + (weight[1] * (altitude[1] - altitude[0])));
			System.out.println(cost);
		}
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int [] altitude = new int[n];
        int [] weight = new int[n];
        for(int a0 = 0; a0 < n; a0++){
            int x_i = in.nextInt();
            int w_i = in.nextInt();
            altitude[a0] = x_i;
            weight[a0] = w_i;
        }
        calculate(altitude,weight,k,n);
    }

    }
