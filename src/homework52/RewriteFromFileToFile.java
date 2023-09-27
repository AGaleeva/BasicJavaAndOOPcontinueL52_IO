package homework52;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RewriteFromFileToFile {
    /*
    Задача 2
    Дан файл с текстом, например из первой задачи (result.txt). Ваша задача прочитать этот файл и создать на диске его
    копию, в которой все символы заданные параметром ch1 будут заменены символом заданным в ch2. Например:
    Файл 1: "Есть только миг" ch1='г' ch2='ф'
    Файл 2: "Есть только миф"
    */
    public static void main(String[] args) {
        String str = readFile();
        writeReadFileToNewFile(str);
    }

    public static String readFile() {
        try (FileReader fileReader = new FileReader("file_to_read.txt");) {
            int data;
            StringBuilder stringBuilder = new StringBuilder();
            char ch1 = 'г';
            char ch2 = 'р';
            while ((data = fileReader.read()) != -1) {
                if (data == ch1) {
                    data = ch2;
                }
                stringBuilder.append((char) data);
            }
            System.out.println();
            return stringBuilder.toString();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Read file error");
        }
        return null;
    }


    public static void writeReadFileToNewFile(String str) {
        try (FileWriter fileWriter = new FileWriter("file_to_write.txt");) {
            fileWriter.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
