package string_Method;
import java.util.Scanner;
/*
 2. Write a Java method to display the middle character of a string
        a) If the length of the string is even there will be two middle characters.
        b) If the length of the string is odd there will be one middle character.
                Input :
                    elephant
                Output:
                    The middle character in the string: ph

 */
public class Warm_Up_Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        int length = word.length();
        String result ="";
        if(length %2 ==0){
            result =""+ word.charAt(length/2-1)+word.charAt(length/2);
        }else{
            result =""+ word.charAt(length/2);
        }

        System.out.println(result);
    }
}
