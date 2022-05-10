package Test;

import java.util.Scanner;

public class TinhNhan {
    public static void main(String[] args) {
        int a;
        int tich = 1;
        do {
            Scanner input = new Scanner(System.in);

            System.out.println("Nhập a:");
            a = input.nextInt();
            tich *= a;
        }while (a!=1 && tich<100);
        System.out.println(tich);
    }
}
