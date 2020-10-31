package LoopSelfPractice;
/*
1-write a program that will print out all letters in english alphabet in ascending order.
2-write a program that will print out all alphabet letter in descending order.
 */
public class AlphabetLoop {
    public static void main(String[] args) {

     //for loop:
        int num = 65;
        char ch =65;
        //System.out.println(ch);
       for (num = 65 ; num<=90; num+=1){
           System.out.print((char)num);

       }
        System.out.println();
        System.out.println("==================");
    // while loop:

       char c ='A';
       while(c<='Z'){
           System.out.print(c);
           c++;
       }
        System.out.println();
        System.out.println("++++++++++++++++++++");

        char c1 ='Z';
        while (c1>='A'){
            System.out.print(c1);
            c1--;
        }



    }
}
