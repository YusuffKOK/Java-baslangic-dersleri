package ders03_DataCasting;

import java.util.Scanner;

public class C03_CharDataCasting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir karakter giriniz :");
        char karakter = scan.next().charAt(0);
        System.out.println("" + (char)(karakter+1) + (char)(karakter+2) + (char)(karakter+3));

    }
}
