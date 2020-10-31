package ConstructorPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Google {

    /*
     4. create a class called Google
            -create 5 objects of the Tester and 5 objects of Developer
            -create an arrayList of Tester and an ArrayList of Developer,
               store those 5 objects of the Tester & Developers
            -use for each loop to iterate Tester & Developer objects from in those arrayLists
            -print out the tester & developer who has the highest salary
     */

    public static void main(String[] args) {

        Tester tester1 = new Tester("Kary",25,'F',1111,"SDET",125000);
        Tester tester2 = new Tester("Amel",30,'F',2222,"SDET",135000);
        Tester tester3 = new Tester("Islem",35,'M',3333,"SDET",145000);
        Tester tester4 = new Tester("Frank",45,'M',4444,"SDET",120000);
        Tester tester5 = new Tester("Amar",33,'M',5555,"SDET",124000);

        Developer developer1 = new Developer("Louis",45,'M',5566,"JavaDev",155000);
        Developer developer2 = new Developer("mani",55,'F',6666,"C#Dev",145000);
        Developer developer3 = new Developer("kashi",35,'M',7777,"JavaDev",165000);
        Developer developer4 = new Developer("jani",33,'F',8888,"JavaDev",105000);
        Developer developer5 = new Developer("Ben",40,'M',9999,"JavaDev",167000);

        ArrayList<Tester> testers = new ArrayList<Tester>( Arrays.asList(tester1,tester2,tester3,tester4,tester5) );
        ArrayList<Developer> developers = new ArrayList<Developer>(Arrays.asList( developer1,developer2,developer3,developer4,developer5));

        // print tester and developer with highest salary:


        double max1 = tester1.salary;

        for (Tester eachTester: testers) {
            if (max1 < eachTester.salary) {
                max1 = eachTester.salary;
            }
        }
        for (Tester eachTester : testers){
            if ( eachTester.salary== max1){
                System.out.println("Tester with Highest salary:\n"+eachTester);
            }
        }

        System.out.println("==============================");

        double max2 = developer1.salary;

        for (Developer eachDeveloper : developers){
            if (eachDeveloper.salary>max2){
                max2 = eachDeveloper.salary;
            }
        }

        for (Developer eachDeveloper : developers){
            if ( eachDeveloper.salary == max2){
                System.out.println("Developer with Highest Salary:\n"+eachDeveloper);
            }
        }



    }
}
