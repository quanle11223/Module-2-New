package Bai9;

import java.util.Scanner;

public class MainFizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số: ");
        int number = scanner.nextInt();
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = (String) fizzBuzz.checkFizzBuzz(number);
        System.out.println(result);
    }
}
