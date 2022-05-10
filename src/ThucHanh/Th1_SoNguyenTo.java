package ThucHanh;

import java.util.Scanner;

public class Th1_SoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Nhập vào 1 số: ");
        int a = input.nextInt();

        if (a < 2) {
            System.out.println(a + " không phải là số nguyên tố");
        }else {
            int i=2;
            boolean kiemTra = true;
            while (i <a ){
                if ( a % i ==0){
                    kiemTra= false;
                    break;
                }
                i++;
            }
            if (kiemTra){
                System.out.println(a + " Là số nguyên tố");
            }else {
                System.out.println(a + " Không phải số nguyên tố");
            }
        }
    }
}
