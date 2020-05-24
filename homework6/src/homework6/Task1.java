package homework6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
//Прочесть информацию введеную из клавиатури и записать в созданный вами 
//txt файл, если введена "stop" строка тогда закончить запись в файл.
public class Task1 {
    public static void main(String[] arg) {
        File file = new File("C:/Users/Admin/eclipse-workspace2/homework6/src/homework6/task1.txt");

        try(PrintWriter printWriter = new PrintWriter(file);
            Scanner scan = new Scanner(System.in)){
            String text = scan.next();

            while (!text.equals("stop")){
                printWriter.write(text);
                printWriter.write("\n");
                text = scan.next();
            }

        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}