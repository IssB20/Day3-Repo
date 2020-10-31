package LoopSelfPractice;

import java.util.Scanner;

//1. write a program that asks user to enter 5 numbers and returns the maximum number
public class FiveNumMax {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i =1;
        int max = -2147483648;
        while(i<=5) {
            System.out.println("enter a number");
            int num = scan.nextInt();
            if (num > max) {
                max=num;
            }
            i++;

        }

        System.out.println("the max number is:"+max);



    }
}
