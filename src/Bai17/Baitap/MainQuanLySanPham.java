package Bai17.Baitap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainQuanLySanPham {
    public static void main(String[] args) throws FileNotFoundException {
        SystemQuanLySanPham systemQuanLySanPham = new SystemQuanLySanPham();
        Scanner scanner = new Scanner(System.in);
        int luaChon = 0;
        do {
            System.out.println("-------Menu-------");
            System.out.println("1.Thêm sản phẩm \n "
                    + "2.Hiển thị sản phẩm \n "
                    + "3.Tìm kiếm sản phẩm \n "
                    + "4. Lưu danh sách sản phẩm vào File \n"
                    + "0. Thoát \n"
                    + ""
            );
            luaChon = scanner.nextInt();
            scanner.nextLine();
            if (luaChon == 1) {
                System.out.println("Nhập id sản phẩm: ");
                int idSanPham = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhập tên sản phẩm: ");
                String tenSanPham = scanner.nextLine();
                System.out.println("Nhập hãng sản xuất sản phẩm");
                String tenHangSanXuat = scanner.nextLine();
                System.out.println("Nhập giá sản phẩm: ");
                int giaSanPham = scanner.nextInt();
                System.out.println("Nhập mô tả cho sản phẩm: ");
                String moTaSanPham = scanner.nextLine();
                scanner.nextLine();
                Quanlysanpham quanlysanpham = new Quanlysanpham(idSanPham, tenSanPham, tenHangSanXuat, giaSanPham, moTaSanPham);
                systemQuanLySanPham.addProduct(quanlysanpham);


            } else if (luaChon == 2) {
                systemQuanLySanPham.displayProduct();
            } else if (luaChon == 3) {
                System.out.println("Nhập tên sản phẩm: ");
                String tenSanPham1 = scanner.nextLine();
                System.out.println("Kết quả tìm kiếm: ");
                systemQuanLySanPham.displayProduct();
            } else if (luaChon == 4) {
                System.out.println("Nhập đường dẫn đến File để lưu: ");
                String tenFile = scanner.nextLine();
                File f = new File(tenFile);
                systemQuanLySanPham.luuFileProduct(f);
            } else if (luaChon == 0) {
                System.exit(0);
            }
        } while (luaChon != 0);

    }
    public static void writeProduct (String path, SystemQuanLySanPham quanlysanphamArrayList){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(quanlysanphamArrayList);
            fileOutputStream.close();
            objectOutputStream.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}