package Test;

import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tong=0;
        int a;
        do {
            System.out.println(" Nhập vào 1 số nguyên");
            a = input.nextInt();
            tong+=a;
        }while (a!=0);
            System.out.println(" Tổng là: "+ tong);

    }
}
