package Baitap;
import java.util.Scanner;
    //Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
// Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng này.
    public class Tinhtongmotmang {
        public static void main (String[] args){
            int n;
            int[] songuyen;
            float tong =0;

            Scanner input = new Scanner(System.in);
            System.out.println("nhập giá trị n:");
            n = input.nextInt();

            songuyen = new int[n];
            for(int i =0; i <n; i++){
                System.out.println("nhập giá tri mang so nguyen:");
                songuyen[i] = input.nextInt();
            }
            for (int i=0;i<n;i++){
                tong = tong + songuyen[i];
            }
            System.out.println(tong);
        }
    }



