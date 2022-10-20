package Bai12.ThucHanh;

import java.util.Comparator;

public class AgeComparatorStudent3 implements Comparator <Student3> {
    public int compare(Student3 o, Student3 o1) {
        if(o.getAges() > o1.getAges()){
            return 1;
        }else if(o.getAges() == o1.getAges()){
            return 0;
        }else{
            return -1;
        }
    }
}
