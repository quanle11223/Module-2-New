package CaseStudyAgribank;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ManagerOffline implements Serializable {
    public ArrayList<AgribankOffline> agribankOfflineArrayList;
    Scanner scanner = new Scanner(System.in);
    int choiceO;
    public static final String NAME_REGEX = "^[a-z\\sA-Z]{3,20}$";
    public static final String PHONE_REGEX = "^[0-9]{10}$";
    public static final String DATE_OF_BIRTH_REGEX = "^[0-9]{2}+\\.[0-9]{2}+\\.[0-9]{4}$";
    public static final String ADDRESS_REGEX = "^[a-z\\sA-Z\\s0-9]{1,100}$";
    public static final String PLACE_OF_BIRTH_REGEX = "^[a-z\\sA-Z\\s0-9]{1,100}$";
    public static final String RECEPIENT_DOCUMENT_REGEX = "^[a-z\\sA-Z\\s0-9]{1,100}$";
    CheckChoice checkChoice = new CheckChoice();

    public ManagerOffline() {
        this.agribankOfflineArrayList = new ArrayList<>();
    }

    public ManagerOffline(ArrayList<AgribankOffline> agribankOfflineArrayList) {
        this.agribankOfflineArrayList = agribankOfflineArrayList;
    }

    public void addInformationOffline(AgribankOffline agrf) {
        agribankOfflineArrayList.add(agrf);
    }

    public void displayInformation1() {
        for (AgribankOffline offline : agribankOfflineArrayList) {
            System.out.println("Thông tin Quý khách vừa nhập là: " + offline);
        }
    }

    public void deleteAllInformation() {
        agribankOfflineArrayList.removeAll(agribankOfflineArrayList);
    }

    public void updateInformation() {
        System.out.println("Bạn có chắc chắn xóa toàn bộ thông tin vừa nhập: ");
        System.out.println("Chọn '1'. Xác nhận xóa để nhập lại thông tin.");
        System.out.println("Chọn '2'. Hủy bỏ.");
        choiceO = scanner.nextInt();
        if (choiceO == 1) {
            deleteAllInformation();
            System.out.println("Thông tin bạn vừa nhập đã xóa, vui lòng nhập lại thông tin mới: ");
            AgribankOffline agribankOffline = inputInformation();
            addInformationOffline(agribankOffline);
        } else if (choiceO == 2) {
            System.out.println("");
        }
    }

    public AgribankOffline inputInformation() {
        String inputName;
        String inputPhoneNumber;
        String inputDateOfBirth;
        String inputAddress;
        String inputPlaceOfBirth;
        String inputRecivingAddress = null;


        do {
            System.out.println("Nhập Họ và Tên đăng ký: ");
            inputName = scanner.nextLine();
        } while (!Pattern.matches(NAME_REGEX, inputName));
        do {
            System.out.println("Nhập số điện thoại đăng ký: ");
            inputPhoneNumber = scanner.nextLine();
        } while (!Pattern.matches(PHONE_REGEX, inputPhoneNumber));
        do {
            System.out.println("Nhập ngày sinh của Khách hàng (định dạng: dd.mm.yyyy): ");
            inputDateOfBirth = scanner.nextLine();
        } while (!Pattern.matches(DATE_OF_BIRTH_REGEX, inputDateOfBirth));
        do {
            System.out.println("Nhập địa chỉ hiện tại: ");
            inputAddress = scanner.nextLine();
        } while (!Pattern.matches(ADDRESS_REGEX, inputAddress));
        do {
            System.out.println("Nhập Nguyên quán: ");
            inputPlaceOfBirth = scanner.nextLine();
        } while (!Pattern.matches(PLACE_OF_BIRTH_REGEX, inputPlaceOfBirth));
        System.out.println("Bạn vui lòng nhập Vùng muốn gửi hồ sơ: ");
        System.out.println("Chọn '1'. Miền Bắc \n"
                + "Chọn '2'. Miền Nam \n"
                + "");
        choiceO = checkChoice.checkChoice(1, 3);
        if (choiceO == 1) {
            System.out.println("Mời Quý Khách chọn Tỉnh/Thành Phố muốn nộp hồ sơ: ");
            System.out.println("Chọn '1'. Hà Nội \n"
                    + "Chọn '2'. Hải Phòng \n"
                    + "Chọn '3'. Quảng Ninh \n"
                    + "");
            choiceO = checkChoice.checkChoice(1, 3);
            if (choiceO == 1) {
                System.out.println("Mời Quý Khách chọn Địa điểm gần nhất: \n"
                        + "Chọn '1'. 111 - Lạc Long Quân \n"
                        + "Chọn '2'. 222 - Phố Huế \n"
                        + "Chọn '3'. 333 - Vạn Phúc \n"
                        + "");
                choiceO = checkChoice.checkChoice(1, 3);
                if (choiceO == 1) {
                    inputRecivingAddress = "111 - Lạc Long Quân";
                } else if (choiceO == 2) {
                    inputRecivingAddress = "222 - Phố Huế";
                } else if (choiceO == 3) {
                    inputRecivingAddress = "333 - Vạn Phúc";
                }
            } else if (choiceO == 2) {
                System.out.println("Mời Quý Khách chọn Địa điểm gần nhất: "
                        + "Chọn '1'. 444 - Đỗ Mười \n"
                        + "Chọn '2'. 555 - Cầu Đất \n"
                        + "Chọn '3'. 666 - Lê Chân \n"
                        + "");
                choiceO = checkChoice.checkChoice(1, 3);
                if (choiceO == 1) {
                    inputRecivingAddress = "444 - Đỗ Mười";
                } else if (choiceO == 2) {
                    inputRecivingAddress = "555 - Cầu Đất";
                } else if (choiceO == 3) {
                    inputRecivingAddress = "666 - Lê Chân";
                }
            } else if (choiceO == 3) {
                System.out.println("Mời Quý Khách chọn Địa điểm gần nhất: "
                        + "Chọn '1'. 777 - Bãi Cháy \n"
                        + "Chọn '2'. 888 - Cẩm Phả \n"
                        + "Chọn '3'. 999 - Uông Bí"
                        + "");
                choiceO = checkChoice.checkChoice(1, 3);
                if (choiceO == 1) {
                    inputRecivingAddress = "777 - Bãi Cháy";
                } else if (choiceO == 2) {
                    inputRecivingAddress = "888 - Cẩm Phả";
                } else if (choiceO == 3) {
                    inputRecivingAddress = "999 - Uông Bí";
                }
            }
        } else if (choiceO == 2) {
            System.out.println("Mời Quý Khách chọn Tỉnh/Thành Phố muốn nộp hồ sơ: ");
            System.out.println("Chọn '1'. Hồ Chí Minh \n"
                    + "Chọn '2'. Cần Thơ \n"
                    + "Chọn '3'. Bình Dương \n"
                    + "");

            choiceO = checkChoice.checkChoice(1, 3);
            if (choiceO == 1) {
                System.out.println("Mời Quý Khách chọn Địa điểm gần nhất: ");
                System.out.println("Chọn '1'. 111 - Cao Bá Quát \n "
                        + "Chọn '2'. 222 - Đặng Thị Nhu \n"
                        + "Chọn '3'. 333 - Đề Thám"
                        + "");
                choiceO = checkChoice.checkChoice(1, 3);
                if (choiceO == 1) {
                    inputRecivingAddress = "111 - Cao Bá Quát";
                } else if (choiceO == 2) {
                    inputRecivingAddress = "222 - Đặng Thị Nhu";
                } else if (choiceO == 3) {
                    inputRecivingAddress = "333 - Đề Thám";
                }
            } else if (choiceO == 2) {
                System.out.println("Mời Quý Khách chọn Địa điểm gần nhất: ");
                System.out.println("Chọn '1'. 444 - Lê Chân \n "
                        + "Chọn '2'. 555 - Ngô Sỹ Liên \n"
                        + "Chọn '3'. 666 - Lý Chính Thắng \n"
                        + "");
                choiceO = checkChoice.checkChoice(1, 3);
                if (choiceO == 1) {
                    inputRecivingAddress = "444 - Lê Chân";
                } else if (choiceO == 2) {
                    inputRecivingAddress = "555 - Ngô Sỹ Liên";
                } else if (choiceO == 3) {
                    inputRecivingAddress = "666 - Lý Chính Thắng";
                }
            } else if (choiceO == 3) {
                System.out.println("Mời Quý Khách chọn Địa điểm gần nhất: ");
                System.out.println("Chọn '1'. 777 - Nguyễn Văn Linh \n"
                        + "Chọn '2'. 888 - Võ Văn Kiệt \n"
                        + "Chọn '3'. 999 - Lê Lai \n"
                        + "");
                choiceO = checkChoice.checkChoice(1, 3);
                if (choiceO == 1) {
                    inputRecivingAddress = "777 - Nguyễn Văn Linh";
                } else if (choiceO == 2) {
                    inputRecivingAddress = "888 - Võ Văn Kiệt";
                } else if (choiceO == 3) {
                    inputRecivingAddress = "999 - Lê Lai";
                }
            }
        }
        AgribankOffline agribankOffline1 = new AgribankOffline(inputName, inputPhoneNumber, inputDateOfBirth, inputAddress, inputPlaceOfBirth, inputRecivingAddress);
        return agribankOffline1;
    }

    public void writeFile() {
        File file = new File("src/CaseStudyAgribank/ToKhaiThongTinKhachHang.txt");
        try
                (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(agribankOfflineArrayList);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
