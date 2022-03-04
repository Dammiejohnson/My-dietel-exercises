package CollegeApp;


import java.util.List;

public class College {
    private  String collegeName;
    private List<Department> departments;
    private String collegeAddress;
    private CollegeType collegeType;

    public College(String collegeName, List<Department> departments, String collegeAddress, CollegeType collegeType) {
        this.collegeName = collegeName;
        this.departments = departments;
        this.collegeAddress = collegeAddress;
        this.collegeType = collegeType;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public String getCollegeAddress() {
        return collegeAddress;
    }

    public void setCollegeAddress(String collegeAddress) {
        this.collegeAddress = collegeAddress;
    }

    public CollegeType getCollegeType() {
        return collegeType;
    }

    public void setCollegeType(CollegeType collegeType) {
        this.collegeType = collegeType;
    }
}
