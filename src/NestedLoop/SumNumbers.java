package NestedLoop;

import java.util.Scanner;

/*
Warmup tasks:
    1. write a program that will ask user to enter two numbers and calculates
    the sum of those two numbers. then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
    but while the answer is not a valid answer (not yes or no), the the program
    should repeatedly ask the user re-enter.
            HINT: nested loop task, outer loop need to be an infinite loop

 */
public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("enter a number:");
        //int num1 = scan.nextInt();
       // int num2 = scan.nextInt();


        //
        int sum = 0;
            for (int i = 1; i <= 2; i++) {
                System.out.println("enter a number");
                int num = scan.nextInt();
                sum += num;
            }
        System.out.println(sum);

        System.out.println("do you want to continue?");
        String answer =scan.next();


        for(int i =1; i>0;i++) {
            if (!answer.equalsIgnoreCase("yes") || !answer.equalsIgnoreCase("no")) {
                System.out.println("re-enter");
                int num = scan.nextInt();
                num = scan.nextInt();
                sum+=num;
            } else if (answer.equalsIgnoreCase("yes")) {
                for (int k = 1; k <= 2; k++) {
                    System.out.println("enter a number");
                    int num = scan.nextInt();
                    sum += num;

                }
            } else {

            }

        }



    }
}
