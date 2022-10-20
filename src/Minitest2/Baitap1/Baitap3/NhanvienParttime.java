package Minitest2.Baitap1.Baitap3;

public class NhanvienParttime  extends  Nhanvien {
    int workhours;

    public NhanvienParttime(int id, String name, int ages, double phonenumbers, String email, int workhours) {
        super();
        this.workhours = workhours;
    }

    public NhanvienParttime() {

    }

    public int getWorkhours() {
        return workhours;
    }

    public void setWorkhours(int workhours) {
        this.workhours = workhours;
    }
    public double actualQuantityPart(){
        return this.workhours * 10000;
    }
}
