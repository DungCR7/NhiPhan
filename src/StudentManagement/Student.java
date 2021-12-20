package StudentManagement;

public class Student {
    // khai báo
    private String name;
    private float gpa;

    //khởi tạo constructor
    public Student() {
    }

    public Student(String name, float gpa) {
        this.gpa = gpa;
        this.name = name;
    }

    //getter ,setter
    public float getGpa() {

        return gpa;
    }
    public void setGpa(float gpa) {

        this.gpa = gpa;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    //kiểm tra điểm đỗ trượt ,>=1.5 thì đỗ , ngược lại trượt
    public boolean checkGPA() {
        if (gpa >= 1.5) {
            return true;
        } else
            return false;
    }

    //in ra name,gpa
    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", gpa=" + gpa + '}';
    }
}