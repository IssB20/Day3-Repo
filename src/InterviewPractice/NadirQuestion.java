package InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class NadirQuestion {
    
    /*
java coding
=> Given an array of integers. how do you put zeros at the end of array without sorting an array?
For example: input: [4,5,0,0,2,0,1,0] output: [4,5,2,1,0,0,0,0]
 */

    public static void main(String[] args) {
        int [] arr1 = {4,5,0,0,2,0,1,0}; // ==> {4,5,2,1,0,0,0,0}
        int arr2 [] = new int [arr1.length];
        int k = arr2.length-1;
        
        for (int i = 0 ; i <= arr1.length-1; i++){
            if (arr1[i]==0){
                arr2[k] = arr1[i];
                k--;
            }
        }
        System.out.println(Arrays.toString(arr2));

        System.out.println("===========================");
        int a = arr2.length-1;
        for (int j =0; j < arr2.length; j++){
            if (arr2[j] == 0){
                arr2[a] = arr2 [j];
                a--;
            }else{
                arr2[j] = arr2[j];
            }


        }
        //
        System.out.println(Arrays.toString(arr2));

        System.out.println("================================");



    }


}
