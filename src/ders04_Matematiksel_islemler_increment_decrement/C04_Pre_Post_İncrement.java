package ders04_Matematiksel_islemler_increment_decrement;

public class C04_Pre_Post_İncrement {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        int c = ++b;
        System.out.println("a :" + a +"\nb :" + b + "\nc :" + c);

        a = 20;
        b = a++;
        c = ++a;
        System.out.println("a :" + a +"\nb :" + b + "\nc :" + c);

        a = 30;
        System.out.println(a++); // 30
        System.out.println(++a); // 32
        System.out.println(a--); // 32
        System.out.println(--a); // 30
        System.out.println(a);   // 30






    }
}
