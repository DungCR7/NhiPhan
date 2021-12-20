package StudentManagement;

import java.util.Scanner;

public class StudentManagement {
    //khai báo
    private int n;
    private Student[] students;

    public  StudentManagement(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so sinh vien: ");
        int n = input.nextInt();
        input.nextLine(); // tên sinh viên
        students = new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhập thông tin sinh viên thứ "+(i+1));
            System.out.print("Name: ");
            //i < n
            String name = input.nextLine();
            System.out.print("Điểm GPA = ");
            float gpa = input.nextFloat();
            input.nextLine();
            // truyền name,gpa
            students[i] = new Student();
            students[i].setName(name);
            students[i].setGpa(gpa);
        }
    }
    //kiemTra
    public int kiemTraDo(){
        int count = 0;
        for(Student st : students){
            boolean check = st.checkGPA();
            if(check){
                count++;
            }
        }
        return count;
    }
    public int kiemTraTruot(){
        int count =0;
        for(Student st : students){
            boolean check = st.checkGPA();
            if(!check){
                count++;
            }
        }
        return count;
    }
    public Student diemGPAcaoNhat(){
        Student maxGPA = students[0];
        for(Student st : students){
            if(maxGPA.getGpa() < st.getGpa()){
                maxGPA = st;
            }
        }
        return maxGPA;
    }
    public Student diemGPAthapNhat(){
        Student minGPA = students[0];
        for(Student st : students){
            if(minGPA.getGpa() > st.getGpa()){
                minGPA = st;
            }
        }
        return minGPA;
    }
}
