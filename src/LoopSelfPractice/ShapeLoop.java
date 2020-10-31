package LoopSelfPractice;
/*

    2.  print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *

 */
public class ShapeLoop {
    public static void main(String[] args) {

        int s = 1;

        for (s= 1; s <=8; s++) {
            System.out.println("* * * * * *");

        }

        System.out.println("=========================");

 /*

                    * * * * * *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    * * * * * *
            Hint: in the loop body , only place the statements that you need to repeat

  */
        System.out.println("* * * * * *");
        for (s = 1; s <=8; s++) {
            System.out.println("*         *");
        }
        System.out.println("* * * * * *");





    }
}
