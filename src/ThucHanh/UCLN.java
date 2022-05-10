package ThucHanh;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập a: ");
        a = input.nextInt();

        System.out.println(" nhập b: ");
        b = input.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Hai số không có ước chung lớn nhất");
        }

        while (a != b) {
            if (a > b) {
                a = a - b;

            } else {
                b = b - a;

            }
        }
        System.out.println(" Ước chung lớn nhất của a và b là: " + a);

    }
}
