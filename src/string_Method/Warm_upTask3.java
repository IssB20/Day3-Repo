package string_Method;
import java.util.Scanner;
/*
  3. Ask user to enter a word. Print true if the first and last characters of the string
  are same characters, print false otherwise.
            Input:
                abba
            Output:
                true
 */
public class Warm_upTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");

        String word = scan.next();
        int length = word.length();
        char first = word.charAt(0);
        char last = word.charAt(length-1);

        System.out.println(""+first+last);

        boolean output = true;
        output  = (first == last)? true : false;

        System.out.println(output);
    }
}
