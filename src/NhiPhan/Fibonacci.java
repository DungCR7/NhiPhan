package NhiPhan;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int soThuNhat = 0,soThuHai=1;
        int soThuBa;
        do {
            System.out.println("Nhập a :");
            a = scanner.nextInt();
        }while (a<0);
        for (int i = 0;i<a;i++){
            soThuBa=soThuNhat+soThuHai;
            soThuNhat=soThuHai;
            soThuHai=soThuBa;
            System.out.print("\t "+soThuBa);
        }
    }
}
