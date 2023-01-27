package homework2;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Get numbers from the console
        double firstNumber = scan.nextDouble();
        double secondNumber = scan.nextDouble();

        //New variable which get the value from the method
        double avgNumber = getAvgNumber(firstNumber, secondNumber);

        System.out.println(avgNumber);
    }
    /*
    Calculating the average number from two numbers
     */
    private static double getAvgNumber(double firstNumber, double secondNumber) {
       return (double)((firstNumber + secondNumber)/2);
    }
}
