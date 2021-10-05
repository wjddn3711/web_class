package web_day17;

import java.io.*;

public class FileRead {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("out.txt"));
        while(true){
            String line = br.readLine();
            if(line==null) break;
            System.out.println(line);

        }
        br.close();
    }
}
