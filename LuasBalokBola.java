package PBO;

import java.util.Scanner;
import static sun.java2d.cmm.ColorTransform.In;

public class LuasBalokBola {

    public static void main(String[] args) {
        Scanner hab = new Scanner(System.in);

        int choice;

        System.out.println("=== PILIH MAU PAKE TOOLS APA ? ===");
        System.out.println("\n[1] Ukur Luas Bola \n[2] Ukur Luas Balok");
        System.out.println("======================================");
        System.out.println("Masukan Pilihan : ");
        choice = hab.nextInt();

        switch (choice) {
            case 1:
                double phi = 3.14;
                double r;
                Scanner syi = new Scanner(System.in);
                System.out.println("=== TOOLS MENCARI LUAS BOLA ===");
                System.out.println("Masukan Jari jari : ");
                r = syi.nextInt();
                System.out.println("================== HASIL =====================");
                System.out.println("Luas Permukaan Bola : " + 4 * phi * r * r);
                 break;
            case 2:
                int p,
                 l,
                 t;
                Scanner udin = new Scanner(System.in);
                System.out.println("=== TOOLS MENCARI LUAS BALOK ===");
                System.out.println("Masukkan Panjang    : ");
                p = hab.nextInt();
                System.out.println("Masukkan Lebar      : ");
                l = hab.nextInt();
                System.out.println("Masukkan Tinggi     : ");
                t = hab.nextInt();
                System.out.println("================== HASIL =====================");
                System.out.println("Luas permukaan balok :" + ((2 * p * l) + (2 * p * t) + (2 * l * t)));
                 break;
        }
    }
}
