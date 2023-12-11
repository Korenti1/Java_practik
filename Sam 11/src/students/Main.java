package students;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Oleg", "IS-31", 3, Arrays.asList(5,5,5,5,5,5,5,4,2)));
        students.add(new Student("Kolya", "IS-24", 2, Arrays.asList(5,5,5,5)));
        students.add(new Student("Danila", "IS-31", 3, Arrays.asList(4,4,5,5,4,2)));
        students.add(new Student("Rita", "IS-32", 3, Arrays.asList(5,4,2)));
        students.add(new Student("Nastya", "IS-31", 3, Arrays.asList(5,5,5,5,5,5,5)));
        students.add(new Student("Dinara", "IS-31", 3, Arrays.asList(5,5,5,5,5,5,4,4,4)));
        System.out.println("Все студенты:");
        for (Student student:
                students) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println("Новый список без тех, у кого средние оценки <=3");
        List<Student> newStudents = deleteWithTrashAvg(students);
        for (Student student:
                newStudents) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println("Переведенные на новый курс: ");
        List<Student> nextCourse = upcastToNextCourse(students);
        for (Student student:
                nextCourse) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println("Печатаем студентов 4 курса:");
        printStudents(nextCourse, 4);
    }
    public static Long getAvgMark(Student student){
        return student.getMarks().stream().mapToInt(Integer::intValue).sum() / student.getMarks().stream().count();
    }
    public static List<Student> deleteWithTrashAvg(List<Student> students){
        students.removeIf(student -> getAvgMark(student) <= 3);
        return students;
    }

    public static List<Student> upcastToNextCourse(List<Student> students){
        for (Student student:
                students) {
            if(getAvgMark(student) > 3) student.setCourse(student.getCourse() + 1);
        }
        return students;
    }
    public static void printStudents(List<Student> students, int course){
        for (Student student:
                students) {
            if(student.getCourse() == course) System.out.println(student);
        }
    }
}
