package Test;

import java.util.Scanner;

public class TimDapAn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Nhập a: ");
        int a = input.nextInt();

        System.out.println(" Nhập b: ");
        int b = input.nextInt();

        System.out.println("Nhập Kết Quả");
        int ketQua = input.nextInt();

        while (a + b != ketQua){
            System.out.println(" Bạn đã sai ");
            ketQua= input.nextInt();
        }
        System.out.println(" Bạn đã đúng");
    }
}
