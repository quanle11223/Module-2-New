package Bai17.Baitap;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class SystemQuanLySanPham  {
   public ArrayList<Quanlysanpham> productArray;


   public  SystemQuanLySanPham(){
       this.productArray = new ArrayList<>();
   }
   public SystemQuanLySanPham(ArrayList<Quanlysanpham>productArray){
       this.productArray = productArray;
   }
   public void addProduct(Quanlysanpham qlsp){
       productArray.add(qlsp);
   }
   public void displayProduct(){
       for (Quanlysanpham quanlysanpham : productArray) {
           System.out.println("Danh sách sản phẩm hiện có: " + quanlysanpham);
       }
   }
   public void timKiemProduct(String tenSanPham1) {
       for (Quanlysanpham quanlysanpham : productArray) {
           if (quanlysanpham.getName().indexOf(tenSanPham1) >= 0) {
               System.out.println("Sản phẩm tìm được là: " + quanlysanpham);
           }
       }
   }

    public void luuFileProduct(File f) {
        try {
            File file = new File("E:\\JAVA Module 2\\Thuc Hanh\\Thuc-hanh-bai-tap-OOP\\src\\Bai17\\DanhSachSanPham.txt");
            OutputStream outputStream = new FileOutputStream("DanhSachSanPham.txt");
            if (!file.exists()){
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            for (Quanlysanpham quanlysanpham : productArray) {
                objectOutputStream.writeObject(quanlysanpham);

                objectOutputStream.flush();
                objectOutputStream.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
