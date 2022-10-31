package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C05_Scanner2 {
    public static void main(String[] args) {
        // kullanıcıdan bir double bir de tam sayı alın
        // bu iki sayının çarpımını ve toplamını yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir ondalıklı sayı giriniz :");
        double ondalikliSayi = scan.nextDouble();
        System.out.println("Lütfen bir tam sayi giriniz:");
        int tamSayi = scan.nextInt();
        System.out.println("girilen sayilarin toplamı =" + (ondalikliSayi+tamSayi));
        System.out.println("girilen sayilarin çarpımı =" + (ondalikliSayi*tamSayi));
    }
}
