package org.java.princeton;

public class QuickFindUF {
	  private int[] id;
	  private int count;

	  // constructor
	  // Given N, create an array with N elements
	  public QuickFindUF(int N) {
	    count = N;
	    id = new int[N];
	    for (int i = 0; i < N; i++) {
	      id[i] = i;
	    }
	  }

	  // if values of two index are the same,
	  // return true, else false
	  public boolean connected(int p, int q) {
	    return id[p] == id[q];
	  }

	  // connect two nodes
	  public void union(int p, int q) {
	    for (int i = 0; i < count; i++) {
	      if (id[i] == id[p]) {
	        id[i] = id[q];
	      }
	    }
	    System.out.println(p + " " + q);
	  }

	  public void print() {
	    StringBuilder temp = new StringBuilder();
	    temp.append("");

	    for(int i = 0; i < count; i++) {
	      temp.append(id[i]);
	      temp.append(" ");
	    }
	    String strI = temp.toString();
	    System.out.println(strI);
	  }

	  public static void main(String[] args) {
	    QuickFindUF qf = new QuickFindUF(10);
	    qf.union(5,6);
	    qf.print();
	    qf.union(0,9);
	    qf.print();
	    qf.union(9,3);
	    qf.print();
	    qf.union(2,1);
	    qf.print();
	    qf.union(7,0);
	    qf.print();
	    qf.union(4,8);
	    qf.print();
	  }
	}