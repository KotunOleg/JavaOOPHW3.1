import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Anna", "Malas", Gender.FEMALE, 1, "Math");
        Student student2 = new Student("Pasha", "Tyasko", Gender.MALE, 3, "Finans");
        Student student3 = new Student("Nikita", "Molodets", Gender.MALE, 5, "Math");
        Student student4 = new Student("Olya", "Fier", Gender.FEMALE, 12, "Math");
        Student student5 = new Student("Marina", "Firsova", Gender.FEMALE, 6, "Math");
        Student student6 = new Student("Misha", "Fazan", Gender.MALE, 56, "Math");
        Student student7 = new Student("Roma", "Kot", Gender.MALE, 99, "Math");

        Group group = new Group();
        Student[] students = new Student[] { student1, student2, student3, student4, student5, student6, student7 };
        try {
            group.addStudent(student7);

            group.addStudent(student6);
            group.addStudent(student5);
            group.addStudent(student4);
            group.addStudent(student3);
            group.addStudent(student2);
            group.addStudent(student1);
        } catch (GroupOverflowException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(group);

        try {
            Student student8 = group.searchStudentByLastName("Kot");
            System.out.println(student8);
        } catch (StudentNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(group.removedStudentById(48));
        System.out.println(group);


        }

    }


