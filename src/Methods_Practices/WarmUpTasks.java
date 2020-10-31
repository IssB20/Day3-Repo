package Methods_Practices;

import java.util.Arrays;

public class WarmUpTasks {
    public static void main(String[] args) {

        maximum(0,-1);

       int arr[]={1,2,3,4,5,87,22,1,1};
        arrIntDescending(arr);









    }


//    1. create a function that can print out the maximum number between two numbers
    public static void maximum(int num1,int num2){
      if(num1!=num2)
        if(num1>num2){
            System.out.println("max is: "+num1);
        }else {
            System.out.println("max is: "+num2);
        }


    }

//    2. create a function that can print out the array of integers in descending order

    public static void arrIntDescending(int[]arr){ // 
        //int [] arr = new int [5];
        Arrays.sort(arr);

        int[] arrDesc= new int[arr.length];
        int k = arr.length-1;
        for (int i = 0 ; i <=arr.length-1; i++){
            arrDesc[i]=arr[k];
            k--;
        }
        System.out.println(Arrays.toString(arrDesc));
    }

/*
 4.  step1: create a function that can check if the given integer is positive, negative or zero
     step2: Use the above method to  write a program that can check every single elements of
     an array of Integers
                               MUST use for each loop
 */

   public static void checkInteger(int num,int arr[]){

       if (num>0){
           System.out.println( num+ " is positive");
       }else if(num<0){
           System.out.println( num+" is negative");
       }else{
           System.out.println(num+" is zero");
       }

   }



}
