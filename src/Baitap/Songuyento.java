package Baitap;
//Viết chương trình cho phép nhập vào một số nguyên n ( n < 1000 )
//In ra tất cả số nguyên tố trong khoảng từ 0 - n.

import java.util.Scanner;

public class Songuyento {
    public static void main (String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số nguyên ");
        n = sc.nextInt();

        System.out.println("1 2");

        if(n<1000){
            for(int i =3;i<n;i++){
               for(int j =2; i<j; j++) {
                   if(i%j==0){
                       System.out.println("k phải số nguyên tố");
                   }
                }
               System.out.println("đây là số nguyên tố");



            }
        }
    }
}
