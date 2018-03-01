package org.programs.algorithms;
import java.util.*;

public class Puzzle {
	
	public static void main(String[] args) {
	 
		int end,temp;
		System.out.println("Welcome to the game");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number u have to start the game with");
	    int i = sc.nextInt();
		System.out.println("Enter the Number u have to end the game with" );
		int j = sc.nextInt();
		
		System.out.println("Game Started");
		int arrayListSize = j-1;		
		ArrayList a = new ArrayList(arrayListSize);
	    Iterator itr = a.iterator();
	   
	    	for(int h=i;i<=j;i++)
	    	{
	    		a.add(i);
	    	
	    	}
	    	
	    	System.out.println(a);
	    	System.out.println("The arrayListSize is " +arrayListSize);
	    	
	    	System.out.println("Actual Game");
	    	
	    	
	    	for(int k=0;;)
	    	{
	    		k=++k;
	    		a.remove(k);
	    		
	    	
	    	//System.out.println("New Array Size is " +a.size());
	    	System.out.println(a);
	    	
	    	ArrayList round2 = new ArrayList(a);
	    	System.out.println("Players in round 2 are " +round2);
	    	
	    	
	    	for(int l=0;l<=round2.size();)
	    	{
	    		k=++k;
	    		round2.remove(k);
	    		System.out.println("After Round 2 the Array Size is " +round2.size());
		    	System.out.println(round2);
		    	
//		    
//	    	ArrayList round3 = new ArrayList(round2);
//	    	System.out.println("Players in round 3 are " +round3);
//	    	
//	    	for(int m=0;;)
//	    	{
//	    		k=++k;
//	    		round3.remove(k);
//	    		System.out.println("New Array Size is " +round3.size());
//		    	System.out.println(round3);
//		    	
//		    	
//	   		}
//	   
}      	
	}}}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	    	
//	    	
//	        int start = (Integer) a.get(0);
//	       for(int b= (Integer) a.get(0); b>=0 ;b++)
//	      {
//	       a.remove(start++);
//	                	
//	        }
//	       System.out.println("The 1st Round Result is ");
//	       System.out.println(a);
//	       
//		    }
//	           	 
//	    		
//	 	    }	
	    
		
		
		
		
		//int game[] = new int[n];
//	    
//	    
//		    for (int a = 0; a<=j; a++) 
//		    {
//		    	game[a] = i++;
//		    	System.out.println("Value in "+game[a]+"=" +i);
//		    	    	
//		    }	
//		    System.out.println("Array Contains " +game);
//	        System.out.println("Size of game is" + game.length);		
//		    	
//		    }
//	    
  	 
