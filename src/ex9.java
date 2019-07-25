import java.util.Scanner;

public class ex9 {
    public static void main(String[] args)

    {
       int myArray [] = new int[10];
       int i;
       for (i=0; i<10; i++)
       {  System.out.println("Введите значения следующего элемента массива:");
        Scanner scan = new Scanner(System.in);
        int  number = scan.nextInt();
        myArray[i]=number;
           System.out.println("Элемент [" + i +"] : " + myArray[i]);}

        for (i=0; i<10; i++)
        {myArray[i]=myArray[i]*2;
        System.out.println("Новое значение элемента [" + i +"] массива myArray "+ myArray[i]); }

    }

}