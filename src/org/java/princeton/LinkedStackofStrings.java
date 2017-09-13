package org.java.princeton;

public class LinkedStackofStrings 
{
	private Node first = null;
	
	private class Node
	{
		String item;
		Node next;
	}

	public boolean isEmpty()
	{
		return first == null;
	}
	
	public void push(String item)
	{
	Node oldfirst = first;
	first = new Node();
	first.item = item;
	first.next = oldfirst;
	}
	
	public String pop()
	{
		String item = first.item;
		first = first.next;
		return item;
	}
	
	public static void main(String [] args)
	{
		LinkedStackofStrings lss = new LinkedStackofStrings();
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
	}}