package NhiPhan;

import java.util.Scanner;

public class TinhTongTrungBinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tong = 0;
        float trungBinhCong = 0;
       /* for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            tong += i;
            trungBinhCong = (float) tong / 100;
        }
        System.out.println("Tong cac so vua nhap la :" + tong);
        System.out.println(new StringBuilder().append("Trung binh cong cac so vua nhap la :").append(trungBinhCong).toString());
        */
        /*int i=1;
        while (i<=100) {
            System.out.println(i);
            i++;
          tong+=i;
          trungBinhCong=(float) tong/100;
        }
        tong+=i;
        trungBinhCong=(float) tong/100;
        System.out.println("Tong cac so vua nhap la :" + tong);
        System.out.println(new StringBuilder().append("Trung binh cong cac so vua nhap la :").append(trungBinhCong).toString());

         */

        int i = 0;
        do {
            tong+=i;
            i++;
        }while (i<=100);
        System.out.println(i);
        System.out.println(new StringBuilder().append("Tong tu 1 den 100 la ").append(tong).toString());
        trungBinhCong=(float) tong/100;
        System.out.println(new StringBuilder().append("Trung binh cong cac so tu 1 den 100 la :").append(trungBinhCong).toString());
    }
}
