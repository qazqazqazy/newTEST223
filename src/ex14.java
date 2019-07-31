import java.util.Scanner;

public class ex14 {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        String S = scan.nextLine(); //записываем в переменную s
        int X  = Integer.parseInt(S); //преобразуем в int
        double Y = X;
        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);

    }

}
