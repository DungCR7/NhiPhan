package StudentManagement;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        System.out.println("So sinh vien do: "+studentManagement.kiemTraDo());
        System.out.println("So sinh vien truot: "+studentManagement.kiemTraTruot());
        System.out.println("Sinh vien co diem GPA cao nhat: "+studentManagement.diemGPAcaoNhat());
        System.out.println("Sinh vien co diem GPA thap nhat: "+studentManagement.diemGPAthapNhat());
    }
}
