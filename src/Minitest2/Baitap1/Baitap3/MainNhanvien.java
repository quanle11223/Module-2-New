package Minitest2.Baitap1.Baitap3;

public class MainNhanvien {
    public static void main(String[] args) {

        NhanvienFulltime [] nhanvienFulltimes = new NhanvienFulltime[5];
        nhanvienFulltimes[0] = new NhanvienFulltime(10, "AAA", 20, 123456, "laaaa@gmail.com", 100000, 20000, 500000);
        nhanvienFulltimes[1] = new NhanvienFulltime(11, "BBB", 21, 123457, "baaaa@gamil.com", 200000, 50000, 600000);
        nhanvienFulltimes[2] = new NhanvienFulltime(12, "CCC", 22, 234351, "caaaa@gmail.com", 300000, 70000, 700000);

        NhanvienParttime[] nhanvienParttimes = new NhanvienParttime[5];
        nhanvienParttimes [0] = new NhanvienParttime(20, "aaa", 22, 123123, "daaaaa@gmail.com", 10);
        nhanvienParttimes [1] = new NhanvienParttime(21, "bbb", 23, 123123, "eaaaaa@gmail.com", 13);
        nhanvienParttimes [2] = new NhanvienParttime(22, "ccc", 28, 3423434, "faaaaa@gmail.com", 15);

        System.out.println(averageSalary(nhanvienFulltimes, nhanvienParttimes));
        System.out.println(saralyFullTimeLowAverage(nhanvienFulltimes, nhanvienParttimes));
    }
    public static double averageSalary(NhanvienFulltime[] nhanvienFulltimes, NhanvienParttime[] nhanvienParttimes){
       int sum1 = 0;
       int sum2 = 0;
       for (int i = 0; i < nhanvienFulltimes.length; i++){
           sum1 += nhanvienFulltimes[i].actualQuantity();
       }
       for (int j = 0; j < nhanvienParttimes.length; j++){
           sum2 += nhanvienParttimes[j].actualQuantityPart();
       }
       return (sum1+sum2) / ((nhanvienFulltimes.length) + (nhanvienParttimes.length));
    }
    public static double saralyFullTimeLowAverage(NhanvienFulltime[] nhanvienFulltimes, NhanvienParttime[] nhanvienParttimes) {
        double avg = averageSalary(nhanvienFulltimes, nhanvienParttimes);
        int count = 0;
        for (int i = 0; i < nhanvienFulltimes.length; i++) {
            if (avg > nhanvienFulltimes[i].actualQuantity()) {
                 count++;
            }
        }
        return count;
    }



    public  double salaryPayable(NhanvienParttime[] nhanvienParttimes){
        double sum = 0;
        for (int i = 0; i < nhanvienParttimes.length; i++ ){
            sum+=nhanvienParttimes[i].actualQuantityPart();
        }
        return sum;
    }
    public  double nhanVienIncreases(NhanvienFulltime[] nhanvienFulltimes){
        double countup = 0;
        for (int i = 0; i < nhanvienFulltimes.length; i++){
            countup+=nhanvienFulltimes[i].id;
        }
        return countup;
    }
}
