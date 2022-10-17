import java.util.Scanner;

public class Thuchanhhinhchunhat1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hình chữ nhật");
        System.out.println("Nhập width: ");
        double width = scanner.nextDouble();
        System.out.println("Nhập Height: ");
        double height = scanner.nextDouble();
        Hinhchunhat hinhchunhat = new Hinhchunhat(width, height);
        System.out.println("Diện tích hình chữ nhật là: " + hinhchunhat.getArea());
        System.out.println("Chu vi hình chữ nhật là: " + hinhchunhat.getChuvi());
    }

    static class Hinhchunhat {
        double width;
        double height;

        public Hinhchunhat(double width, double height) {
            this.height = height;
            this.width = width;
        }

        public double getArea() {
            return this.height * this.width;
        }

        public double getChuvi() {
            return (this.height + this.width) * 2;
        }
    }
}






