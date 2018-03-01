package org.programs.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String funnyString(String s){
      
    	String letters ="abcdefghijklmnopqrstuvwxyz";
    	String result = "Funny";
    	String ReverseStr ="";
    	//acxz zxca
    	for(int i=s.length()-1; i>=0;i--){
    		ReverseStr += s.charAt(i);
    	}
    	for(int i=1;i<=s.length()-1;i++){
    		int ReverseStrdiff = 0;
    		int sdiff = 0 ;
    		if(letters.indexOf(s.charAt(i)) > letters.indexOf(s.charAt(i-1))){
    			sdiff = letters.indexOf(s.charAt(i)) - letters.indexOf(s.charAt(i-1));
    		}
    		else {
    			sdiff = letters.indexOf(s.charAt(i-1)) - letters.indexOf(s.charAt(i));
    		}
    				
    		if(letters.indexOf(ReverseStr.charAt(i)) > letters.indexOf(ReverseStr.charAt(i-1)))
    		{
    		 ReverseStrdiff = letters.indexOf(ReverseStr.charAt(i)) - letters.indexOf(ReverseStr.charAt(i-1));
    		}
    		else
    		{
    			ReverseStrdiff = letters.indexOf(ReverseStr.charAt(i-1)) - letters.indexOf(ReverseStr.charAt(i));
    		}
    		if(sdiff != ReverseStrdiff){
    			result = "Not Funny";
    			break;
    		}
    	}
		return result;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        if(q>=1 & q<=10){
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
        	if(s.length()>=2 & s.length()<=10000){
            String result = funnyString(s);
            System.out.println(result);
        }}
    }}
}
