package org.programs.algorithms;
import java.util.*;

public class Puzzle1 {

	public static boolean flag = true;
	public static List<Integer> newList = null;
    public static void main(String[] args) {


		System.out.println("Welcome to the game");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number u have to start the game with");
		int start = sc.nextInt();
		System.out.println("Enter the Number u have to end the game with" );
		int end = sc.nextInt();	
		sc.close();
		List<Integer> list = new ArrayList<Integer>();
	    for(int i = start; i <= end; i++)
	     {
	    	list.add(i);	     
	     }
	     
	     System.out.println(list);	         
	     doKill(list);
	     System.out.println("The winner of the game is : "+newList);
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