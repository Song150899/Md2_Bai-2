package BaiTap;

import java.util.Scanner;

public class Bt2_20_SNT {
    public static void main(String[] args) {
        int number;
        int status = 1;
        int num = 3;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập vào số lượng số nguyên tố đầu tiên");
        number = input.nextInt();

        if (number >= 1) {
            System.out.println("Số nguyên tố đầu tiên là:" + number);
            System.out.println(2);
        }
        for (int i = 2; i <= number; ) {

            for (int j = 2; j <= Math.sqrt(num); j++) {

                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }

            if (status != 0) {
                System.out.println(num);
                i++;
            }

            status = 1;
            num++;
        }


    }
}
