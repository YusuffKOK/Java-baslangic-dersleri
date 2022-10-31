package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        // sayi değiştirme işlemi
        // girilen iki sayinin yerlerini degistirmek icin kullanırız
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen birinci sayiyi giriniz :");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz :");
        int sayi2= scan.nextInt();
        int sayiDegisim = sayi1;
        sayi1 = sayi2;
        sayi2 = sayiDegisim;
        System.out.println("Birinci sayi :" + sayi1 + "\n İkinci Sayi :" + sayi2);








    }
}
