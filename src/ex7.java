import java.util.Scanner;

public class ex7 {

    public static void main(String args[]) {

        int x=10;
        int y=33;
        int z=27;

        System.out.println("Введите значение переменной number:");
        Scanner scan = new Scanner(System.in);
        int  number = scan.nextInt();


        if ((number == x)^(number == y) ^ (number == z)) {

        System.out.println("Данное значение имеется в константах");

        } else  {

            System.out.println("Такой константы нет!");
        }

    }
}
