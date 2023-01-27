package homework2;

public class Task06 {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {2, 2, 3};

        /* Check are the arrays same with method which return boolean value*/
        if (checkArraysIsSame(firstArray, secondArray)) {
            System.out.println("The arrays are same");
        } else {
            System.out.println("The arrays are different");
        }
    }

    private static boolean checkArraysIsSame(int[] firstArray, int[] secondArray) {
        /* First check the length of the arrays */
        if ((firstArray.length != secondArray.length)) {
            return false;
        } else {
            /* If the length are the same, we compare every value of the array */
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
