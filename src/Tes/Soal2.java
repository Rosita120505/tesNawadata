package Tes;

import java.util.Arrays;
import java.util.Scanner;

public class Soal2 {

    public Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public int totalFamily = getFamily();
    public int[] totalMemberFamily = getMemberFamily();

    public int getFamily() {
        System.out.println("Masukkan Jumlah Keluarga = ");
        int jumlahFamily = sc.nextInt();
        return jumlahFamily;
    }

    public int[] getMemberFamily() {
        System.out.println("Masukkan Jumlah Anggota Keluarga = ");
        String member = sc.next();
        String[] arrMemberFamily = member.split(" ");
        int memberInt[] = new int[arrMemberFamily.length];
        for (int i = 0; i < memberInt.length;i++){
            memberInt[i] = Integer.valueOf(arrMemberFamily[i]);
        }
        return memberInt;
    }

    public int totalOrang(){
        int total = 0;
        for (int i = 0; i < totalMemberFamily.length;i++){
            total = total + totalMemberFamily[i];
        }
        return total;
    }

    public int minimumBus(){
        int totalOrang = totalOrang();
        int kapasitasBus = 4;
        int minimumBus;
        if(totalOrang % kapasitasBus == 0){
            minimumBus = totalOrang / kapasitasBus;
        } else {
            minimumBus = totalOrang / kapasitasBus + 1;
        }
        return minimumBus;
    }

    public void cetak() {
        System.out.println(totalFamily);
        System.out.println(Arrays.toString(totalMemberFamily));
        if (totalFamily != totalMemberFamily.length) {
            System.out.println("Input must be equal with count of family");
        } else {
            System.out.println("Jumlah Bus = " + minimumBus());
        }
    }

    public static void main(String[] args) {
        Soal2 p = new Soal2();
        p.cetak();
    }
}
