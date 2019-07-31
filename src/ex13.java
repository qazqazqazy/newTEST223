
import java.util.Scanner;

public class ex13 {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку для сравнения");
        String str1 = scan.nextLine();
        //Scanner sc = new Scanner(System.in);
        System.out.println("Введите вторую строку для сравнения");
        String str2 = scan.nextLine();
        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 > len2) {
            System.out.println(str1);
        }
        else if (len1 < len2) {
            System.out.println(str2); }
        else {
            System.out.println("Длины строк равны");
        }
    }

}

