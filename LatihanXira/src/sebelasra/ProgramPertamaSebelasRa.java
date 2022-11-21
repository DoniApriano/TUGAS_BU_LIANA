package sebelasra;

import java.util.Scanner;

public class ProgramPertamaSebelasRa {

    public static void main(String[] args) {

        /*String nama = "Doni Apriano";
        int umur = 16;
        String alamat = "Matesih, Karanganyar";
        String cita2 = "Mobile Developer";
        String jekel = "Laki-laki";

        System.out.println(nama);
        System.out.println(umur);
        System.out.println(alamat);
        System.out.println(cita2);
        System.out.println(jekel);
        System.out.println("Hobi : Main Game");*/






        Scanner input = new Scanner(System.in);

        /*System.out.print("Masukkan Harga = ");
        int harga = input.nextInt();
        int potongan = 20000;
        int bayar = harga - potongan;
        System.out.println("Yang harus dibayar = " + bayar);*/

/*
        System.out.println("");
*/

        System.out.print("Masukkan Nama = ");
        String nama = input.nextLine();
        System.out.print("Masukkan Hobi = ");
        String hobi = input.nextLine();
        System.out.print("Masukkan Umur = ");
        int umur = input.nextInt();

        System.out.println("=============================");

        System.out.println("Nama " + nama);
        System.out.println("Hobi " + hobi);
        System.out.println("Umur " + umur);



    }

}
