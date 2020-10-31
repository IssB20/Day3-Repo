package day9_practices;

import java.sql.SQLOutput;

/*1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and check whether a triangle
is valid or not.
          Note: MUST use if&else statement

 */
public class If_else_Practices {
    public static void main(String[] args) {

        int a1 = 40;
        int a2 = 50;
        int a3 = 100;

        if(a1+a2+a3==180){
            System.out.println("trianle is valid");
        }else{
            System.out.println("trangle is not valid");
        }
/*
2. write a program that can check if the two characters (chars) are same characters
            if same, print: "Same characters"
            otherwise, print: "Different characters"
*/
        System.out.println("============================");
        char  a = 'A';
        char  b = 'B';
        if(a==b){
            System.out.println(a +", "+ b + " Same character");
        }else{
            System.out.println(a +", "+ b + " Different character");
        }

        System.out.println("================================");
/*
3. SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,
  2004-2006 and 2015-2017.
   write a program that can check if the vehicle is eligible to recall.
        if eligible, print: true
        otherwise: false
*/
      int y= 2009;

      boolean recall = y==1995||y==1998||y==2001||y==2002||y==2004||y==2006||y==2015||y==2017;

     if(recall == true){
         System.out.println("true");
     }else{
         System.out.println("false");
     }








    }
}
