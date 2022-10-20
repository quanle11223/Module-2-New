package Bai12.ThucHanh;

public class Student3 implements Comparable <Student3> {
    public String name;
    public int ages;
    public String address;

    public Student3() {

    }
    public Student3(String name, int ages, String address) {
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
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
    public int compareTo(Student3 student3){
        return this.getName().compareTo(student3.getName());
    }
}
