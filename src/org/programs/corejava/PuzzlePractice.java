package org.programs.corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PuzzlePractice {
	
	public static void main(String[] args) 
	{
		
	 	System.out.println("Welcome to the game");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number u have to start the game with");
	    int i = sc.nextInt();
		System.out.println("Enter the Number u have to end the game with" );
		int j = sc.nextInt();
		
		System.out.println("Game Started");
		int Size = j-1;		
		ArrayList a = new ArrayList(Size);
	    Iterator itr = a.iterator();
	   
	    	for(i=0;i<=Size;i++)
	    	{
	    		a.add(i);
	    	
	    	}
	    	
	    	System.out.println(a);
	    	System.out.println(a.size());
	    	
	    	System.out.println("Actual Game");
	    	
}}
