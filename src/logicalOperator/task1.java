package logicalOperator;
/*
Task01:
     write a program that can check if number is positive negative or equals to zero.
        for example:
     num  = 1                      num = -6                       num = 0  print:  zero
    prints: 1 is positive number   print: 6 is negative number


 */
public class task1 {
    public static void main(String[] args) {
        ;

        int num = -9;

        if (num > 0) {
            System.out.println(num + " is positive number");
        }
        if (num < 0) {
            System.out.println(num + " is negative number");
        }

        if (num == 0) {
            System.out.println(num + " equal to zero");
        }


    }


}