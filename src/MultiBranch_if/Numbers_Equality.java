package MultiBranch_if;
/*
2. write a program that can check the equality of the three given numbers
            declare 3 numbers n1, n2, n3
            if n1 and n2 are equal and not equal to n3  => n1&n2 are equal
            if n2 and n3 are equal and not equal to n1==> n2&n3 are equal
            if n3 and n1 are equal and not equal to n2 ==>n3&n1 are equal
            if all equal ==> all equal
            if none of them are equal ==> none of them are equal

 */
public class Numbers_Equality {
    public static void main(String[] args) {
        int n1 = -100;
        int n2 = -100;
        int n3 = -100;
        String equal ="";

        if(n1==n2 && n1!=n3){
            equal="n1 & n2 are equal";
        }else if(n2==n3 && n2!=n1){
            equal ="n2 & n3 are equal";
        }else if(n1==n2 && n1==n3){
            equal = " all equal";
        }else if (n1==n3 && n1!=n2){
            equal = "n1 & n3 are equal";
        }else{
            equal = " None of them are equal";
        }
        System.out.println(equal);




    }
}
