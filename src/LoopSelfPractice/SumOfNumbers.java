package LoopSelfPractice;
/*
    4. write a program that can calculate the sum of all numbers between 1 to 100
    5. write a program that can calculate the sum of all the even numbers between 1 ~ 100
    6. write a program that can calculate the sum of all the odd numbers between 1 ~ 100
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        int n = 1;
        int t = 0;
        for (n=1; n<=100; n += 1){
            t = t + n;
            System.out.print(t+" ");
        }
        System.out.println();
        System.out.println("=====================================");
        int n2 = 2;
        int t2 = 0;
        for (n2 =2 ;n2<=100; n2+=2){
            t2=t2+n2;
            System.out.print(t2+" ");
        }
        System.out.println();
        System.out.println("=======================================");

        int n3 = 1;
        int t3 = 0;
        for (n3 = 1; n3<100; n3+=2){
            t3=t3+n3;

                System.out.print(t3+" ");

        }








    }
}
