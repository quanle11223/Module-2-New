package TestYTB.Tudien111.TestMaSinhVien;

import java.io.Serializable;
import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>, Serializable {
    public String name;
    public String idSv;
    public int namSinh;
    public float diemTb;

    public SinhVien(String idSv){
        this.idSv = idSv;
    }
    public SinhVien(String name, String idSv, int namSinh, float diemTb) {
        this.name = name;
        this.idSv = idSv;
        this.namSinh = namSinh;
        this.diemTb = diemTb;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdSv() {
        return idSv;
    }

    public void setIdSv(String idSv) {
        this.idSv = idSv;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(float diemTb) {
        this.diemTb = diemTb;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + name + '\'' +
                ", idSv='" + idSv + '\'' +
                ", namSinh=" + namSinh +
                ", diemTb=" + diemTb +
                '}';
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.idSv.compareTo(idSv);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return namSinh == sinhVien.namSinh && Float.compare(sinhVien.diemTb, diemTb) == 0
                && name.equals(sinhVien.name) && idSv.equals(sinhVien.idSv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, idSv, namSinh, diemTb);
    }
}
