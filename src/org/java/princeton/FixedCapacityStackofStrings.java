package org.java.princeton;

public class FixedCapacityStackofStrings 
{
 	private String [] s;
 	private int N =0;
 	public FixedCapacityStackofStrings()
 	{
 		
 	}
 	public FixedCapacityStackofStrings(int Capacity)
 	{
 		s = new String[Capacity];
 	}
 	public boolean isEmpty()
 	{
 		return N==0;
 	}
 	public void push(String item)
 	{
 		s[N++]= item;
 	}
 	public String pop()
 	{
 		String item = s[--N];
 		s[N] = null;
 		return item;
 	}

 	public static void main(String [] args)
	{
 		FixedCapacityStackofStrings lss = new FixedCapacityStackofStrings(10);
		lss.push("first");
		lss.push("In");
		lss.push("-");
		lss.push("last");
		lss.push("out ");
		lss.push("-");
		lss.push("is followed in");
		lss.push("Stack");
		lss.push("Data Structure");
		System.out.println("Push Operation Completed");
		System.out.println(lss);
		lss.pop();
		System.out.println("Pop Operation Completed");
		System.out.println(lss);
	}
 	
}
