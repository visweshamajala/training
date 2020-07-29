package com.assignment.assign1;

public class Longest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        String s = "Java is programming language";
	        String[] word = s.split( " " );
	       
	        String rts = " ";

	        for ( int i = 0; i < word.length; i++ )
	        {
	            if ( word[i].length() > rts.length() )
	                rts = word[i];

	        }
	        System.out.println( rts );
	    

	}

}
