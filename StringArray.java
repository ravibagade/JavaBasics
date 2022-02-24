package com.collections;

public class StringArray {

	public static void main(String[] args)  {
		String[] str1 = new String[] {"Ravi", "Bagade"} ;
		
		for(int i = 0 ; i <= str1.length-1; i++)
		{
		System.out.print(str1[i]+  "  " );
		}
		
	
		System.out.println( "=======  " );
		for(int i = 0 ; i <= str1.length-1; i++)
		{
		System.out.println(str1[i]+  "  " );
		String temp = str1[i+1];
				
	
		}
	
		for(int i = 0 ; i <= str1.length-1; i++)
		{
		System.out.println(str1[i]+  "" );
		}

	}

}
