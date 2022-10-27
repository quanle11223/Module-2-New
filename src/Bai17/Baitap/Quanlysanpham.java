package Bai17.Baitap;

import java.io.Serializable;

public class Quanlysanpham implements Serializable{
    public int id;
    public String name;
    public String hangSanXuat;
    public int price;
    public String moTaKhac;

    public Quanlysanpham(){

    }

    public Quanlysanpham(int id, String name, String hangSanXuat, int price, String moTaKhac) {
        this.id = id;
        this.name = name;
        this.hangSanXuat = hangSanXuat;
        this.price = price;
        this.moTaKhac = moTaKhac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMoTaKhac() {
        return moTaKhac;
    }

    public void setMoTaKhac(String moTaKhac) {
        this.moTaKhac = moTaKhac;
    }
    @Override
    public String toString() {
        return "Quanlysanpham{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", price=" + price +
                ", moTaKhac='" + moTaKhac + '\'' +
                '}';

    }
}
