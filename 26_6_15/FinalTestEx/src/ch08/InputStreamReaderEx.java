package ch08;
import java.io.*;
import java.util.*;

public class InputStreamReaderEx {

    public static void main(String[] args) {
        new FileEx();
    }
}

class FileEx {
    HashMap<String, String> map = new HashMap<String, String>();
    java.io.File file;
    FileInputStream fin;
    InputStreamReader ir;
    BufferedReader br;

    public FileEx() {
        System.out.println("ehlo");
        readWords();
        displayWord();
        searchWord();
    }
    void readWords() {}
    void displayWord() {}
    void searchWord() {}
}
