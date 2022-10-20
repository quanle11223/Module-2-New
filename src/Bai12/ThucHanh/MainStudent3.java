package Bai12.ThucHanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainStudent3 {
    public static void main(String[] args) {
        Student3 student = new Student3("Kien", 30, "HT");
        Student3 student1 = new Student3("Nam", 26, "HN");
        Student3 student2 = new Student3("Anh", 38, "HT" );
        Student3 student3 = new Student3("Tung", 38, "HT" );

        List<Student3> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Student3 st : lists){
            System.out.println(st.toString());
        }

        AgeComparatorStudent3 ageComparator = new AgeComparatorStudent3();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student3 st : lists){
            System.out.println(st.toString());
        }
    }

}
