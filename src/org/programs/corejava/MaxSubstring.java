package org.programs.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MaxSubstring {
	
	static void findMax(String[] s,int x,int y)
	{
		String a = s[x];
		String b = s[y];
		if((s[x].matches(".*[a-z].*")) && (s[y].matches(".*[a-z].*"))){
			List<String> Subofa = substrings(0,1,a);
			List<String> Subofb = substrings(0,1,b);
			List<String> commonSubStrings = new ArrayList<String>();
	/*		Iterator<String> itr=Subofa.iterator();
	        while(itr.hasNext())
	        {
	            System.out.println(itr.next());

	        }*/
	        for (String val : Subofa) {
	            if (Subofb.contains(val)) {
	            	commonSubStrings.add(val);
	            }
		}
	        printLongestString(commonSubStrings);
	     
		}
		}

	
		static void printLongestString(List<String> commonSubStrings) {
			   int index = 0;
		        int largestString = commonSubStrings.get(0).length();
		        for(int i = 0; i < commonSubStrings.size(); i++)
		        {
		            if(commonSubStrings.get(i).length() > largestString)
		            {
		                largestString = commonSubStrings.get(i).length();
		                                index = i;
		            }
		        }
		        System.out.println(largestString);    
		       // System.out.println(largestString);
			}
		
			static String getLongestString(List<String> array) {
	      int maxLength = 0;
	      String longestString = null;
	      for (String s : array) {
	          if (s.length() > maxLength) {
	              maxLength = s.length();
	              longestString = s;
	          }
	      }
	      return longestString;
	  }
	  
	static List<String> substrings(int start, int end, String in){
		 List<String> substrings = new ArrayList<String>();
    for(int c = 0 ; c < in.length() ; c++ )
    {
       for(int i = 1 ; i <= in.length() - c ; i++ )
       {
          String sub = in.substring(c, c+i);
          //System.out.println(sub);
          substrings.add(sub);
          
       }
    }
	return substrings;
	}
	
	/* static List<String> substrings(int start, int end, String in){
		 List<String> substrings = new ArrayList<String>();
	        if(start == in.length() && end == in.length()){
	            return null;
	        }else{
	            if(end == in.length()+1){
	                substrings(start+1,start+1,in);
	            }else{
	            	String res = in.substring(start, end);
	            	substrings.add(res);
	               // System.out.println(res);
	                substrings(start, end+1,in);
	            }
	        }
			return substrings;
	    }
*/
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int nconst = 5 * (int) Math.pow(10, 4);
        int qconst = (int) Math.pow(10,4);
        if((n>=1 && n <= nconst) && (q>=1 && q<=qconst))
        {
        String[] s = new String[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.next();
        }
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            if((x>=0 && x<= n-1) && ( y>=0 && y<=n-1))
            {
            findMax(s,x,y);    
            }
        }
    }
}}
