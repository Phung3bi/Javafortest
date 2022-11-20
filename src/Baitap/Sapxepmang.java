package Baitap;
//Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
//Sắp xếp các phần tử trong mảng theo thứ tự ngược lại.

//SAI

import java.util.Scanner;

public class Sapxepmang {
    public static void main (String [] args){
        int n;
        int[] songuyen;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n:");
        n = sc.nextInt();

        songuyen = new int[n];
        for(int i=0; i<=n;i++){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("nhập day so nguyen:");
            songuyen[i] = sc1.nextInt();
        }

        int[] songuyen1 = new int[n];
        for(int i=n-1;i<=n;i--){
            songuyen1[i] = songuyen[i];
        }
        System.out.println(songuyen1);

    }
}
