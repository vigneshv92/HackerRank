package org.java.princeton;

public class QuickFind {
	
    public static int id[];
    
    public QuickFind(int N)
    {
     
      id = new int[N];
      for(int i=0;i<N;i++)
      {
    	  id[i]=i;
    	  System.out.println("The Elements in Array N " +id.toString());
    	  System.out.println("Length of Array N is " +id.length);
      }
    }
    public static boolean connected(int p,int q)
   
    {
    	return id[p]==id[q];
    }
    
    public static void union(int p,int q)
    {
    	int pid = id[p];
    	int qid= id[q];
    	for(int i=0;i<id.length;i++)
    	{
    		if(id[i]==pid)
    			id[i]=qid;
    	}
    }
    
    public static void main(String[] args)
    {
	 QuickFind qf= new QuickFind(10);
	 System.out.println(qf.id);
	 for(int p = 0;p<10;p++)
		 for(int q=1;q<10;q++)
	 {
		 union(p,q);
		 System.out.println("Connected elements are  (" +p+ "," +q+")" );
	 }
	 
//	 union(1,2);
//	 union(3,4);
//	 union(5,7);
//	 union(9,0);
	 
	 System.out.println("Is (1,2) Connected :" +connected(1,2));
	 System.out.println("Is (3,4) Connected :" +connected(3,4));
	 System.out.println("Is (5,7) Connected :" +connected(5,7));
	 System.out.println("Is (9,0) Connected :" +connected(9,0));
	 System.out.println("Is (1,0) Connected :" +connected(1,0));
	 
    }
    
   }
