package CollegeApp;

public class Student {
    private String studentName;
    private String studentId;
    private Department department;
    private Status yearsLeft;

    public Student(String studentName, String studentId, Department department, Status yearsLeft) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.department = department;
        this.yearsLeft = yearsLeft;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
