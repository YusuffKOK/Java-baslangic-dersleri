package ders04_Matematiksel_islemler_increment_decrement;

import java.util.Scanner;

public class C03_Modulusİşlemi {
    public static void main(String[] args) {
        int input = 1453;
        int birlerBasamagi = 0 ;
        int rakamlarToplamı =0 ;
        // birler basmagini al
        birlerBasamagi = input % 10; // 3 ü verir
        // birler basamagini rakamlar toplamına ekle
        rakamlarToplamı = rakamlarToplamı + birlerBasamagi ;
        // birler basamagindan kurtul
        input =input/10;

        birlerBasamagi = input % 10; // 3 ü verir
        rakamlarToplamı = rakamlarToplamı + birlerBasamagi ;
        input =input/10;

        birlerBasamagi = input % 10; // 3 ü verir
        rakamlarToplamı = rakamlarToplamı + birlerBasamagi ;
        input =input/10;

        birlerBasamagi = input % 10; // 3 ü verir
        rakamlarToplamı = rakamlarToplamı + birlerBasamagi ;
        input =input/10;

        System.out.println("girilen sayinin rakamları toplamı =" + rakamlarToplamı);



    }
}
