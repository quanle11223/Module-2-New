package Bai16.Thuchanh;

import java.io.*;
import java.util.Scanner;

public class ReadFileText {
    public void readFileText(String filePath){
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("khong ton tai");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap duong dan file");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

       ReadFileText readFileText = new ReadFileText();
       readFileText.readFileText(path);
    }
}
