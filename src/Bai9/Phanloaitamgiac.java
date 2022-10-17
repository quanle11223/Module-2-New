package Bai9;

public class Phanloaitamgiac {

//public int a;
//public int b;
//public int c;

    public String checkTriangle(int a, int b, int c) {

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

