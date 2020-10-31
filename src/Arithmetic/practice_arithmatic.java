package Arithmetic;
/*
1. Write a Java program that will print a sum of two numbers Please use variables to store num1,num2,and sum
Sample output:
46 + 90 = 136
2. Write a Java program to convert Fahrenheit to Celcius F=9*C/5+32
3. Write a Java program that converts mile to km 1 mile = 1.609344 km
 */
public class practice_arithmatic {
    public static void main(String[] args) {
       //1
        int num1 = 46;
        int num2 = 90;
        int sum = num1 + num2 ;
        // 46+90= 136
        System.out.println(sum);
         //2 Convert Fahrenheit to Celcius  F=9*C/5+32
        // F-32= 9*C/5 ==>   C= (F-32)*5/9
         double f  = 100;
         double C  = (f-32)*5/9;

        System.out.println(C);


       // converts mile to km 1 mile = 1.609344 km
           double m = 1;
           double km   = m* 1.609344;

           System.out.println(km);











    }




}
