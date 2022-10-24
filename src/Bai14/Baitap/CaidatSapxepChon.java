package Bai14.Baitap;

public class CaidatSapxepChon {
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
