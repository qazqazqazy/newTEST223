import java.util.Scanner;

public class ex6 {

    public static void main(String args[]) {
        System.out.println("Введите x:");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextInt(); //так как мы хотим получить точное среднее арифметическое, устанавливаем тип double

        System.out.println("Введите y:");
        double y = scan.nextInt();

        double aver;

        System.out.println("Введите z:");
        double z = scan.nextInt();

        aver = (x + y + z)/3;
        System.out.println("Среднее арифметическое трех введенных чисел:" + aver);

        int a = (int) aver/2; //преобразуем тип данных

        if (a>3)
            System.out.println("Программа выполнена корректно");

    }
}
