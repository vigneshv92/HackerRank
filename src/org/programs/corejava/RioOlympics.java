package org.programs.corejava;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class RioOlympics {

	
	public void countMedals(String[] data)
	{
		Map<String,String> Medals = new HashMap<String,String>();
		Map<String,Integer> oneMedals = new HashMap<String,Integer>();
		Map<String,Integer> twoMedals = new HashMap<String,Integer>();
		Map<String,Integer> threeMedals = new HashMap<String,Integer>();
		Medals.put(data[0],data[0]);
		Medals.put(data[1],data[1]);
		Medals.put(data[2],data[2]);	
		if(data.length>0)
		{
			String country = data[0];
			if(oneMedals.containsKey(country))
			{
				int count = 1 + oneMedals.get(country);
				oneMedals.put(country,count);
			}
			else
			{
				oneMedals.put(country, 1);
			
			}
			country = data[1];
			if(twoMedals.containsKey(country))
			{
				int count = 1 + twoMedals.get(country);
				twoMedals.put(country,count);
			}
			else
			{
				twoMedals.put(country, 1);	}
		
			country = data[2];
			if(threeMedals.containsKey(country))
			{
				int count = 1+ threeMedals.get(country);
				threeMedals.put(country,count);
			}
			else
			{
				threeMedals.put(country, 1);
				}}
		
			System.out.println(" =================== Welcome ================= ");
			System.out.println("===================RIO OLYMPICS================");
			System.out.println("===================Score Board=================");
			System.out.println("-------------------updated---------------------");
			for(String medals : Medals.keySet())
			{
				System.out.println(medals +" " +oneMedals.get(medals) + " " +twoMedals.get(medals) + " " +threeMedals.get(medals));
			}
	
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RioOlympics ro = new RioOlympics();
		String[] medals = {"USA","IND","CHN"};
		String[] medals1 = {"CHN","USA","IND"};
		String[] medals2 = {"USA","IND","IND"};
		String[] medals3 = {"USA","CHN","IND"};
		ro.countMedals(medals);
		ro.countMedals(medals1);
		ro.countMedals(medals2);
		ro.countMedals(medals3);
		
		
		
	}

}
