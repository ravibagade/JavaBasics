package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<String> List = new ArrayList<String>();
      List.add("Ravi" ) ;
      
      Iterator <String> itr = List.iterator();
      while(itr.hasNext()){  
			System.out.println(itr.next());  
			} 
	}

}
