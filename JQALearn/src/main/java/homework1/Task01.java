package homework1;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Start scanning for all numbers with Scanner
        System.out.println("Please insert the first number");
        int firstNumber = scan.nextInt();
        System.out.println("Your first number is: " + firstNumber);

        System.out.println("Please insert the second number");
        int secondNumber = scan.nextInt();
        System.out.println("Your second number is: " + secondNumber);

        System.out.println("Please insert your third number");
        int thirdNumber = scan.nextInt();

        // Check which number is bigger firstNumber or secondNumber
        if (firstNumber > secondNumber) {

            //Check that the thirdNumber is between the others numbers and print the result
            if (thirdNumber > secondNumber && thirdNumber < firstNumber){
                System.out.println(thirdNumber + " is between " + secondNumber + " and " + firstNumber);
            } else {
                System.out.println(thirdNumber + " isn't between " + secondNumber + " and " + firstNumber);
            }
        } else {
            if (thirdNumber < secondNumber && thirdNumber > firstNumber){
                System.out.println(thirdNumber + " is between " + firstNumber + " and " + secondNumber);
            } else {
                System.out.println(thirdNumber + " isn't between " + firstNumber + " and " + secondNumber);
            }
        }
    }
}
