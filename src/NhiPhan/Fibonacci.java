package NhiPhan;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int a = 0;
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
         */
        System.out.print("Chiều dài fibonacci:");
        int n = scanner.nextInt();
        int soThuNhat = 1;
        int soThuHai = 0;
        for (int i=1; i <=n; i++ ) {
            int soThuBa = soThuHai;
            soThuHai = soThuHai + soThuNhat;
            soThuNhat = soThuBa;
            System.out.print(soThuHai + ", ");
        }
    }
}
