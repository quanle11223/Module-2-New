package TestYTB.Tudien111.TestMaSinhVien;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhsachSinhvien    {
    public ArrayList<SinhVien> danhSach;

    public DanhsachSinhvien() {
        this.danhSach = new ArrayList<SinhVien>();
        danhSach.add(new SinhVien("Quan", "11", 1993, 10));
    }

    public DanhsachSinhvien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public void addSinhVien(SinhVien sv) {
        this.danhSach.add(sv);
    }

    public void printDanhSachSv() {
        for (SinhVien sinhvien : danhSach) {
            System.out.println(sinhvien);
        }
    }

    public boolean checkDanhsachSv() {
        return this.danhSach.isEmpty();
    }

    public int laySoLuongSv() {
        return this.danhSach.size();
    }


    public void lamTrongDanhSachSv() {
        this.danhSach.removeAll(danhSach);
    }

    public boolean kiemTraTonTaiSv(String id) {
        for (SinhVien code : danhSach) {
            if (code.getIdSv().contains(id)) {
                return true;
            }

        }
        return false;
    }

    public boolean xoaMotSinhVien(SinhVien sv) {
        return this.danhSach.remove(sv);
    }

    public void timSvTheoTen(String ten) {
        for (SinhVien sinhVien : danhSach) {
            if (sinhVien.getName().indexOf(ten) >= 0) {
                System.out.println(sinhVien);
            }
        }
    }

    public void sapXepSinhVien() {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getDiemTb() < o2.getDiemTb()) {
                    return 1;
                } else if ((o1.getDiemTb()) > o2.getDiemTb()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
    public void luuSinhVienVaoFile(Scanner scanner) throws IOException {
        try {
            String inputscanner = scanner.nextLine();
            File file = new File(inputscanner);
            OutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            for (SinhVien sinhVien : danhSach) {
                objectOutputStream.writeObject(sinhVien);
            }


            objectOutputStream.flush();
            objectOutputStream.close();
            } catch (Exception ex) {
            throw new RuntimeException(ex);
        }



        }
        public void readSinhVienTuFile(File f) throws IOException {
            try {
                File file = new File("E:\\JAVA Module 2\\Thuc Hanh\\Thuc-hanh-bai-tap-OOP\\SinhVien.txt");
                InputStream inputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                SinhVien sinhVien = (SinhVien) objectInputStream.readObject();
                System.out.println(sinhVien);

                objectInputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

