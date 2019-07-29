import java.util.Scanner;
public class ex12 {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите  строку:");
        String str = scan.nextLine();
        String sr = str.replace(" ", "");
        System.out.println(sr);

    }
}

