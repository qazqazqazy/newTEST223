import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int j = scan.nextInt();
        int myArray[] = new int[j];
        {int   i;
            for (i = 0; i < j; i++) {
                System.out.println("Введите значения следующего элемента массива:");
                Scanner sc = new Scanner(System.in);
                int number = sc.nextInt();
                myArray[i] = number;
                System.out.println("Элемент [" + i + "] : " + myArray[i]);
            }

            for (i = 0; i < j; i++) {
                myArray[i] = myArray[i] * 2;
                System.out.println("Новое значение элемента [" + i + "] массива myArray " + myArray[i]);
            }

        }
    }
}