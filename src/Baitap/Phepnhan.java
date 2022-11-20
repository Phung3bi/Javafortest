package Baitap;

//Viết chương trình để nhập nhập một số nguyên, tìm kết quả phép nhân của số đó với các số từ 1 - 20 , sau đó in kết quả ra màn hình

import java.util.Scanner;

public class Phepnhan {
    public static void main(String[] args){
        int n ;
        int ketqua =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n:");
        n = sc.nextInt();
        for(int i =1; i<=20;i++){
            ketqua = n*i;
            System.out.println("kết quả" + n +"x" + i + "=" + ketqua);
        }
    }
}
