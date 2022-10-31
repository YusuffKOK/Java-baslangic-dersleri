package ders04_Matematiksel_islemler_increment_decrement;

import java.util.Scanner;

public class C10_If_Else_Statement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz :");
        int yas = scan.nextInt();
        if (yas >= 65) {
            System.out.println("Emekli olmaya hakkiniz var.");
        }
            else{
                System.out.println("Emekli olmanıza " + (65-yas) + " yıl daha var.");
            }


    }
}
