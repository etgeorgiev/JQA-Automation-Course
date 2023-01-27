package homework2;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] numbers = new double[5];

        //Get the values of the array from console with using for loop
        for (int i = 0; i < 5; i++) {
            numbers[i] = scan.nextDouble();
        }

        //Print the values of the array
        System.out.print("The values of the array are: ");
        for (double i: numbers) {
            System.out.print(i + " ");
        }
    }
}
