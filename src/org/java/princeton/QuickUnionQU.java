package org.java.princeton;
import java.util.*;

public class QuickUnionQU {
	  private int[] id;
	  private int[] sz;
	  private int count;

	  public QuickUnionQU(int N) {
	    count = N;
	    id = new int[N];
	    sz = new int[N];
	    for (int i = 0; i < N; i++) {
	      id[i] = i;
	      sz[i] = 0;
	    }
	  }

	  private int root(int i) {
	    while (i != id[i]) {
	      i = id[i];
	    }
	    return i;
	  }

	  public boolean connected(int p, int q) {
	    return root(p) == root(q);
	  }

	  public void union(int p, int q) {
	    int i = root(p);
	    int j = root(q);
	    if (i == j) return;
	    if (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i]; }
	    else { id[j] = i; sz[i] += sz[j]; }
	  }

	  public void display() {
	    StringBuilder temp = new StringBuilder();
	    temp.append("");

	    for(int i = 0; i < count; i++) {
	      temp.append(id[i]);
	      temp.append(" ");
	    }
	    String strI = temp.toString();
	    System.out.println(strI);
	  }

	  public static void main(String[] args)
	  {  
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter the Value : ");
		  int N = s.nextInt();
	    //int N = StdIn.readInt();
    	QuickUnionQU qu = new QuickUnionQU(N);
	    while(!(N==0))
	    {
	      int p =  s.nextInt();
	      int q =  s.nextInt();
    	if (!qu.connected(p, q)) {
	       qu.union(p, q);
	       System.out.println(p + " " + q);
	      }
	    }
	    qu.display();
	  }
	}