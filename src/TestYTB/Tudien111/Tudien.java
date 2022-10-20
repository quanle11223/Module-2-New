package TestYTB.Tudien111;

import java.util.Scanner;

public class Tudien {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        int luaChon = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("Tra từ điện Anh-Việt: \n"
                    + "1. Thiêm từ(từ khóa, ý nghĩa) \n"
                    + "2. Tìm ý nghĩa từ khóa \n"
                    + "3. In danh sách từ khóa \n"
                    + "4. Xóa từ \n"
                    + "5. In số lượng từ \n"
                    + "6. Xóa tất cả từ khóa \n "
                    + "0. Thoát \n"
                    + "");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            if (luaChon == 1) {
                System.out.println("Nhập vào từ khóa: ");
                String tuKhoa = scanner.nextLine();
                System.out.println("Nhập vào ý nghĩa: ");
                String yNghia = scanner.nextLine();
                dictionary.pushData(tuKhoa, yNghia);
            } else if (luaChon == 2 || luaChon == 4) {
                System.out.println("Nhập vào từ khóa:");
                String tuKhoa = scanner.nextLine();
                if (luaChon == 4) {
                    dictionary.removeData(tuKhoa);
                } else {
                    dictionary.findData(tuKhoa);
                }
            } else if (luaChon == 3) {
                dictionary.printData1();
            } else if (luaChon == 5) {
                System.out.println("Số lượng từ khóa " + dictionary.soluongTuKhoa());
            } else if (luaChon == 6) {
                dictionary.deleteTuKhoa();
            }
        } while (luaChon != 0);
    }

}
