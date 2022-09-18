package Lab_03;

public class lab_3_4 {

    /*
    * Merge 2 SORTED integer array into one SORTED array
    * Array 01: {1, 12, 16, 28, 34}
    * Array 02: {1, 13, 16, 27, 99}
    * Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}
    * */

    public static void main(String[] args) {

        // Merge 2 array
        int[] firstArr = {1, 12, 16, 28, 34};
        int[] secondArr = {1, 13, 16, 27, 99};

        int ARR_LENGTH = firstArr.length + secondArr.length;
        int [] mergeArray = new int[ARR_LENGTH];
        int i = 0;
        for (int arrayElement : firstArr) {
            mergeArray[i] = arrayElement;
            i++;
        }
        for (int arrayElement : secondArr) {
            mergeArray[i] = arrayElement;
            i++;
        }
        // Sort up ascending
        for (int j = 0; j < ARR_LENGTH; j++) {
            for (int k = 0; k < ARR_LENGTH ; k++) {
                if(mergeArray[j] < mergeArray[k]){
                    int tg = mergeArray[j];
                    mergeArray[j] = mergeArray[k];
                    mergeArray[k] = tg;
                }
            }
        }
        for (int j = 0; j < ARR_LENGTH; j++) {
            System.out.println(mergeArray[j]);
        }

    }
}
