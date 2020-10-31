package day07;
/*

• 1. Given int z= 198;
• verify that the number of z is even number
• 2. byte a= 30;
•Int  b= b += a; what’s the value of b?
 */


public class practice_task {
    public static void main(String[] args) {

     //1.
        int z = 198;
        boolean even = z % 2 == 0;
        System.out.println( z + " is even: "+ even);
     //2.
         byte a = 30;
        int b = a;
        b += a;
        System.out.println(b);
        System.out.println(3+4);
        System.out.println(3+4+" =5+2");
        System.out.println(3+4+" = 5+2= "+4+3);

        double num = -6;
        if(num > 0){
            System.out.println( num + " is positive number");
        }
        if(num < 0){
            System.out.println( num + " is negative number");
        }
        if(num == 0){
            System.out.println( num + " is zero");
        }



















    }
}
