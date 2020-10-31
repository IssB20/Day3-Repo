package Arrays_Practice;
import java.util.Arrays;
import java.util.Scanner;

/*
2. write a program that can find the unique words from an array of string
 */
public class UniqueWord {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);

        String [] arr = {"milk","pot","pot","bread","bread","iskem"};
        //String s = "";


        for(int i =0 ; i <= arr.length-1 ; i++) {
            String s = arr[i];
            int count = 0;
            for (int j = 0; j <= arr.length-1; j++) {
                String each = arr[j];
                if(s.equals(each)) {
                    count+=1;
                }
              }
                if (count == 1) {
                System.out.println(s);
            }

        }
        System.out.println("==================================");

        String str = "islem ouiddir";
        String [] arr2 = str.split(" ");
        System.out.println(Arrays.toString(arr2));

        char [] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));

    }
}
