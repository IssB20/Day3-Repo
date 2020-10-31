package string_Method;

import java.util.Scanner;
/*
1. Ask user to enter two words. Print first word without its first
character then print the second word without its first character.
              input:      apple
                         banana
            Output:   ppleanana

 */
public class WarmupTask1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("enter first word:");
        String word1 = scan.next();

        System.out.println("enter second word:");
        String word2 = scan.next();

          word1     = word1.substring(1);
          word2     = word2.substring(1);
        System.out.println(word1+word2);







    }
}
