package Minitest2.Baitap1.Baitap3;

public class NhanvienFulltime extends Nhanvien {
        int bonusmoney;
        int finemoney;
        int salarymoney;

    public  NhanvienFulltime(int id, String name, int ages, int phonenumbers, String email, int bonusmoney, int finemoney, int salarymoney) {
        super();
        this.bonusmoney = bonusmoney;
        this.finemoney = finemoney;
        this.salarymoney = salarymoney;
    }

    public NhanvienFulltime() {
        super();
    }

    public int getBonusmoney() {
        return bonusmoney;
    }

    public void setBonusmoney(int bonusmoney) {
        this.bonusmoney = bonusmoney;
    }

    public int getFinemoney() {
        return finemoney;
    }

    public void setFinemoney(int finemoney) {
        this.finemoney = finemoney;
    }

    public int getSalarymoney() {
        return salarymoney;
    }

    public void setSalarymoney(int salarymoney) {
        this.salarymoney = salarymoney;
    }

    public double actualQuantity(){
        return this.salarymoney + (this.bonusmoney - this.finemoney);
    }

}
