package ders03_DataCasting;

import java.util.Scanner;

public class C01_DataCasting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi = scan.nextInt();
        byte sayiDegisim =(byte) sayi;
        System.out.println(sayiDegisim);

    }
}
