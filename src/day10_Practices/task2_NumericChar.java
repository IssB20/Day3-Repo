package day10_Practices;
/*
2. write a program that can identify if the given character character is Digit
                ex:
                    character = '1'
                output:
                    1 is a Digit
                    character  = '!'
                output:
                    ! is not a digit
 */
public class task2_NumericChar {
    public static void main(String[] args) {
        char c = 33;
        boolean digit= c >=48 && c<=57;
        boolean notDigit = !digit;
        boolean alphabetic = c >= 65 && c <= 90 || c>=97 && c<=122;
        if( digit==true){
            System.out.println(c+ " is a digit");
        }else{
            System.out.println(c+ " is not a digit");
        }

        System.out.println("================================");
        /*
        3. write a program that can identify if the given character is a symbol
                ex:
                    character = '!'
                output:
                    ! is a symbol
                    character  = 'a'
                output:
                    a is not a symbol
         */


         boolean symbol = !digit && ! alphabetic;

      if(symbol==true){
          System.out.println(c+ " is a symbol");
      }else{
          System.out.println(c+ " is not a symbol");
      }










    }
}
