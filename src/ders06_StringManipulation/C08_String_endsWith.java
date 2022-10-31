package ders06_StringManipulation;

public class C08_String_endsWith {
    public static void main(String[] args) {
        String str = "yusufkok4638@gmail.com";
        if(!str.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!str.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz");
        } else if (!str.endsWith("@gmail.com")) {
            System.out.println("hatalı yazım ");
        }

    }

}
