package Bai13;

public class DemoTuyenTinh {
    public static void main(String[] args) {
        int [] Array = {1,6,2,4,7,3,9,0,11};
    }
    public static int lineSearch(int[] Array){
        int value = 7;
        for (int j : Array) {
            if (j == value) {
                return 0;
            }
        }
        return -1;

    }


}
