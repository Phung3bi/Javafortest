package Baitap;

import java.util.Scanner;

//Viết chương trình cho phép nhập vào một chuỗi
//Kiểm tra xem chuỗi này ký tự “a” xuất hiện bao nhiêu lần
//In ra số lần đó.
public class Kiemtrakitutrongchuoi {
    public static void main (String[] args){
        String chuoi;
        int solan = 0;
        boolean tontai = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        chuoi = sc.nextLine();

        char mang[] = chuoi.toCharArray();

        for(int i = 0;i <=mang.length; i++){
            if('a'== mang[i]) {
                solan++;
                tontai = true;
            }

        }
        if(tontai=false){
            System.out.println("không tồn tại");
        }


    }
}
