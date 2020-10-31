package Arithmetic;
/*
task03:
            create a class called Swap, and write a program that can swap two variables' values wihtout
            using temporary
             variable
                    Ex:
                        int a =10;
                        int b= 15;
                    output:
                        System.out.println(a); ===> 15
                        System.out.println(b); ===> 10
double a = 1.41;
double b = 0;
a += (b - (b = a));
System.out.println("a = " + a + ", b = " + b);

 */
public class Swap {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        b = a + 5;
        a = b - 5;
        System.out.println(a);
        System.out.println(b);

        System.out.println("a = "+b);
        System.out.println("b = "+a);










    }



}
