package Bai12.ThucHanh;

import org.jetbrains.annotations.NotNull;

public class Product implements Comparable<Product> {
    public String nameProduct;
    public String idProduct;
    public int price;

    public Product(String maSanPham){

    }
    public Product(String nameProduct, String idProduct, int price) {
        this.nameProduct = nameProduct;
        this.idProduct = idProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(@NotNull Product o) {
        return 0;
    }
}
