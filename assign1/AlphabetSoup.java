package com.assignment.assign1;




import java.util.*; 


public class AlphabetSoup {
  String AlphabetsSoup(String str) { 
  
    char[] ch = new char[str.length()];

  for (int i = 0; i < str.length(); i++) {
   ch[i] = str.charAt(i);

  }
    
  Arrays.sort(ch);
  String str1 ="";
  for (int i = 0; i < str.length(); i++) {
   //System.out.print(ch[i]);
   str1= str1+ ch[i];

  }
   return str1;
       

    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    AlphabetSoup as = new AlphabetSoup();
    System.out.print(as.AlphabetsSoup(s.nextLine())); 
  }   
  
}