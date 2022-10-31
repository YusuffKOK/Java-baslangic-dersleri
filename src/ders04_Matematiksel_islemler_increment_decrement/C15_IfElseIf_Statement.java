package ders04_Matematiksel_islemler_increment_decrement;

import java.util.Scanner;

public class C15_IfElseIf_Statement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz :");
        int kilo = scan.nextInt();
        System.out.println("Lütfen boyunuzu cm cinsinden giriniz :");
        double boy = scan.nextInt();
        double VücutKitleEndeksi = kilo / ((boy * boy)/10000);
        System.out.println(VücutKitleEndeksi);
        if (VücutKitleEndeksi > 30){
            System.out.println("obezsiniz");
        } else if (VücutKitleEndeksi >=25) {
            System.out.println("Kilolusunuz");
        } else if (VücutKitleEndeksi >=20) {
            System.out.println("Fitsiniz");
        }else {
            System.out.println("zayıfsınız");
        }

    }
}
