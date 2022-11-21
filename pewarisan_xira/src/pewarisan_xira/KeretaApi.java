package pewarisan_xira;

public class KeretaApi extends Kendaraan {
    private int penumpang;
    private int gerbong;

    public KeretaApi(String nama) {
        super();
        this.namaKendaraan = nama;
    }

    public void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    public int getPenumpang() {
        return this.penumpang;
    }

    public void setGerbong(int gerbong) {
        this.gerbong = gerbong;
    }

    public int getGerbong() {
        return this.gerbong;
    }

    public void infoKeretaApi() {
        System.out.println("Merk Kereta Api = " + this.namaKendaraan);
        System.out.println("Jumlah Penumpang = " + getPenumpang());
        System.out.println("Jumlah Gerbong = " + getGerbong());
    }
}
