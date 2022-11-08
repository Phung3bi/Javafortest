package Baitap;

// Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
//Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng này.

import java.util.Scanner;

public class Giatritrungbinh {
    public static void main(String[] args){
        int n;
        int[] songuyen;
        float sum =0;
        float trungbinh;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n:");
        n = sc.nextInt();

        songuyen = new int[n];
        for(int i =0; i<n; i++){
            System.out.println("nhap day so nguyen:");
            songuyen[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            sum = sum + songuyen[i];
        }
        trungbinh = sum/n;
        System.out.println("gia tri trung binh la:" + trungbinh);
    }

}
