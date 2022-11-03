package TestYTB.Tudien111.TestMaSinhVien;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class TestFileSinhVien {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\JAVA Module 2\\Thuc Hanh\\Thuc-hanh-bai-tap-OOP\\src\\TestYTB\\Tudien111\\Test73.java\\SinhVien.txt");
            OutputStream outputStream = new FileOutputStream("SinhVien.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            SinhVien svOb = new SinhVien("le anh quan", "123", 1993, 12);
            objectOutputStream.writeObject(svOb);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Exception e) {

        }
    }
}
