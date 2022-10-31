package ders04_Matematiksel_islemler_increment_decrement;

public class C05_Pre_Post_İncrement {
    public static void main(String[] args) {
        int x = 3;
        int y = 2 * ++x; // y=8 x= 4
        int z = 5 + y--; // z=13 y=7
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(x + y + z);
    }
}
