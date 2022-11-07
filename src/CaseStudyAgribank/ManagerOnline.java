package CaseStudyAgribank;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ManagerOnline implements Serializable {
    ArrayList<AgribankOnline> agribankOnlineArrayList;
    int choiceSub;
    Scanner sc = new Scanner(System.in);
    public static final String NAME_REGEX = "^[a-z\\sA-Z]{3,20}$";
    public static final String PHONE_REGEX = "^[0-9]{10}$";
    public static final String DATE_OF_BIRTH_REGEX = "^[0-9]{2}+\\.[0-9]{2}+\\.[0-9]{4}$";
    public static final String ADDRESS_REGEX = "^[a-z\\sA-Z\\s0-9]{1,100}$";
    public static final String PLACE_OF_BIRTH_REGEX = "^[a-z\\sA-Z\\s0-9]{1,100}$";
    public static final String RECIVING_ADDRESS_REGEX = "^[a-z\\sA-Z\\s0-9]{1,100}$";


    public ManagerOnline() {
        this.agribankOnlineArrayList = new ArrayList<>();
    }

    public ManagerOnline(ArrayList<AgribankOnline> agribankOnlineArrayList) {
        this.agribankOnlineArrayList = agribankOnlineArrayList;
    }

    public void addInformationA(AgribankOnline agr) {
        agribankOnlineArrayList.add(agr);
    }

    public void displayAllInformation() {
        for (AgribankOnline s : agribankOnlineArrayList) {
            System.out.println("Thông tin Quý khách vừa đăng ký là: " + s);
        }
    }

    public void updateInformation() {
        System.out.println("Bạn có chắc chắn xóa toàn bộ thông tin vừa nhập: ");
        System.out.println("Chọn '1'. Xác nhận xóa để nhập lại thông tin.");
        System.out.println("Chọn '2'. Hủy bỏ.");
        choiceSub = sc.nextInt();
        if (choiceSub == 1) {
            deleteAllInformatin();
            System.out.println("Thông tin bạn vừa nhập đã xóa, vui lòng nhập lại thông tin mới: ");
            AgribankOnline agribankOnline = inputInformation();
            addInformationA(agribankOnline);
        } else if (choiceSub == 2) {
            System.out.println(" ");

        }
    }

    public void deleteAllInformatin() {
        agribankOnlineArrayList.removeAll(agribankOnlineArrayList);
    }

    public void sendInformation() {
        int choice = 0;
        System.out.println("Bạn chắc chắn muốn gửi bản thông tin này: ");
        System.out.println("Chọn '1'. Xác nhận: ");
        System.out.println("Chọn '2'. Hủy bỏ");
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Bạn đã gửi thành công, chúng tôi sẽ gửi Xác nhận đến Số điện thoại đã đăng ký.");
        } else if (choice == 2) {
            System.out.println("Bạn hãy kiểm tra lại thông tin. ");
        }
    }

    public AgribankOnline inputInformation() {
        String inputName;
        String inputPhoneNumber;
        String inputDateOfBirth;
        String inputAddress;
        String inputPlaceOfBirth;
        String inputRecivingAddress;

        do {
            System.out.println("Nhập Họ và Tên đăng ký: ");
            inputName = sc.nextLine();
        } while (!Pattern.matches(NAME_REGEX, inputName));
        do {
            System.out.println("Nhập số điện thoại đăng ký: ");
            inputPhoneNumber = sc.nextLine();
        } while (!Pattern.matches(PHONE_REGEX, inputPhoneNumber));
        do {
            System.out.println("Nhập ngày sinh của Khách hàng (định dạng: dd.mm.yyyy): ");
            inputDateOfBirth = sc.nextLine();
        } while (!Pattern.matches(DATE_OF_BIRTH_REGEX, inputDateOfBirth));
        do {
            System.out.println("Nhập địa chỉ hiện tại: ");
            inputAddress = sc.nextLine();
        } while (!Pattern.matches(ADDRESS_REGEX, inputAddress));
        do {
            System.out.println("Nhập Nguyên quán: ");
            inputPlaceOfBirth = sc.nextLine();
        } while (!Pattern.matches(PLACE_OF_BIRTH_REGEX, inputPlaceOfBirth));
        do {
            System.out.println("Nhập Nơi nhận Thẻ (Địa chỉ nhà riêng / Nơi làn việc): ");
            inputRecivingAddress = sc.nextLine();

        } while (!Pattern.matches(RECIVING_ADDRESS_REGEX, inputRecivingAddress));

        AgribankOnline agribankOnline = new AgribankOnline(inputName, inputPhoneNumber, inputDateOfBirth, inputAddress, inputPlaceOfBirth, inputRecivingAddress);
        return agribankOnline;
    }
}
