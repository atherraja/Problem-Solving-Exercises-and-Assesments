package problem.solving.exercises.and.assesments.problem.solving.OOP.Packages;

import java.util.Scanner;
public class MyClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter user name : ");

        String userName = myObj.nextLine();
        System.out.println("Username is : " + userName);
    }
}
