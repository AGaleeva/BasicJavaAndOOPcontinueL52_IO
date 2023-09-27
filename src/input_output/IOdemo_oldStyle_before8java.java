package input_output;

import java.io.FileWriter;
import java.io.IOException;

public class IOdemo_oldStyle_before8java {
    public static void main(String[] args) throws IOException {

        writeFile("Hello world!");
        writeFile2("Hello world! dfgdfgsg");

    }

    public static void writeFile(String str) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("1111.txt");
            for (char ch : str.toCharArray()) {
                fileWriter.write(ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("close error");
            }
        }
    }

    public static void writeFile2(String str) throws IOException {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("1111.txt");
            for (char ch : str.toCharArray()) {
                fileWriter.write(ch);
            }
            fileWriter.flush(); // команда, которая говорит системе записать уже имеющуюся информацию,
                                // ресурс еще не закрыт, но информация уже записана
        } finally {
            fileWriter.close();
        }
    }
}
