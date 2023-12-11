package students;

import java.util.LinkedList;
import java.util.List;

public class Student {
    private String _name;
    private String _group;

    private Integer _course;

    private List<Integer> _marks;

    public Student(String name, String group, Integer course, List<Integer> marks) {
        _name = name;
        _group = group;
        _course = course;
        _marks = marks;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getGroup() {
        return _group;
    }

    public void setGroup(String group) {
        _group = group;
    }

    public Integer getCourse() {
        return _course;
    }

    public void setCourse(Integer course) {
        _course = course;
    }

    public List<Integer> getMarks() {
        return _marks;
    }

    public void setMarks(List<Integer> marks) {
        _marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Имя: '" + _name + '\'' +
                ", Группа: '" + _group + '\'' +
                ", Курс: " + _course +
                ", Оценки: " + _marks +
                '}';
    }
}
