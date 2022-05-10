package ThucHanh;

import java.util.Scanner;

public class Th4_Menu {
    public static void main(String[] args) {
        int choice = -1;

        Scanner input = new Scanner(System.in);
        while (choice!=0){
            System.out.println("Menu");
            System.out.println("1. vẽ Tam Giác");
            System.out.println("2. Vẽ hình chữ nhật");
            System.out.println("3. Vẽ hình vuông ");
            System.out.println("0. thoát");
            System.out.println("Nhập lựa chọn theo số");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println(" Hình tam giác");
                    System.out.println("  *  ");
                    System.out.println(" *** ");
                    System.out.println("*****");
                    break;
                case 2:
                    System.out.println(" Hình chữ nhật");
                    System.out.println("************");
                    System.out.println("************");
                    System.out.println("************");
                    break;
                case 3:
                    System.out.println("Hình vuông");
                    System.out.println("****");
                    System.out.println("****");
                    System.out.println("****");
                    System.out.println("****");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println(" Nhập lại lựa chọn");

            }

        }
    }
}
