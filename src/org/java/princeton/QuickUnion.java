package org.java.princeton;

public class QuickUnion {

		private int[] id;
		public QuickUnion(int N)
		{
		id = new int[N];
		for (int i = 0; i < N; i++)
			id[i] = i;
		}
		
		/*
		The Tree Structure is formed by calling union method
		root() method returns the root of the specified element   
		*/
		
		private int root(int i)
		{
		while (i != id[i]) i = id[i];
		return i;
		}
		public boolean Connected(int p, int q)
		{
		return root(p) == root(q);
		}
		public void union(int p, int q)
		{
		int i = root(p);
		int j = root(q);
		id[i] = j;
		}
		
		public static void main(String[] args)
		{
		QuickUnion QuickUnion = new QuickUnion(10);
			// 5-0 3-0 3-8 5-9 0-7 5-4 
		QuickUnion.union(5, 0);
		QuickUnion.union(3, 0);
		QuickUnion.union(3, 8);
		QuickUnion.union(5, 9);
		QuickUnion.union(0, 7);
		QuickUnion.union(5, 4);
		System.out.println("Given set of elements are  Connected");
		System.out.println("Is (0,4) are connected " +QuickUnion.Connected(9, 4));
		System.out.println("Root of 9 is " +QuickUnion.root(9));
		
		}
		
		}