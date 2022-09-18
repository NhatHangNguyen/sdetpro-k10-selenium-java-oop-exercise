package Lab_03;

public class lab_3_2 {
    /*
     * Finding maximum value/minimum value from an integer array
     * int[] intArr = {1, 2, 3, 4, 5};
     * Minimum: 1
     * Maximum: 5
     * */
    public static void main(String[] args) {

        int[] intArr = {1, 2, 3, 4, 5};
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        intArr[3] = 4;
        intArr[4] = 5;

        int minArray = intArr[0];
        int maxArray = intArr[0];

        // for loop
        for (int index = 0; index < intArr.length; index++) {
            if(intArr[index] < minArray){
                minArray = intArr[index];;
            }
            if (intArr[index] > maxArray){
                maxArray = intArr[index];
            }
        }
        System.out.printf("Minimum value: %d\n", minArray);
        System.out.printf("Maximum value: %d\n", maxArray);


    }
}

