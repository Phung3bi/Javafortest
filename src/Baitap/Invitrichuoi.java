package Baitap;

//Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một ký tự.
//Kiểm tra xem ký tự nhập vào đó nằm ở vị trí thứ mấy trong chuỗi(nếu có, số đếm bắt đầu từ 0).
//Nếu nó có xuất hiện trong chuỗi thì in ra vị trí của nó trong chuỗi, nếu không thì in ra “Không tồn tại trong chuỗi”.

import java.util.Scanner;

public class Invitrichuoi {
    public static void main (String[] args){
        char n;
        String chuoi;
        boolean tontai = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhậpchuôi:");
        chuoi = sc.nextLine();
        System.out.println("nhập ký tự:");
        n = sc.nextLine().charAt(0);

        char mang[] = chuoi.toCharArray();
        for(int i=0; i<mang.length;i++){
            if(n==mang[i]){
                System.out.println("ký tự ở vi trí" +i);
                tontai = true;
            }
        }
        if(tontai==false){
            System.out.println("không tôn tại");
        }



    }
}
