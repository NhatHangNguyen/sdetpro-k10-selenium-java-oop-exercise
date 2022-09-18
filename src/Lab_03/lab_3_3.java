package Lab_03;

import java.util.Arrays;

public class lab_3_3 {
    /*
     * Sort an integer array from min to max
     * Input: {12, 34, 1, 16, 28}
     * Expected output: {1, 12, 16, 28, 34}
     * */

    public static void main(String[] args) {

        int[] myIntArray = {12, 34, 1, 16, 28};

        System.out.println("The original array is: ");
        for (int num : myIntArray) {
            System.out.print(num + " ");
        }
        Arrays.sort(myIntArray);
        System.out.println("\nThe sorted array is: ");
        for (int num : myIntArray) {
            System.out.print(num + " ");
        }
    }
}
