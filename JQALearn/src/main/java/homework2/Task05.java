package homework2;

import org.w3c.dom.ls.LSOutput;

public class Task05 {
    public static void main(String[] args) {
        /* Default array */
        int[] numbers = {10, 12, 1, 8, 4};

        /* First kind for copy the array with method .clone() */
        int[] firstCopyOfNumbers = numbers.clone();

        /* Second kind for copy the array with for loop */
        int[] secondCopyOfNumbers = new int[numbers.length];

        for (int i = 0; i < secondCopyOfNumbers.length; i++) {
            secondCopyOfNumbers[i] = numbers[i];
        }

        /* Printing default array*/
        System.out.print("Default array: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }

        /* Printing first copy of the array*/
        System.out.println();
        System.out.print("First copy of the array: ");
        for (int i : firstCopyOfNumbers) {
            System.out.print(i + " ");
        }

        /* Printing second copy of the array*/
        System.out.println();
        System.out.print("Second copy of the array: ");

        for (int i : secondCopyOfNumbers) {
            System.out.print(i + " ");
        }
    }

}
