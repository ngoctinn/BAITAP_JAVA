package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập a: ");
            int a = sc.nextInt();
            System.out.println("Nhập b: ");
            int b = sc.nextInt();
            System.out.println("Nhập c: ");
            int c = sc.nextInt();

            int result = c/(a-b);
            System.out.print(result);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            System.err.println("khong thuc hien phep chia cho 0");
            System.out.println("chương trình tiếp tục chạy");
        }






    }


}

