package BaiTap;

import java.util.Scanner;

public class Picture {
    public static void main(String[] args) {
        int choice;

        Scanner input = new Scanner(System.in);
        Scanner nhapSo = new Scanner(System.in);

        do {
            System.out.println("Menu");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình tam giác vuông");
            System.out.println("3. In hình vuông");
            System.out.println("0. Thoát");
            choice = input.nextInt();

            switch (choice) {
                case 1:

                    int chieuDai;
                    int chieuRong;

                    System.out.println("Nhập chiều dài:");
                    chieuDai = nhapSo.nextInt();

                    System.out.println("Nhập chiều rộng");
                    chieuRong = nhapSo.nextInt();

                    for (int i = 1; i < chieuRong; i++) {
//                        Hiển thị số dòng

                        for (int j = 1; j < chieuDai; j++) {
//                            Hiển thị số sao trên 1 dòng
                            System.out.print("*");
                        }

                        System.out.println("*");
                    }
                    break;
                case 2:
                    int chieuCao;

                    System.out.println("Nhập chiều cao");
                    chieuCao = nhapSo.nextInt();

                    for (int i = 1; i < chieuCao; i++) {

                        for (int j = 1; j < i; j++) {
                            System.out.print("*");

                        }
                        System.out.println("*");
                    }
                    break;
                case 3:
                    int canh;

                    System.out.println(" Nhập cạnh hình vuông");
                    canh = nhapSo.nextInt();

                    for (int i = 1; i < canh; i++) {

                        for (int j = 1; j < canh; j++) {
                            System.out.print("*");

                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Nhập lại chức năng");
            }
        } while (choice != -1);
    }
}
