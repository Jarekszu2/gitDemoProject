package gdaGit;

import java.util.HashMap;
import java.util.Map;

public class MainStudent {
    public static void main(String[] args) {
        System.out.println();

        Student stud1 = new Student(1L, "im1", "naz1");
        Student stud2 = new Student(2L, "im2", "naz2");
        Student stud3 = new Student(3L, "im3", "naz3");
        Map<Long, Student> mapaStudentow = new HashMap<Long, Student>();
        mapaStudentow.put(stud1.getNrindeksu(), stud1);
        mapaStudentow.put(stud2.getNrindeksu(), stud2);
        mapaStudentow.put(stud3.getNrindeksu(), stud3);

        boolean czyZawiera100200 = mapaStudentow.containsKey(100200L);
        System.out.println(czyZawiera100200);

        System.out.println();
        System.out.println(mapaStudentow.get(2L));

        System.out.println();
        System.out.println("iloœæ studentów: " + mapaStudentow.size());
    }
}
