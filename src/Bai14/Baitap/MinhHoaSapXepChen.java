package Bai14.Baitap;

import java.util.Scanner;

public class MinhHoaSapXepChen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
      insertSort(list);

    }
    public static void insertSort(int [] list){
        for (int i = 1; i < list.length; i++){
            int currenElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currenElement; k--){
                list[k+1] = list[k];
            }
            list[k + 1] = currenElement;
        }

    }

}
