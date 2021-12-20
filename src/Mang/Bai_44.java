package Mang;

import java.util.Scanner;

public class Bai_44 {
    public static void main(String[] args) {
        int[] s = {49, 1, 2, 200, 2, 3, 4, 5, 8, 9, 10};
        int a_leng = s.length;
        int[] s1 = new int[a_leng];
        int[] s2 = new int[a_leng];
        int max = 1;  //mỗi độ dài đề >=1
        int dem = 1;   // đếm các phần tử liên tiếp nhau
        int j = 1;  //biến chạy
        s1[0] = s[0];
        for (int i = 0; i < a_leng - 1; i++) {
            if ( s[i] == s[i+1] - 1) {
                s1[j] = s[i+1];
                dem++;
                j++;
            } else {
                if (max < dem) {
                    max = dem;
                    //chuyển các phần tử ở s1 sang s2
                    for (int a=0; a < max; a++){
                        s2[a] = s1[a];
                    }
                }
                s1[0] = s[i+1]; // gán trở lại vòng lặp
                j = 1;
                dem = 1;
            }
        }
        System.out.println("Độ dài của dãy có phần tử liên tiếp là: " + max);
        System.out.println("Các phần tử của dãy là:");
        for (int i = 0; i < max; i++) {
            System.out.println(s2[i]);
        }
    }
}
