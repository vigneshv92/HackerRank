package org.programs.algorithms;

public class Recursive {
	
    static String in = "probieren";

    public static void main(String[] args) {
        substrings(0,1);
    }

    static void substrings(int start, int end){
        if(start == in.length() && end == in.length()){
            return;
        }else{
            if(end == in.length()+1){
                substrings(start+1,start+1);
            }else{
            	String res = in.substring(start, end);
                System.out.println(res);
                substrings(start, end+1);
            }
        }
    }

}