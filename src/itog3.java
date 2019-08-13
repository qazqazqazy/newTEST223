import java.util.Scanner;

public class itog3 {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара: ");
        double kurs = scan.nextDouble();
        System.out.println("Введите сумму в рублях:");
        double rub = scan.nextDouble();
        System.out.println("Курс доллара: " +  Math.ceil(kurs*100)/100);
        System.out.println("Количество рублей: : " + Math.ceil(rub*100)/100);
        System.out.println("Итого: " + Math.ceil((rub/kurs)*100)/100 + " долларов");
    }
}