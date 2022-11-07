package CaseStudyAgribank;

import java.io.Serializable;

public class AgribankOnline extends Agribank implements Serializable {
    public String rceivingAddress;

    public AgribankOnline(String rceivingAddress) {
        this.rceivingAddress = rceivingAddress;
    }

    public AgribankOnline(String name, String phoneNumber, String dateOfBirth, String address, String placeOfBirth, String rceivingAddress) {
        super(name, phoneNumber, dateOfBirth, address, placeOfBirth);
        this.rceivingAddress = rceivingAddress;
    }

    public String getRceivingAddress() {
        return rceivingAddress;
    }

    public void setRceivingAddress(String rceivingAddress) {
        this.rceivingAddress = rceivingAddress;
    }

    @Override
    public String toString() {
        return "AgribankOnline{" +
                "Họ và tên: '" + name + '\'' +
                ", Số điện thoại " + phoneNumber +
                ", Ngày sinh: '" + dateOfBirth + '\'' +
                ", Địa chỉ: '" + address + '\'' +
                ", Nguyên quán: '" + placeOfBirth + '\'' +
                " Địa chỉ nhận thẻ: '" + rceivingAddress + '\'' +
                '}';
    }
}
