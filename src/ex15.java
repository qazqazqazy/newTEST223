import java.util.Arrays;

public class ex15 {

    public static void main (String[] args) {
        int[] startArray = {3, 1, 50, 10, 17, 3, 23, 11, 5, 25, 7};
        System.out.println(Arrays.toString(startArray));
        bubbleSort(startArray);
    }

    public static void bubbleSort (int[] sortArray) {
        int counter;

        do {
            counter = 0;
            for (int index = 0; index < sortArray.length - 1; index ++) {
                if (sortArray[index] > sortArray[index + 1]) {
                    int tmp = sortArray[index];
                    sortArray[index] = sortArray[index + 1];
                    sortArray[index + 1] = tmp;
                    counter ++;
                }
            }
        } while (counter > 0);

        System.out.println(Arrays.toString(sortArray));
    }

}