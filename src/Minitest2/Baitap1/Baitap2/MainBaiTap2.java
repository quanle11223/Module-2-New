package Minitest2.Baitap1.Baitap2;

import java.time.LocalDate;
import java.util.Scanner;

public class MainBaiTap2 {
    public static void main(String[] args) {
        CrispyFlour [] crispyFlour = new CrispyFlour[5];
        crispyFlour[0] = new CrispyFlour("11" , "Bột trắng" , LocalDate.of(2020, 10, 10), 5000, 10 );
        crispyFlour[1] = new CrispyFlour("12" , "Bột đen" , LocalDate.of(2021,11,20), 6000, 11 );
        crispyFlour[2] = new CrispyFlour("13" , "Bột đỏ" , LocalDate.of(2022,2,11), 7000, 12 );
        crispyFlour[3] = new CrispyFlour("14" , "Bột vàng" , LocalDate.of(2011,9,24), 8000, 13 );
        crispyFlour[4] = new CrispyFlour("15" , "Bột xanh" , LocalDate.of(2013,17,2), 9000, 14 );

        Meat [] meats = new Meat[5];
        meats [0] = new Meat("21", "Thịt chó", LocalDate.of(2019,11,19), 200, 5);
        meats [1] = new Meat("22", "Thịt mèo", LocalDate.of(2021,5, 19), 300, 6);
        meats [2] = new Meat("23", "Thịt chuột",LocalDate.of(2013,2,24) , 400, 7);
        meats [3] = new Meat("24", "Thịt lơn", LocalDate.of(2018, 2, 30), 500, 8);
        meats [4] = new Meat("25", "Thịt bò", LocalDate.of(2013, 9, 20), 600, 9);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh mục lựa chọn");
        System.out.println("1. Hiện thị sản phẩm: ");
        System.out.println("2. Thêm sản phẩm: ");
        System.out.println("3. Sửa sản phẩm: ");
        System.out.println("4. Xóa sản phẩm: ");
        System.out.println("0. Exit ");

    }

    public void DisplayProduct(){
    }
    public void addProduct(){

    }
}
