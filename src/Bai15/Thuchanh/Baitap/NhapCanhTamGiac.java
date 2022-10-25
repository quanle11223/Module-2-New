package Bai15.Thuchanh.Baitap;

import java.util.Scanner;

public class NhapCanhTamGiac {
    public static void main(String[] args) throws Ex {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập cạnh a: ");
            int a = scanner.nextInt();
            System.out.println("Nhập cạnh b: ");
            int b = scanner.nextInt();
            System.out.println("Nhập cạnh c: ");
            int c = scanner.nextInt();
            checkTamGiac(a, b, c);
        } catch (Ex ex) {
            Ex ex1 = new Ex("hihi");
            System.out.println("sai cmnr" + ex1.getMessage());
        }

    }

    public static void checkTamGiac(int a, int b, int c) throws Ex {
        if (a > 0 || b > 0 || c > 0) {
            if ((a + b < c) || (b + c < a) || (c + a) < b) {
                throw new Ex();
            }
        }
    }
}
