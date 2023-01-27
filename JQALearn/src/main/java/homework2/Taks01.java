package homework2;

import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Taks01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Get numbers from the console
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();

        //Use this method for making gathering of the two numbers
        int sum = sumTwoNumbers(firstNumber, secondNumber);

        System.out.println(sum);
    }
    /*
    Аdds two numbers
     */
    public static int sumTwoNumbers(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}

