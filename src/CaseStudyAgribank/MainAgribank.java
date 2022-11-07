package CaseStudyAgribank;

import java.io.Serializable;
import java.util.Scanner;

public class MainAgribank implements Serializable {

    public static void main(String[] args) {
        CheckChoice checkChoice = new CheckChoice();
        ManagerOnline managerOnline = new ManagerOnline();
        ManagerOffline managerOffline = new ManagerOffline();
        Scanner scanner = new Scanner(System.in);
        int choiceMain = 0;
        int choiceSub = 0;

        System.out.println("******* AGRIBANK Kính chào Quý Khách *******");
        System.out.println();
        System.out.println("...Đăng ký mở Tài Khoản và Thẻ Thanh toán Nội địa...");
        System.out.println();
        System.out.println("Quý khách vui lòng chọn hình thức đăng ký: ");
        System.out.println();
        System.out.println("Chọn '1'. Đăng ký Online: ");
        System.out.println("Chọn '2'. Đăng ký Offline: ");
        try {
            choiceMain = checkChoice.checkChoice(1, 2);
            if (choiceMain == 1) {
                do {
                    System.out.println("--- Đăng ký Online. Mời Quý khách chọn các mục dưới đây --- ");
                    System.out.println("Chọn '1'. Nhập thông tin đăng ký: \n"
                            + "Chọn '2'. Xem lại thông tin vừa nhập: \n"
                            + "Chọn '3'. Chỉnh sửa thông tin vừa nhập: \n"
                            + "Chọn '4'. Xóa toàn bộ thông tin vừa nhập: \n"
                            + "Chọn '5'. Gửi thông tin vừa nhập đến Ngân hàng: \n"
                            + "Chọn '0'. Thoát. \n"
                            + "");

                    choiceMain = checkChoice.checkChoice(1, 5);
                    if (choiceMain == 1) {
                        AgribankOnline agribankOnline = managerOnline.inputInformation();
                        managerOnline.addInformationA(agribankOnline);
                    } else if (choiceMain == 2) {
                        managerOnline.displayAllInformation();
                    } else if (choiceMain == 3) {
                        managerOnline.updateInformation();
                    } else if (choiceMain == 4) {
                        managerOnline.displayAllInformation();
                    } else if (choiceMain == 5) {
                        managerOnline.sendInformation();
                    } else if (choiceMain == 0) {
                        System.out.println("Kính chào và Hẹn gặp lại Quý Khách");
                        System.exit(0);
                    }
                } while (true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (choiceMain == 2) {
                do {
                    System.out.println("--- Đăng ký Ofline. Mời Quý khách chọn các mục dưới đây ---");
                    System.out.println("Chọn '1': Nhập thông tin tờ khai: \n"
                            + "Chọn '2': Xem lại thông tin vừa nhập: \n"
                            + "Chon '3': Chỉnh sửa thông tin vừa nhập \n"
                            + "Chọn '4': DownLoad Tờ khai thông tin \n"
                            + "Chọn '0': Thoát. \n"
                            + "");

                    choiceMain = checkChoice.checkChoice(1, 5);
                    if (choiceMain == 1) {
                        AgribankOffline agribankOffline = managerOffline.inputInformation();
                        managerOffline.addInformationOffline(agribankOffline);
                    } else if (choiceMain == 2) {
                        managerOffline.displayInformation1();
                    } else if (choiceMain == 3) {
                        managerOffline.updateInformation();
                    } else if (choiceMain == 4) {
                        managerOffline.writeFile();
                        System.out.println("Đã Download thành công.");
                    } else if (choiceMain == 0) {
                        System.out.println("Kính chào và Hẹn gặp lại Quý Khách");
                        System.exit(0);
                    }
                } while (true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
