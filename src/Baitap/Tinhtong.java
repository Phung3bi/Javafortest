package Baitap;

import java.util.Scanner;

//Viết chương trình cho phép nhập vào một số nguyên dương n, tính tổng tất cả số chẵn trong khoảng từ 0 - n.
public class Tinhtong {
    public static void main (String [] args){
        int n;
        int sum =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhạp so nguy duong:");
        n = sc.nextInt();

        for(int i =0; i<=n;i++){
            if(i%2==0){
                sum = sum + i;
            }
        }
        System.out.println("tông so nguyen la: "+sum);
    }
}
