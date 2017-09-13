package org.java.princeton;

public class QuickFind0 {
	
	private static int[] id;
	public QuickFind0(int N)
	{
	 id = new int[N];
	for (int i = 0; i < N; i++)
	id[i] = i;
	}
	 public boolean Connected(int p, int q)
	{
	return id[p] == id[q];
	}
	
	 public void union(int p, int q)
	{
	int pid = id[p];
	for (int i = 0; i < id.length; i++)
	if (id[i] == pid) id[i] = id[q];
	}
	 
	public static void main(String []args)
	{
		QuickFind0 QuickFind = new QuickFind0(10);
		// 5-0 3-0 3-8 5-9 0-7 5-4 
		QuickFind.union(5, 0);
		QuickFind.union(3, 0);
		QuickFind.union(3, 8);
		QuickFind.union(5, 9);
		QuickFind.union(0, 7);
		QuickFind.union(5, 4);
		System.out.println("Given set of elements are  Connected");
		System.out.println("Is (0,4) are connected " +QuickFind.Connected(9, 4));
		
		
	}

}


