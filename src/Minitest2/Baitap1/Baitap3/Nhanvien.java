package Minitest2.Baitap1.Baitap3;

public class Nhanvien {
    int id;
    String name;
    int ages;
    double phonenumbers;
    String email;

    public Nhanvien() {

    }
    public Nhanvien(int id, String name, int ages, double phonenumbers, String email){
        this.id = id;
        this.name = name ;
        this.ages = ages;
        this.phonenumbers = phonenumbers;
        this.email = email;
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

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public double getPhonenumbers() {
        return phonenumbers;
    }

    public void setPhonenumbers(double phonenumbers) {
        this.phonenumbers = phonenumbers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
