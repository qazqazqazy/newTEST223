import java.io.*;
class ex16 {
    public static void main(String args[]) {
        String s;

        try (BufferedReader br =
                     new BufferedReader(new FileReader("newtest.txt"))){
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        }
        catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
