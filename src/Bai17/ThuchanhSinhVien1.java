package Bai17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ThuchanhSinhVien1 {
    public static void writeToFile(String path, List<ThuchanhSinhVien> thuchanhSinhViens) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(thuchanhSinhViens);
            oos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<ThuchanhSinhVien> thuchanhSinhViens = new ArrayList<>();
        thuchanhSinhViens.add(new ThuchanhSinhVien(1, "Vũ Kiều Anh", "Hà Nội"));
        thuchanhSinhViens.add(new ThuchanhSinhVien(2, "Nguyễn Minh Quân", "Hà Nội"));
        thuchanhSinhViens.add(new ThuchanhSinhVien(3, "Đặng Huy Hoà", "Đà Nẵng"));
        thuchanhSinhViens.add(new ThuchanhSinhVien(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        thuchanhSinhViens.add(new ThuchanhSinhVien(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("Student.txt", thuchanhSinhViens);
        List<ThuchanhSinhVien>thuchanhSinhViens1 = readDataFromFile("student.txt");
        for (ThuchanhSinhVien thuchanhSinhVien : thuchanhSinhViens1){
            System.out.println(thuchanhSinhVien);
        }
    }

    public static List<ThuchanhSinhVien> readDataFromFile(String path) {
        List<ThuchanhSinhVien> thuchanhSinhViens = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            thuchanhSinhViens = (List<ThuchanhSinhVien>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return thuchanhSinhViens;
    }
}
