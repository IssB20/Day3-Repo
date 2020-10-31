package LoopSelfPractice;

import java.util.Scanner;

/*
 4. Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2* 1 = 120
 */
public class FactorialNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int factorial = 1;

        for ( int i = num; i >=1; i--){

            factorial *= i;
        }
        System.out.println("The factorial of "+num+" is: "+factorial);

    }
}
