package MiniTest1;

import java.util.Scanner;

public class ProductManager {
    static int count=0;
   static Product1[] product1s = new Product1[5];

    public static int addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sản phẩm cần thêm mới: ");
        String name = scanner.nextLine();
        System.out.println("Tên sản phẩm: ");
        double price = scanner.nextDouble();
        System.out.println("Giá: ");
        String description = scanner.nextLine();
        product1s[count]= new Product1(name, price, description);
        count++;
       return count;
    }
     public static Product1[]updateProduct(){
         String update;
         Scanner updateproduct = new Scanner(System.in);
         System.out.println("Nhập sản phẩm cần chỉnh sửa theo thứ tự: " + product1s);


         return new Product1[0];
     }

}