package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen birinci sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();
        sayi1 = sayi1 ^ sayi2 ^ (sayi2 = sayi1);
        System.out.println(sayi1);
        System.out.println(sayi2);



    }

}
