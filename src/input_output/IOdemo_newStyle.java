package input_output;

import java.io.FileWriter;
import java.io.IOException;


public class IOdemo_newStyle {

    public static void main(String[] args) throws IOException {


        writeFile4("Hello world! dfgdfgsg");
        writeFile3("Method try with resources");

    }
    public static void writeFile3(String str) {

        try (FileWriter fileWriter  = new FileWriter("1111.txt");) { // через ";" можно указать много ресурсов
            for (char ch : str.toCharArray()) {
                fileWriter.write(ch);
            }
        } catch (IOException e) {
            System.out.println("!Error");
        }
    }

    public static void writeFile4(String str) {

        try (FileWriter fileWriter  = new FileWriter("4.txt");) {
            fileWriter.write(str);
            fileWriter.write(65);
        } catch (IOException e) {
            System.out.println("!Error");
        }
    }
}
