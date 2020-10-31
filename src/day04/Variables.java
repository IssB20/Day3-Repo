package day04;
/*
declare the following variables:
  String      employeeName
  int         employeeID
 String           jobTitle
  double            salary
 char            gender (char)
boolean            isFullTime (boolean)
*/

public class Variables {
    public static void main(String[] args) {
         String employeeName = "Alexander";
         String employeeID = "B2020";
         String jobTitle = "SEDT";
         double salary =    120_000.50;
         char  gender = 'M';
         boolean isFullTime = true; // or 10>9 = true;


        System.out.println("employee Name: "+ employeeName);// concatination by using + ""
        System.out.println("employeeID: " +employeeID);
        System.out.println("job Title: "+jobTitle);
        System.out.println("Salary: "+salary + " USD");
        System.out.println("Gender: " +gender);
        System.out.println("Full Time: " +isFullTime);

        





    }





}
