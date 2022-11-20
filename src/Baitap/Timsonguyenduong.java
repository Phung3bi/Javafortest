package Baitap;

import java.util.Scanner;

//Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta nhập vào một số nguyên, in ra màn hình “Đây là số nguyên dương”.
//Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0, ngược lại in ra “Đây là số nguyên âm”.
public class Timsonguyenduong {
    public static void main (String [] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên:");
        n = sc.nextInt();
        if (n>=0){
            System.out.println("đây la số nguyên dương");
        }
        else {
            System.out.println("Đây la số nguyên âm");
        }
    }
}
