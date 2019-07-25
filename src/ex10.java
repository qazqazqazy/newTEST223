import java.util.Scanner;

public class ex10 {

    public static void main(String[] args)
    {
        int tablе[][] = new int[4][4];
        int i, j;
        for (i=0; i<4; ++i)
        {  for (j=0; j<4; ++j)
        {System.out.println("Введите значения элементов массива: элемент "  + i + j);
            Scanner scan = new Scanner(System.in);
            int  number = scan.nextInt();
            tablе[i][j] = number;
            System.out.println("Элемент [" + i + j +"] : " + tablе[i][j]);}}

        for (i=0; i<4; i++) {
            for (j = 0; j < 1; ++j) {
                tablе[i][j] = tablе[i][j] * 3;
                System.out.println("Новое значение элемента [" + i + j + "]  массива tablе: " + tablе[i][j]);
            }
        }
    }

}