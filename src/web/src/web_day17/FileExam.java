package web_day17;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileExam {
    public static void main(String[] args) throws IOException {
//        FileOutputStream output = new FileOutputStream("out.txt");
//        for (int i = 1; i < 11; i++) {
//            String data = i +"번째 줄입니다. \n";
////            output.write(data.getBytes(StandardCharsets.UTF_8));
//
//        }
        FileWriter fw = new FileWriter("out2.txt");
        for (int i = 0; i < 10; i++) {
            String data= i+1 +"번째 줄입니다.\n";
            fw.write(data);
        }

        fw.close();
    }
}
