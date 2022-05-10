package ThucHanh;

import java.util.Scanner;

public class Th2_TinhLaiSuat {
    public static void main(String[] args) {
        double soTienGui;
        int soThangGui;
        double laiSuat;
        Scanner input = new Scanner(System.in);

        System.out.println(" Nhập số tiền gửi: ");
        soTienGui = input.nextInt();

        System.out.println( " Nhập tháng gửi: ");
        soThangGui = input.nextInt();

        System.out.println(" Nhập lãi suất: ");
        laiSuat = input.nextInt();

        double tongTienSauLai = 0;
    for ( int i=0; i <soThangGui;i++){
        tongTienSauLai+= soTienGui * (laiSuat/100)/12 * soThangGui;

    }
        System.out.println("Tổng tiền lãi sau khi gửi ngân hàng là:" + tongTienSauLai);
    }
}
