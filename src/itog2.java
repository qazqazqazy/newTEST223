import java.util.Arrays;
import java.util.Scanner;

public class itog2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int j = scan.nextInt();
        int sortArray[] = new int[j];
        int i;
        for (i = 0; i < j; i++) {
            System.out.println("Введите значения следующего элемента массива:");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            sortArray[i] = number;
        }
        System.out.println(Arrays.toString(sortArray));
        instSort(sortArray);
    }

    public static void instSort(int[] sortArray) {  //сортировка вставкой
        int element;
        int indexToInsert;

            for (int index = 0; index < sortArray.length; index ++) {

                element = sortArray[index];
                indexToInsert = index;

                while (indexToInsert > 0 && sortArray[indexToInsert - 1] > element)  {
                    sortArray[indexToInsert] = sortArray[indexToInsert - 1];
                    indexToInsert --;
                    sortArray[indexToInsert] = element;
                }
            }

        System.out.println(Arrays.toString(sortArray));
    }

}