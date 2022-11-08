package Baitap;

//Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên dương.
//Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị lớn nhất

import java.util.Scanner;

public class Giatrilonnhat {
    public static void main(String[] args){
        int n;
        int[] songuyen;
        int max =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp so nguyen n:");
        n = sc.nextInt();

        songuyen = new int[n];
        for(int i =0; i<n;i++){
            System.out.println("nhập n phan tu so nguyen:");
            songuyen[i] = sc.nextInt();
        }
        for(int i =0; i<n;i++){
            if( songuyen[i] >= max){
                max = songuyen[i];
            }
        }
        System.out.println("gia tri lon nhat la:"+max);

    }
}
