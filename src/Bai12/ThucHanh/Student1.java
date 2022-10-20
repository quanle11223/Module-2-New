package Bai12.ThucHanh;

public class Student1 {

    public String name;
    public int ages;
    public String address;

    public Student1() {
    }

    public Student1(String name, int ages, String address) {
        this.name = name;
        this.ages = ages;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student@name=" + name + ",age=" + ages + ",address=" + address;
    }
}
