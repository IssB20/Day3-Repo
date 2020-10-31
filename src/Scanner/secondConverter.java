package Scanner;
import java.util.*;
public class secondConverter {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.println("Enter seconds: ");

        int inputSeconds = input.nextInt();
        int hours = inputSeconds/3600;
        int minutes = inputSeconds%3600/60;
        int seconds = inputSeconds%60;
        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");












    }
}
