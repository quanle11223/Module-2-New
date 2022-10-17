package Bai9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập cạnh b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập cạnh c: ");
        int c = scanner.nextInt();
        Phanloaitamgiac phanloaitamgiac = new Phanloaitamgiac();
        String result = phanloaitamgiac.checkTriangle(a, b, c);
        System.out.println(result);
    }
}
