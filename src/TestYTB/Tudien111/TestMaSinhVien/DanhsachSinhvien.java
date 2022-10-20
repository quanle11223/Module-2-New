package TestYTB.Tudien111.TestMaSinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhsachSinhvien {
    public ArrayList<SinhVien> danhSach;

    public DanhsachSinhvien(){
        this.danhSach = new ArrayList<SinhVien>();
    }
    public DanhsachSinhvien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }
    public void addSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }
    public void printDanhSachSv(){
        for (SinhVien sinhvien: danhSach) {
            System.out.println(sinhvien);
        }
    }
    public boolean checkDanhsachSv(){
       return this.danhSach.isEmpty();
    }
    public int laySoLuongSv(){
        return this.danhSach.size();
    }
    public void lamTrongDanhSachSv() {
        this.danhSach.removeAll(danhSach);
    }
    public boolean kiemTraTonTaiSv(SinhVien sv){
        return this.danhSach.contains(sv);
    }
    public boolean xoaMotSinhVien(SinhVien sv){
         return this.danhSach.remove(sv);
    }
    public void timSvTheoTen(String ten){
        for (SinhVien sinhVien: danhSach) {
            if (sinhVien.getName().indexOf(ten) >= 0){
                System.out.println(sinhVien);
            }
        }
    }
    public void sapXepSinhVien(){
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getDiemTb() < o2.getDiemTb()) {
                    return -1;
                } else if ((o1.getDiemTb()) > o2.getDiemTb()){
                    return 1;
                } else{
                    return 0;
                }
            }
        });
    }


}
