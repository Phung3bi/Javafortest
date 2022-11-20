package Baitap;
//Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên (có thể dương hoặc âm).
//Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị nhỏ nhất

import java.util.Scanner;

public class Giatrinhonhat {
    public static void main (String[] args){
        int n;
        int[] songuyen;
        int min = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n:");
        n = sc.nextInt();

        songuyen = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("nhap day so nguyen");
            songuyen[i] = sc.nextInt();
        }
        for(int i =0; i<n;i++){
            if(songuyen[i]<=min){
                min = songuyen[i];
            }
        }
        System.out.println("so min la" +min);

    }
}
