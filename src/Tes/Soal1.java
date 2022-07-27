package Tes;

import java.util.Scanner;

public class Soal1 {
    public String[] arrayKata = getKata();

    public String[] getKata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Kata: ");
        String kata = sc.nextLine();
        sc.close();
        kata = kata.toLowerCase();
        String[] arrayKata = kata.split("");

        return arrayKata;
    }

    public void cetakVokal() {
        System.out.println("Vowel Characters = ");
        for (int i = 0; i < arrayKata.length; i++) {
            if (arrayKata[i].equalsIgnoreCase("a") || arrayKata[i].equalsIgnoreCase("i") || arrayKata[i].equalsIgnoreCase("u") || arrayKata[i].equalsIgnoreCase("e") || arrayKata[i].equalsIgnoreCase("o")) {
                System.out.print(arrayKata[i]);
            }
        }
        System.out.println();
    }
    public void cetakKonsonan() {
        System.out.println("Consonant Characters = ");
        for (int i = 0; i < arrayKata.length; i++) {
            if (!(arrayKata[i].equalsIgnoreCase("a") || arrayKata[i].equalsIgnoreCase("i") || arrayKata[i].equalsIgnoreCase("u") || arrayKata[i].equalsIgnoreCase("e") || arrayKata[i].equalsIgnoreCase("o"))) {
                if (!arrayKata[i].equalsIgnoreCase(" ")) {
                    System.out.print(arrayKata[i]);
                }
            }
        }
    }


    public static void main(String[] args) {
        Soal1 q = new Soal1();
        q.cetakVokal();
        q.cetakKonsonan();
    }
}
