package Baitap;

import java.util.Scanner;

//Viết chương trình cho phép nhập vào 3 số thực
//Chương trình này sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác hay không.
public class Bacanhtamgiac {
    public static void main(String[] args) {
        int a,b,c;
        int sothuc;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so thuc a:");
        a = sc.nextInt();
        System.out.println("nhap so thuc b:");
        b = sc.nextInt();
        System.out.println("nhap so thuc c:");
        c = sc.nextInt();

        if(a<(b+c)&&b<(a+c)&&c<(a+b)){
            System.out.println("đây là 3 cạnh của tam giác");
        }
        else{
            System.out.println("đây không phải là 3 canh của tam giác");
        }


    }
}

