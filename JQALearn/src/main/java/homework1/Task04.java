package homework1;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get the value of the work hours from the console
        System.out.println("Please insert work hours");
        int workHours = scan.nextInt();

        // Get the value of the salary from the console
        System.out.println("Please insert salary");
        double salary = scan.nextDouble();

        // Get the value of the day is off or not
        System.out.println("Is it a day off: true or false");
        Boolean isDayOf = scan.nextBoolean();

        // Check the day is off or not and all values of work hours and salary
        if (!(isDayOf)) {
            System.out.println("You are at work");
        } else if(salary >= 10){
            System.out.println("You are gonna to cinema");
        } else if(salary == 0) {
            System.out.println("You are at home and watching TV");
        } else if(salary > 0 && salary < 10) {
            System.out.println("You are gonna for ice cream");
        }
    }
}
