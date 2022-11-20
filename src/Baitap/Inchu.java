package Baitap;

import java.util.Scanner;

//Viết chương trình cho phép nhập vào một số nguyên dạng số, sau khi chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ.
// VD: 1 -> Một, 2 -> Hai, …
public class Inchu {
    public static void main (String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so:");
        n = sc.nextInt();

        switch(n){
            case(1):
                System.out.println("một");
                break;
            case(2):
                System.out.println("hai");
                break;
            case(3):
                System.out.println("ba");
                break;
            case(4):
                System.out.println("bốn");
                break;
            case(5):
                System.out.println("năm");
                break;
            case(6):
                System.out.println("sáu");
                break;
            case(7):
                System.out.println("bảy");
                break;
            case(8):
                System.out.println("tám");
                break;

            default:
        }
    }
}
