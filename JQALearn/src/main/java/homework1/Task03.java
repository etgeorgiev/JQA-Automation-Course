package homework1;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get three numbers from the console
        System.out.println("Please insert your first number");
        int firstNumber = scan.nextInt();

        System.out.println("Please insert your second number");
        int secondNumber = scan.nextInt();

        System.out.println("Please insert your third number");
        int thirdNumber = scan.nextInt();

        // Print all numbers with their original value
        System.out.println("Your first number is: " + firstNumber);
        System.out.println("Your second number is: " + secondNumber);
        System.out.println("Your third number is: " + thirdNumber);

        // Create new variable for save the value of one number. And change the values of all numbers
        int check = 0;
        check = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
        thirdNumber = check;

        // Print the new value of all numbers
        System.out.println("Your new first number is: " + firstNumber);
        System.out.println("Your new second number is: " + secondNumber);
        System.out.println("Your new third number is: " + thirdNumber);

        // Printing the result from an equation
        System.out.println("(" + firstNumber + " + " + secondNumber + ")" + " - " + thirdNumber + " = " + ((firstNumber+secondNumber)-thirdNumber));
    }
}
