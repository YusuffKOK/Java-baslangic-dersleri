package ders04_Matematiksel_islemler_increment_decrement;

public class C17_Nested_If_Statements {
    public static void main(String[] args) {
        String cinsiyet = "Erkek";
        int yas = 68;
        if (cinsiyet.equals("Kadin")){
            if (yas >= 60){
                System.out.println("Emekli oldunuz");
            }else {
                System.out.println("Emekli olmanıza " + (60-yas) + " yil var.");
            }
        }else {
            if (yas >= 65){
                System.out.println("Emekli oldunuz");
            }else {
                System.out.println("Emekli olmanıza " + (65-yas) + " yil var.");
            }
        }
    }
}
