package pewarisan_xira;

import java.util.Scanner;

public class UjiKendaraan {
    public static void main(String[] args) throws Exception{
        try (Scanner input = new Scanner(System.in)) {
            Pesawat pesawat = new Pesawat("Air Asia");
            KeretaApi keretaApi = new KeretaApi("Malabar");

            System.out.println("======= Kereta Api =======");

            System.out.print("Masukkan jumlah penumpang Kereta = ");
            int penumpangKereta = input.nextInt();
            int gerbong = penumpangKereta / 10;

            keretaApi.setPenumpang(penumpangKereta);
            keretaApi.setGerbong(gerbong);
            keretaApi.infoKeretaApi();
            keretaApi.setNaik("Kereta");

            System.out.println("======= Pesawat =======");

            System.out.print("Masukkan jumlah penumpang Pesawat = ");
            int penumpangPesawat = input.nextInt();
            int pramugari = penumpangPesawat / 5;

            pesawat.setPenumpang(penumpangPesawat);
            pesawat.setPramugari(pramugari);
            pesawat.infoPesawat();
            pesawat.setNaik("Pesawat");
        } catch(Exception e) {
            System.err.println(e);
        } finally{
            System.out.println("======= Program Telah Diselesaikan =======");
        }

    }
}
