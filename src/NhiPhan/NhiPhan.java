package NhiPhan;

import java.util.Scanner;

public class NhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n : ");
        int n = scanner.nextInt();
        //System.out.println(Integer.toBinaryString(n));
        String nhiPhan = "";
        /* 15 / 2 = 7 du 1
        7 / 2 = 3 du 1
        3/2 = 1 du 1
        1/2 = 1 du 1
        8/2= 4 du 0;4/2=2 du 0 ; 2/2 = 1 du 0 / 1/2 =1 du 1
         */
        while (n>0){
            nhiPhan = (n% 2) + nhiPhan;
            n = n/2;
        }
        System.out.println("He nhi phan la:"+nhiPhan);
    }
}
