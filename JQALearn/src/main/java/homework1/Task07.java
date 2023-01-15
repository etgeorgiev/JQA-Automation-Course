package homework1;

public class Task07 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100 ; i++) {
            // Set a range where the loop will continue to the next number
            if (i >= 54 && i <= 74) {
                continue;
            } else if (i == 100){
                System.out.println(i);
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}
