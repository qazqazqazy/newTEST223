import java.util.Scanner;
import java.lang.Math;
public class itog11 {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате:");
        String a = scan.nextLine();
        char[] ms = a.toCharArray();
/*
        int[] msint = new int[ms.length];
        for (int i = 0; i < ms.length; i ++) {
            msint[i] =  Integer.parseInt(String.valueOf(ms[i]));
            }
*/
        int tmp = 0;
        for (int i = 0; i < ms.length; i ++) {
            if (Integer.parseInt(String.valueOf(ms[i])) != 0) {
            tmp = tmp + (int) Math.pow(2, (ms.length - 1 - i));
            }
        }
        System.out.println("Результат в десятичной системе счисления: " + tmp);

    }
}
