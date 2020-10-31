package Task03;
/*
  2. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF
 */
public class NestedIf_practice {
    public static void main(String[] args) {
        int age =55;
        String name ="";

        if(age>0 && age<150){
            if(age<21){
                name="Teenager";
            }else if(age>55){
                name="Senior";
            }else{
                name = "Adult";
            }
        }else{

        }
        System.out.println(name);



        int year= 4;
        String result ="";
        switch(year){
            case 1 :
                result="January";
                break;
            case 2:
                result="February";
                break;
            case 3:
                result ="March";
                break;
            case 4:
                result= "April";
                break;

                default:
                result="Invalid";
        }

        System.out.println(result);




    }
}
