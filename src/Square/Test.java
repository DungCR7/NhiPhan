package Square;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài :");
        float width = scanner.nextFloat();
        System.out.println("Nhập chiều rộng :");
        float height = scanner.nextFloat();
        Rectangle rectangle = new Rectangle(height,width);
        System.out.println("Chu vi là :"+ rectangle.chuVi());
        System.out.println("Diện tích là :"+ rectangle.dienTich());
        boolean kiemTraHinhVuong = rectangle.kiemTraHinhVuong();
        if (width == height){
            System.out.println("Đây là hình vuông");
        }else {
            System.out.println("Đây không phải hình vuông");
        }
    }
}
