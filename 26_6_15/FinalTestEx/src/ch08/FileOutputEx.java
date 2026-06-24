package ch08;

import java.io.*;

public class FileOutputEx {

    public FileOutputEx() {
        try {
            File file = new File("/Users/clang_error/01.Java/26_6_15/Output.txt");
            FileOutputStream fos = new FileOutputStream(file,true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("구구단\n");
            for (int i = 1; i<=9; i++) {
                for (int j = 1; j<=9; j++) {
                    bw.write(i+"*"+j+"="+i*j+"\t");
                    if(j==9) bw.newLine();
                }
            }
            bw.close();
        }
        catch(IOException e) {
            System.out.println("파일로 출력할 수 없습니다.");
        }
    }

    public static void main(String[] args) {
        new FileOutputEx();
    }
}
