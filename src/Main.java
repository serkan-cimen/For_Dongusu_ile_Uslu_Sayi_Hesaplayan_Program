import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Tabanı giriniz : ");
        int taban = inp.nextInt();

        System.out.print("Üssü giriniz : ");
        int us = inp.nextInt();

        int sonuc = 1;

        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }

        System.out.println("Sonuç : " + sonuc);
    }
}