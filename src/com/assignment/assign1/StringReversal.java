package com.assignment.assign1;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}

}