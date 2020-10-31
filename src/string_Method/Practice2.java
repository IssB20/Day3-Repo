package string_Method;

import java.util.Scanner;

/*Warmup tasks:
1. Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input: xcode
                    Output:  code
 */
public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /* System.out.println("enter word1");
        String word1 = scan.next();
        if(word1.startsWith("x")){
            System.out.println(word1.substring(1));
        }
        System.out.println("======================================");
/*
2. Ask user to enter a word. If the first or second or both letter of the word is x,
print the word without x(s). If x is the third letter it should be printed. If the first and
 second are x, both should be ignored.
      Input: xxode  Output: ode    Input:   oxidex   Output:   oidex
 */
      /*  System.out.println("enter word2");
          String word2 =scan.next();
     if(word2.startsWith("x")  || word2.charAt(1)=='x') {
         if (word2.startsWith("x") && word2.charAt(1) != 'x') {
             System.out.println(word2.substring(1));

         }else if(word2.charAt(0)!='x' && word2.charAt(1)=='x'){
             System.out.println(""+word2.charAt(0)+word2.substring(2));
         }else if(word2.startsWith("xx")){
             System.out.println(word2.substring(2));
         }
     }else {
         System.out.println(word2);
     }
        System.out.println("=====================================================");

  /*

3. Ask user to enter two words. Then add them together and print. But if the last letter
of the first word and the first letter of the last letter is the same, print that character once.
                    Input:  one
                                 eight
                         Output:            oneight
   */
       /* System.out.println("Enter 1st word:");
        String word3 = scan.next();

        System.out.println("Enter 2sd word:");
        String word4 = scan.next();

         if(word3.charAt(word3.length()-1)== word4.charAt(0)) {
             System.out.print(word3+word4.substring(1));

         }else{
             System.out.println(word3+word4);
         }
        System.out.println("=====================");
/*
4. write a program that asks user's first and last name, then prints out the initials of the user

                input:
                    cybertek
                    batch20
                output:
                    your initial is: CB
        DO NOT use charAt meth
 */
     /*   System.out.println("enter your first name:");
        System.out.println("enter your last name:");
           String firstName = scan.next();
           String lastName  = scan.next();

        System.out.println(firstName.toUpperCase().substring(0,1)+lastName.toUpperCase().substring(0,1));
        System.out.println("========================================================================");
/*
5. write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method
      */
        //solution1  = using substring();
       String str = "Java";
             System.out.println(str.substring(3)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1));

          // solution 2 = using charAt();

        System.out.println(str.charAt(str.length()-1)+""+str.charAt(str.length()-2)+""+str.charAt(str.length()-3)+
               ""+ str.charAt(0));

 /*
 6. write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo
  */
        System.out.println("enter your email address: ");
           String email = scan.next();
           String domain ="";

        domain ="the domain of the email is: "+email.substring(email.indexOf('@')+1,email.indexOf('.'));

       // domain= (email.endsWith("gmail.com"))? "the domain of the email is: gmail":
       // email.endsWith("yahoo.com")?  "the domain of the email is: yahoo" : "Invalid Email!";

        System.out.println(domain);







    }
}
