package CollegeApp;

public class Teacher {
    private String nameOfTeacher;
    private int teacherId;
    private Department department;

    public Teacher(String nameOfTeacher, int teacherId, Department department) {
        this.nameOfTeacher = nameOfTeacher;
        this.teacherId = teacherId;
        this.department = department;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }


    public int getTeacherId() {
        return teacherId;
    }

    public Department getDepartment() {
        return department;
    }


}
