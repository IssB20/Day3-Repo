package LoopSelfPractice;


import java.util.Scanner;
/* 3. Write a program that calculates the sum of numbers entered by the user
      until user enters a negative number.

      hint: you need an infinite loop
 */
public class LoopSumUntilNegative {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the numbers:");

        int  sum = 0;

        for ( int i = 0 ; i ==0;  ){
            int num = scan.nextInt();

            if(num <0){
                break;
            }
            sum += num ;
        }

        System.out.println("the total of numbers entered is: "+sum);

    }
}


