package org.programs.corejava;
import java.util.*;

public class CoreJava {
	
	int rollno;
	String name;
	String dept;
	public CoreJava(int rollno,String name,String dept)
	{
		this.rollno = rollno;
		this.name = name;
		this.dept = dept;
	}
	
	public void getdetails(int rollno,String name,String dept)
	{
		String datastructures;
		String algorithms;
		String designpatterns;
		String framework = null;
	  while(rollno>0||name!=null||dept!=null)
	  {
		  if(dept == "CSC")
		  {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the marks in datastructures");
		datastructures = s.next();
		System.out.println("Enter the marks in algorithms");
		algorithms = s.next();
		System.out.println("Enter the marks in designpatterns");
		designpatterns = s.next();
		System.out.println("do u have knowledge on any framework  Y/N : ");
		String choice = s.next();
		if(choice =="Y")
		{
			System.out.println("Enter the Framework name :");
			framework = s.next();
			
		}
		else
		 {
			System.out.println("Enter a valid dept"); 
		 }
		
		System.out.println(datastructures);
		System.out.println(algorithms);
		System.out.println(designpatterns);
		System.out.println(framework);
	
		
	  }}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CoreJava c = new CoreJava(1,"Vignesh","CSC");
      c.getdetails(1, null, "CSC");
      
  
	}

}
