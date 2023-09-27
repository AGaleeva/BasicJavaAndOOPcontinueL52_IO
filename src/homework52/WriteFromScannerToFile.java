package homework52;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFromScannerToFile {
    /*
    Задача 1
    Напишите программу, которая позволяет пользователю ввести несколько строк текста (используя Scanner)
    и записать их в текстовый файл (result.txt). Признаком того, что пользователь закончил ввод текста,
    должна служить введенная строка "exit" (естественно, она не должна попадать в итоговый файл.
    */

    public static void main(String[] args) {
        String text = getInputFromScanner();
        writeInputTextToFile(text);
    }

    public static String getInputFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter some text. When you finish, please press key 'enter' and write 'exit'.");
        StringBuilder text = new StringBuilder();
        while (!scanner.hasNext("exit")) {
            text.append(" " + scanner.nextLine());
        }
        return text.toString();
    }
    public static void writeInputTextToFile(String text) {
        try (FileWriter fw = new FileWriter("text_from_scanner.txt");) {
            fw.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
