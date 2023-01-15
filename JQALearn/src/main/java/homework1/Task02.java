package homework1;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get all number from the console
        System.out.println("Please insert your first number in type Integer");
        int firstNumber = scan.nextInt();

        System.out.println("Please insert your second number in type Integer");
        int secondNumber = scan.nextInt();

        System.out.println("Please insert your third number in type Double");
        double thirdNumber = scan.nextDouble();

        System.out.println("Please insert your fourth number in type Double");
        double fourthNumber = scan.nextDouble();

        // Cast Integer number to Double and print it
        double firstNumberToDouble = firstNumber;
        System.out.println("First number: " + firstNumber);
        System.out.println("First number in Double: " + firstNumberToDouble);

        // Cast Integer number to Double and print it
        double secondNumberToDouble = secondNumber;
        System.out.println("Second number: " + secondNumber);
        System.out.println("Second number in Double: " + secondNumberToDouble);

        // Cast Double number to Integer and print it
        int thirdNUmberToInteger = (int)thirdNumber;
        System.out.println("Third number: " + thirdNumber);
        System.out.println("Third number in Integer: " + thirdNUmberToInteger);

        // Cast Double number to Integer and print it
        int fourthNumberToInteger = (int)fourthNumber;
        System.out.println("Fourth number: " + fourthNumber);
        System.out.println("Fourth number in Integer: " + fourthNumberToInteger);
    }
}
