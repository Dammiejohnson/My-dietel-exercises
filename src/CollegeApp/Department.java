package CollegeApp;

import java.util.List;

public class Department {
    private String departmentName;
    private List<Teacher> teachers;
    private List<Student> students;

    public Department(String departmentName, List<Teacher> teachers, List<Student> students) {
        this.departmentName = departmentName;
        this.teachers = teachers;
        this.students = students;
    }


}
