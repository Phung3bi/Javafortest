package Baitap;

import java.util.Scanner;

//Viết chương trình cho phép nhập vào 3 số
//Chương trình sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác vuông hay không.
public class Tamgiacvuong {
    public static void main (String [] arge){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a,b,c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b){
            System.out.println("đây là 3 cạnh tam giác vuông");

        }else{
            System.out.println("không phải 3 canh tam giác vuông");
        }
    }

}
