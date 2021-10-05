package web_day17;

import com.sun.xml.internal.xsom.impl.ForeignAttributesImpl;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteExam {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("out3.txt");
        for (int i = 0; i < 11; i++) {
            String data = i+1 +"번째 줄입니다.";
            pw.println(data);
        }
        pw.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("out.txt", true));
        for (int i = 11; i < 21; i++) {
            String data = i+1+"번째 줄입니다.";
            pw2.println(data);
        }
        pw2.close();
    }

}
