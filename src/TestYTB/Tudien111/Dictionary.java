package TestYTB.Tudien111;

import java.util.*;

public class Dictionary {
    public Map<String, String> data = new TreeMap<>();

    public String pushData(String tuKhoa, String yNghia) {
        return this.data.put(tuKhoa, yNghia);
    }
    public String removeData(String tuKhoa) {
        return this.data.remove(tuKhoa);
    }
    public String findData(String tuKhoa) {
        String ketqua = this.data.get(tuKhoa);
        return ketqua;
    }
    public void printData1() {
        System.out.println("Danh sach tu khoa la:");
        Set<String> key = data.keySet();
        for (String k1 : key) {
            System.out.println(data.get(k1));
        }
    }

    public int soluongTuKhoa() {
        return this.data.size();
    }

    public void deleteTuKhoa() {
        this.data.clear();
    }

}
