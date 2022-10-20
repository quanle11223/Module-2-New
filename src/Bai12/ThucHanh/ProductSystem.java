package Bai12.ThucHanh;

import java.util.Scanner;

public class ProductSystem {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int luaChonProduct = 0;
        do {
            System.out.println("      -------Menu-------");
            System.out.println("1. Them san pham: \n"
                              +"2. Xoa san pham(Nhap ID) \n"
                              +"3. Hien thi toan bo san pham \n"
                              +"4. Tim kiem san pham(Nhap ten Sp) \n"
                              +"5. Sap xep san pham theo gia tang dan \n"
                              +"0. Thoat Menu"
                              + ""
                    );
            luaChonProduct = scanner.nextInt();
            scanner.nextLine();
            if (luaChonProduct == 1){
                System.out.println("Nhap ten san pham: ");
                String inputName = scanner.nextLine();
                System.out.println("Nhap Id san pham: ");
                String inputId = scanner.nextLine();
                System.out.println("Nhap gia san pham: ");
                int inputPrice = scanner.nextInt();
                Product pro = new Product(inputName, inputId, inputPrice);
                productManager.addProduct(pro);
            }
            else if (luaChonProduct == 2) {
                System.out.println("Nhap Id san pham: ");
                String maSanPham = scanner.nextLine();
                Product pro = new Product(maSanPham);
                productManager.deleteProduct(pro);
            }
            else if (luaChonProduct == 3){
                System.out.println("Danh sach toan bo san pham: ");
                productManager.hienThiProduct();
            } else if (luaChonProduct == 4) {
                System.out.println("Nhap ten SP: ");
                String tenSanPham = scanner.nextLine();
                System.out.println("Trang thai san pham: ");
                productManager.hienThiProduct(tenSanPham);
            } else if (luaChonProduct == 5) {
                productManager.sapXepProduct();
                productManager.hienThiProduct();
            }
        }while (luaChonProduct != 0);
        if (luaChonProduct == 0){
           System.exit(0);
        }

    }
}