package Test;

import java.util.Scanner;

public class TinhHieu {
    public static void main(String[] args) {
        int a;

        int hieu = 0;
        Scanner input = new Scanner(System.in);



        do {
            System.out.println("Nhập vào a");
            a= input.nextInt();

             hieu -= a ;
        }while (a!=0 );
        System.out.println( hieu);

    }
}
