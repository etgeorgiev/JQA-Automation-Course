package homework1;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please insert number from 1 to 7");
        int dayOfWeek = scan.nextInt();

        // Check the number and print the day of the week
        switch (dayOfWeek) {
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thursday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
            case 7:
                System.out.println("The day is Sunday");
                break;

            default:
                System.out.println("Your are inserted wrong number");
        }
    }
}
