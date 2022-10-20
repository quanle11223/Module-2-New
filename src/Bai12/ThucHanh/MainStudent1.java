package Bai12.ThucHanh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainStudent1 {
    public static void main(String[] args) {
        Student1 student1 = new Student1("Nam", 20, "HN");
        Student1 student2 = new Student1("Hung", 21, "HN");
        Student1 student3 = new Student1("Ha", 22, "HN");

        Map<Integer, Student1> studentmap = new HashMap<Integer, Student1>();
        studentmap.put(1, student1);
        studentmap.put(2, student2);
        studentmap.put(3, student3);
        studentmap.put(4, student1);

        Set<Student1> students = null;
        for (Map.Entry<Integer, Student1> student : studentmap.entrySet()) {
            System.out.println(student.toString());
            System.out.println("...........Set");
            students = new HashSet<Student1>();
            students.add(student1);
            students.add(student2);
            students.add(student3);
            students.add(student1);
        }
        for (Student1 student : students) {
            System.out.println(student.toString());
        }

    }
}
