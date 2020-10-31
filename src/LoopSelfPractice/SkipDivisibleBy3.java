package LoopSelfPractice;
//   1. write a program that can print the numbers between 1 to 100.
//                if the number is divisible by 3, do not print it
public class SkipDivisibleBy3 {
    public static void main(String[] args) {

       // for loop:
        for (int i = 1; i<=100; i++){
            if(i%3==0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();

      //while loop:

       int i=1;
       while (i<=100){
           if(i%3==0){
               i++;
               continue;
           }
           System.out.print(i+" ");
           i++;
       }







    }
}
