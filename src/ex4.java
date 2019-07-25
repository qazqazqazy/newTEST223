import java.util.Scanner;
public class ex4 {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате:");
        String a = scan.nextLine();

        int b= Integer.parseInt(a, 2);
        System.out.println(b);

    }
}
