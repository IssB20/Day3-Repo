package string_Method;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     /*
     write a program that asks user to enter two String
     then print the longest String
      */
        System.out.println("Enter your first string:");
          String str1=  scan.nextLine();
         System.out.println("enter your second string:");
          String str2=  scan.nextLine();

         int n1 = str1.length();
         int n2 = str2.length();
         String longestString = "";
         if(n1>n2){
             longestString = str1;
         }else{
             longestString = str2;
         }
        System.out.println("The longest string is:"+"\n"+longestString);



    }
}
