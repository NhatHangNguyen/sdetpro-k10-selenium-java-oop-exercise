package Lab_03;

public class lab_3_1 {
    /*
     * Count how many odd, even number(s) in an integer array
     * int[] intArr = {1, 2, 3, 4, 5, 98, 50, 75, 99};
     * Even numbers: 4
     * Odd numbers: 5
     * */
    public static void main(String[] args) {

        int[] myIntArray = {1, 2, 3, 4, 5, 98, 50, 75, 99};
        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;
        myIntArray[3] = 4;
        myIntArray[4] = 5;
        myIntArray[5] = 98;
        myIntArray[6] = 50;
        myIntArray[7] = 75;
        myIntArray[8] = 99;

        int countEven = 0;
        int countOdd = 0;

        // for...loop
        for (int index = 0; index < myIntArray.length; index++) {
            if (myIntArray[index] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.printf("Count Even number: %d\n", countEven);
        System.out.printf("Count Odd number: %d\n", countOdd);
    }
}

