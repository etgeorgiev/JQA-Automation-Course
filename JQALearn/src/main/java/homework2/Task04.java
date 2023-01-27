package homework2;

public class Task04 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        //Printing with for loop
        System.out.print("Printing array with for loop: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int count = 0;

        //Printing with while loop
        System.out.print("Printing tha array with while loop: ");
        while (count < numbers.length){
            System.out.print(numbers[count] + " ");
            count++;
        }
    }
}
