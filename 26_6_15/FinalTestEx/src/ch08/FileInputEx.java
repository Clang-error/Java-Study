package ch08;

import java.io.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class FileInputEx {
        HashMap<String,String> dic = new HashMap<>();
        public FileInputEx() {
            File file = new File("/Users/clang_error/01.Java/26_6_15/ExcelEx.csv");
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(file);
                InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
                BufferedReader br = new BufferedReader(isr);
                String str;
                String[] words = new String[2];
                while((str=br.readLine())!=null) {
                    System.out.println(str);
                    words=str.split(",");
                    dic.put(words[0], words[1]);
                }
                System.out.println("곰");
                System.out.println(dic);
                br.close();

            } catch (FileNotFoundException e) {
                System.out.println("읽을 파일이 없습니다.");
                throw new RuntimeException(e);
            } catch (IOException e) {
                System.out. println("파일을 읽을 수 없습니다.");
                throw new RuntimeException(e);
            }
        }

    public static void main(String[] args) {
        new FileInputEx();
    }
}
