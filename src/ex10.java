import java.util.Scanner;

public class ex10 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите  размерность матрицы (шаг 1):");
        int a = scan.nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите  размерность матрицы (шаг 2):");
        int b = sc.nextInt();

        int tablе[][] = new int[a][b];
        int i, j;
        for (i = 0; i < a; ++i)
            {for (j = 0; j < b; ++j)
                {System.out.println("Введите значения элементов массива: элемент "  + i + j);
                Scanner n = new Scanner(System.in);
                int  number = n.nextInt();
                tablе[i][j] = number;
                System.out.println("Элемент [" + i + j +"] : " + tablе[i][j]);}}

        for (i = 0; i < 1; i++) {
            for (j = 0; j < b; ++j) {
                tablе[i][j] = tablе[i][j] * 3;
                System.out.println("Новое значение элемента [" + i + j + "]  массива tablе: " + tablе[i][j]);
            }
        }
    }

}