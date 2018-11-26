package interview.practice.io.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String args[]) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\test.txt");

        fileOutputStream.write(65);
        fileOutputStream.close();
        System.out.println("Success");

    }
}
