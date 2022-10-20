package Bai12.ThucHanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    public ArrayList<Product> sanPham;

    public ProductManager() {
        this.sanPham = new ArrayList<Product>();
    }

    public void Product(ArrayList<Product> sanPham) {
        this.sanPham = sanPham;
    }

    public void addProduct(Product pro) {
        this.sanPham.add(pro);
    }

    public boolean deleteProduct(Product pro) {
        return this.sanPham.remove(pro);
    }

    public void hienThiProduct(String tenSanPham) {
        for (Product p1 : sanPham) {
            System.out.println("Danh sach san pham hien co la: " + p1);
        }
    }
    public void timProduct(String ten) {
        for (Product p1 : sanPham){
            if (p1.getNameProduct().indexOf(ten) >= 0) {
                System.out.println(p1);
            }
        }
    }
    public void sapXepProduct(){
        Collections.sort(this.sanPham, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()){
                    return -1;
                } else if (o1.getPrice() > o2.getPrice()){
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }


    public void hienThiProduct() {
    }
}