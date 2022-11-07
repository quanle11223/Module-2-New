package CaseStudyAgribank;

import java.io.Serializable;

public class AgribankOffline extends Agribank implements Serializable {
    public String recipientsDocument;

    public AgribankOffline() {
    }

    public AgribankOffline(String rcipientsDocument) {
        this.recipientsDocument = rcipientsDocument;
    }

    public AgribankOffline(String name, String phoneNumber, String dateOfBirth, String address, String placeOfBirth, String rcipientsDocument) {
        super(name, phoneNumber, dateOfBirth, address, placeOfBirth);
        this.recipientsDocument = rcipientsDocument;
    }

    public String getRecipientsDocument() {
        return recipientsDocument;
    }

    public void setRecipientsDocument(String recipientsDocument) {
        this.recipientsDocument = recipientsDocument;
    }

    @Override
    public String toString() {
        return "AgribankOffline{" +
                "Họ và Tên: '" + name + '\'' +
                ", Số điện thoại: '" + phoneNumber + '\'' +
                ", Ngày sinh: '" + dateOfBirth + '\'' +
                ", Địa chỉ hiện tại: '" + address + '\'' +
                ", Nguyên quán: '" + placeOfBirth + '\'' +
                "Nơi gửi hồ sơ: '" + recipientsDocument + '\'' +
                '}';
    }
}
