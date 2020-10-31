package LoopSelfPractice;

import java.util.Scanner;

/*
 7. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
            input: 100
            output: 5050
            input: 50
            output: 1275
            input : 200
            output : 20100

 */
public class loopScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = scan.nextInt();
        int t = 0;
        for (int n =1 ; n<=num; n+=1){
            t=t+n;
            System.out.print(t+" ");
        }
    }
}
