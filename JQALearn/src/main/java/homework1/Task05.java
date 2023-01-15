package homework1;

public class Task05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            //Check i is the last number and print it without comma
            if (i == 100) {
                System.out.println(i);
                break;
            }

            System.out.print(i + ", ");
        }

        for (int i = 100; i >= 1 ; i--) {
            //Check i is the last number and print it without comma
            if (i == 1) {
                System.out.println(i);
                break;
            }
                System.out.print(i + ", ");
        }
    }
}
