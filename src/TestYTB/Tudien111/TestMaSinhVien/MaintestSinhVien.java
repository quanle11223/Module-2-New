package TestYTB.Tudien111.TestMaSinhVien;

import java.util.Scanner;

public class MaintestSinhVien {
    public static void main(String[] args) {
        DanhsachSinhvien danhsachSinhvien = new DanhsachSinhvien();
        Scanner scanner = new Scanner(System.in);
        int luaChonSinhVien = 0;
        do {
            System.out.println("       -------Menu------- ");
            System.out.println("Lựa chọn theo danh sách dưới đây:");
            System.out.println(
                    "1. Thêm danh sách sinh viên: \n"
                            + "2. In danh sách sinh viên: \n"
                            + "3. Kiểm tra danh sách sinh viên có hay không?: \n"
                            + "4. Lấy ra số lượng sinh viên trong danh sách: \n"
                            + "5. Làm trống danh sách sinh viên: \n"
                            + "6. Kiểm tra sinh viên có trong danh sách không(Nhập mã): \n"
                            + "7. Xóa sinh viên ra khỏi danh sách(Nhập mã): \n"
                            + "8. Tìm kiếm sinh viên theo tên: \n"
                            + "9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp: \n"
                            + "0. Thoát chương trình"
                            + ""
            );
            luaChonSinhVien = scanner.nextInt(); scanner.nextLine();
            if (luaChonSinhVien == 1) {
                System.out.println("Nhập mã sinh viên: ");
                String maSinhVien = scanner.nextLine();
                System.out.println("Nhập tên sinh viên: ");
                String hoVaTen = scanner.nextLine();
                System.out.println("Nhập năm sinh sinh viên: ");
                int namSinh = scanner.nextInt();
                System.out.println("Nhập điểm trung bình: ");
                float diemTrungBinh1 = scanner.nextFloat();
                SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh1);
                danhsachSinhvien.addSinhVien(sv);

            }
          else if (luaChonSinhVien == 2){
             danhsachSinhvien.printDanhSachSv();
            }
          else if (luaChonSinhVien == 3){
                System.out.println("Kiểm tra danh sách rỗng là " + danhsachSinhvien.checkDanhsachSv());
            }
          else if (luaChonSinhVien == 4){
                System.out.println("Số lượng sinh viên là: " + danhsachSinhvien.laySoLuongSv());
            }
          else if (luaChonSinhVien == 5){
                danhsachSinhvien.lamTrongDanhSachSv();
            }
          else if (luaChonSinhVien == 6){
                System.out.println("Nhập mã sinh viên: "); String maSinhVien = scanner.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Trạng thái tồn tại của sinh viên đã lưu trữ: " + danhsachSinhvien.kiemTraTonTaiSv(sv));
            }
          else if (luaChonSinhVien == 7){
                System.out.println("Nhập mã sinh viên: "); String maSinhVien = scanner.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                danhsachSinhvien.xoaMotSinhVien(sv);
            }
          else if (luaChonSinhVien == 8){
                System.out.println("Nhập tên: " ); String tenSinhvien = scanner.nextLine();
                System.out.println("Kết quả tìm kiếm: ");
                danhsachSinhvien.timSvTheoTen(tenSinhvien);
            }
          else if (luaChonSinhVien == 9){
                danhsachSinhvien.sapXepSinhVien();
               danhsachSinhvien.printDanhSachSv();
            }

        }while (luaChonSinhVien != 0);
        if (luaChonSinhVien == 0){
            System.exit(0);}
        }
    }