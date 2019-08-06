import java.io.*;
class ex18 {
    public static void main(String args[]) {
        String s;

        int count = 0;
        try (BufferedReader br =
                     new BufferedReader(new FileReader("newtest.txt"))) {

            while ((s = br.readLine()) != null) {
                System.out.println(s);
                count++;
            }
            System.out.println("Количество строк в исходном файле равно " + count);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }

        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Наберите " + count + "  стр. для перезаписи в файл");
        try (FileWriter fw = new FileWriter("newtest.txt")) {
            for (int i=0; i<count; i ++) {
                System.out.print(">> ");
                str = br.readLine();
                str = str + "\r\n";
                fw.write(str);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }

    }
}