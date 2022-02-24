package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsExample {
	
	public static void main(String[] args)
	{
		ArrayList<String> string = new ArrayList<String>() ;
		string.add ("ravfi");
		string.add ("ravfi");
		Iterator<String> itr=string.iterator();
		while(itr.hasNext()){  
			System.out.println(itr.next());  
			}  
	}

}
