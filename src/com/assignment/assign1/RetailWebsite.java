package com.assignment.assign1;

import java.util.*;
public class RetailWebsite {
   public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   double amt;
   
   String user="";
   String word;
   double amount1;
   System.out.println("Enter amount of the bill");
   amt = sc.nextDouble();
   amount1=amt;
   System.out.println("Are you an employee of the store");
   System.out.println("Enter yes or no");
   word = sc.next();
   if(word.equals("yes") || word.equals("YES"))
        user = "employee";
    System.out.println("Are you an affiliate of	the store");
    System.out.println("Enter yes or no");
    word = sc.next();
   if(word.equals("yes") || word.equals("YES"))
        {
            if(user.isEmpty())
                user = "affiliate";
        }
    System.out.println("Are you a customer for  over 2 years");
    System.out.println("Enter yes or no");
    word = sc.next();
   if(word.equals("yes") || word.equals("YES"))
   {
     if(user.isEmpty())
        user = "customer";
   }
   System.out.println("Did you buy groceries");
   System.out.println("Enter yes or no");
   word = sc.next();
   if(word.equals("yes") || word.equals("YES"))
   {
        user = "groceries";
   }
   
   switch(user)
   {
       case "employee":
           amt = amt*.7;
           break;
        case "affiliate":
            amt = amt*.9;
            break;
        case "customer":
            amt = amt*.95;
            break;
        case "groceries":
            break;
   }
   if(amount1>100){
       amt = amt*.95; 
   }
   System.out.println(amt);
   
}
    
   
    
}