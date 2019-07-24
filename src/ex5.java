import java.util.Scanner;

public class ex5 {

    public static void main(String args[]) {
        System.out.println("Введите число:");
        Scanner scan = new Scanner(System.in);
        int  number = scan.nextInt();

        int a1= number * 1;
        int a2 = number * 2;
        int a3 = number * 3;
        int a4 = number * 4;
        int a5 = number * 5;
        int a6 = number * 6;
        int a7 = number * 7;
        int a8 = number * 8;
        int a9 = number * 9;
        int a10 = number * 10;

        System.out.println("Выводим таблицу умножения для числа " + number);

        System.out.println("1 * " + number +  " = " + a1);
        System.out.println("2 * " + number + " = " + a2);
        System.out.println("3 * " + number + " = " + a3);
        System.out.println("4 * " + number + " = " + a4);
        System.out.println("5 * " + number + " = " + a5);
        System.out.println("6 * " + number + " = " + a6);
        System.out.println("7 * " + number + " = " + a7);
        System.out.println("8 * " + number + " = " + a8);
        System.out.println("9 * " + number + " = " + a9);
        System.out.println("10 * " + number + " = " + a10);
    }
}
