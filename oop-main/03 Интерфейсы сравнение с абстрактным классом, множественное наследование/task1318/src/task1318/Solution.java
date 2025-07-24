package task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
В этой задаче тебе нужно:
Считать с консоли путь к файлу.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.

Requirements:
1. Программа должна считывать c консоли путь к файлу.
2. Программа должна выводить на экран содержимое файла.
3. Поток чтения из файла (FileInputStream) должен быть закрыт.
4. BufferedReader также должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("c:/java/test.txt");
            fileOutputStream.write(file.getBytes());
            fileOutputStream.close();

            InputStream inputStream = new FileInputStream("c:/java/test.txt");


            while (inputStream.available() > 0) {
                int data = inputStream.read();
                System.out.print((char) (data));
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
                System.out.println(e);
        }
        reader.close();
    }
}