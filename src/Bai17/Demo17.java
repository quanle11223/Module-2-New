package Bai17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Demo17 {
    public static void main(String[] args) throws IOException {
       OutputStream oos = new FileOutputStream("output.txt");
        byte[] bts = new byte[] {'1', 'a', 'f'};
        for (int i = 0; i <bts.length; i++){
            byte b = bts[i];
            oos.write(b);
        }
            oos.close();
    }
}
