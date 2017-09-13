package org.programs.corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Puzzle2 {

	public static boolean flag = true;
	public static List<Integer> newList = null;
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
		List<Integer> list = new ArrayList(arrayListSize);
	    for(i=1;i<=j;i++)
	     {
	    	list.add(i);
	     
	     }
	     
	     System.out.println(list);	         
	     doKill(list);
	     System.out.println("The result is : "+newList);
	  }
    
     private static List<Integer> doKill(List<Integer> list) {
    	 newList = new ArrayList<Integer>();
    	 for(int i=0; i< list.size();i++){
    		 if(flag) {
    			 newList.add(list.get(i));
    			 flag = false;
    		 }
    		 else {
    			 flag = true;
    		 }
    	 }
    	 if(newList.size() > 1) {
    		 doKill(newList); 
    	 }
    	 return newList;
    	}
     }