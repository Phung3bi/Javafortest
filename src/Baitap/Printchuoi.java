package Baitap;

//Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một ký tự.
//Kiểm tra xem ký tự đó có xuất hiện trong chuỗi hay không? Nếu có in ra “Có”, ngược lại in ra “Không”.

import java.util.Scanner;

public class Printchuoi {
    public static void main(String[] args) {
        String chuoi;
        char n;
        boolean tontai = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuôi: ");
        chuoi = sc.nextLine();
        System.out.println("nhập kí tự: ");
        n = sc.nextLine().charAt(0);

        char mang[] = chuoi.toCharArray();
        for (int i = 0; i <= mang.length; i++) {
            if (n == mang[i]) {
                System.out.println("có");
                tontai = true;
            }
        }
        if (tontai == false)
            System.out.println("không");

    }

}
