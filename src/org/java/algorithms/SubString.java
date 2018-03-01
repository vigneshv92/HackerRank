package org.programs.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SubString {

	static void findMax(String a1, String a2,int x,int y)
	{
//		String a = s[x];
//		String b = s[y];
		List<String> Subofa = substrings(0,1,a1);
		List<String> Subofb = substrings(0,1,a2);
		List<String> commonSubStrings = new ArrayList<String>();
		Iterator<String> itr=Subofa.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());

        }
        for (String val : Subofa) {
            if (Subofa.contains(Subofb)) {
            	commonSubStrings.add(val);
            }
	}
        String str = getLongestString(commonSubStrings);
        System.out.println(str.length());
        
        //System.out.println(Collections.max(commonSubStrings));    
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
	
	   public static void main(String[] args) {
		   String a1 = "probieran";
		   String a2 = "birkerem";
	        findMax(a1,a2,0,1);
	    }
}
