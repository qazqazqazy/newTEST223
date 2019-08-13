import java.util.Scanner;
import java.lang.Math;
public class itog11 {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате:");
        String a = scan.nextLine();
        char[] ms = a.toCharArray();


        int[] msint = new int[ms.length];
        for (int i = 0; i<ms.length; i ++)
        {msint[i] =  Integer.parseInt(String.valueOf(ms[i]));
        }
        int dec =0;
        int tmp = 0;
        for (int i = 0; i < msint.length; i ++) //начальный элемент массива имеет индекс 0, цикл выполняется, пока счетчик  меньше 6, прибавяем
        {
            tmp = (int)Math.pow(2, (msint.length - 1 - i)) * msint[i];
            dec = dec + tmp;
            //System.out.println( msint[i] + "=" + tmp);
        }
        System.out.println("Результат в десятичной системе счисления: " + dec);

    }
}
