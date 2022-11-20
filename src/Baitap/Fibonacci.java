package Baitap;

//Viết chương trình cho phép nhập vào số nguyên n( n <= 20 ), in ra số Fibonacci ứng với nó.
//Số Fibonacci là số mà nó bằng tổng của 2 số Fibonacci trước nó.
//Với giả thuyết là Fi(0) = 1, Fi(1) = 1.
//Ta có ví dụ: Fi(2) = Fi(0) + Fi(1) = 1+1 = 2, Fi(3) =Fi(2) + Fi(1) = 2+1 = 3, Fi(4) = Fi(3) + Fi(2) = 3+2 = 5, … Giả sử n = 4, đầu ra sẽ là 5

import java.util.Scanner;

public class Fibonacci {
    public static void main(String [] args){
        int n;
        int start = 1;
        int end = 1;
        int ketqua =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vi tri Fibonacci:");
        n = sc.nextInt();

        if (n<=20){
            for(int i = 2; i <= n; i++) {
                ketqua = start + end;
                start = end;
                end = ketqua;
            }
                System.out.println("kết qủa fi là:" + ketqua);

        }
        else {
            System.out.println("nhập số nguyên không hợp lệ");
        }

    }
}
