package ders04_Matematiksel_islemler_increment_decrement;

import java.util.Scanner;

public class C11_If_Else_Statement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz :");
        char harf = scan.next().charAt(0);

        if (harf >= 'a' && harf <= 'z') {
            System.out.println((char)(harf - 32));
        } else {
            System.out.println(harf);

        }
    }
}