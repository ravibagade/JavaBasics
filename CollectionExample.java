package com.collections;

import java.util.*; 
public class CollectionExample {
	
	public static void main(String[] args)
	{
		ArrayList<String> List = new ArrayList<String>() ;
		List.add("Ravi");
		
		
		Iterator<String> itr=List.iterator();
		while(itr.hasNext()){  
			System.out.println(itr.next());  
			}  
		
	}

}
