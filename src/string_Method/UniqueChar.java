package string_Method;

import java.util.Scanner;

/*
1. write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd

 */
public class UniqueChar {
    public static void main(String[] args) {
      //  Scanner scan = new Scanner(System.in);
        //System.out.println("enter a string");
       // String str = scan.nextLine();

       String  str = "aabccd";
       String  str2 ="";


       for (int i = 0 ; i <= str.length()-1; i ++){
           char ch = str.charAt(i); // a a b c c d;
           if( !str2.contains(""+str.charAt(i))){
               str2+=ch;
           }
       }
       System.out.println(str2); // abcd

       for( int i = 0 ; i <= str2.length()-1; i++) {
           char ch = str2.charAt(i); // abcd
           int count = 0;
           String uniq = "";
           for (int j = 0; j <= str.length() - 1; j++) {
               char ch2 = str.charAt(j); //aabccd
               if (ch == str.charAt(j)) {
                   count += 1;
               if(count ==1){
                   uniq+=ch;
                   System.out.println(""+ch);
               }
               }

           }

           System.out.print("" + count + ch);
       }
        System.out.println();


        System.out.println("==========================");

        String unique ="";
       int count =0;
        for ( int i =0 ; i <= str.length()-1; i++){
            char ch = str.charAt(i);
            if( str.indexOf(str.charAt(i))== str.lastIndexOf(str.charAt(i))){
                unique+=str.charAt(i);
            }
        }

        System.out.println(unique);

    }
}
