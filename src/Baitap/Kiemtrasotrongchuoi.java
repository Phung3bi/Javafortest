package Baitap;

//Viết chương trình cho phép nhập vào một chuỗi, kiểm tra xem chuỗi này có xuất hiện số hay không.
//Nếu có tin ra “Có”, ngược lại, in ra “Không”.

import java.util.Scanner;

public class Kiemtrasotrongchuoi {
    public static void main(String[] args){
        String chuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuôi: ");
        chuoi = sc.nextLine();

        if(chuoi.matches(".*\\d.*")){
            System.out.println("có");

        }else{
            System.out.println("không");
        }

    }
}
