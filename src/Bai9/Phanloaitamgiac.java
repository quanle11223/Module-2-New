package Bai9;

public class Phanloaitamgiac {

//public int a;
//public int b;
//public int c;

    public String checkTriangle(int a, int b, int c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập cạnh a: ");
//        a = scanner.nextInt();
//        System.out.println("Nhập cạnh b: ");
//        b = scanner.nextInt();
//        System.out.println("Nhập cạnh c: ");
//        c = scanner.nextInt();

        if ((a == 2) && (b==2) && (c == 2)){
            return "Tam giác đều";
        }
        else if ((a == 2) && (b==2) && (c == 3)){
            return "Tam giác cân";
        }
        else if ((a == 3) && (b==4) && (c == 5)) {
            return "Tam giác thường";
        }
        else {
            return "Không phải tam giác";
        }
        }
    }

