package pewarisan_xira;

public class Pesawat extends Kendaraan {
    private int penumpang;
    private int pramugari;

    public Pesawat(String nama) {
        super();
        this.namaKendaraan = nama;
    }

    public void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    public int getPenumpang() {
        return this.penumpang;
    }

    public void setPramugari(int pramugari) {
        this.pramugari = pramugari;
    }

    public int getPramugari() {
        return this.pramugari;
    }

    public void infoPesawat() {
        System.out.println("Merk Pesawat = " + this.namaKendaraan);
        System.out.println("Jumlah Penumpang = " + getPenumpang());
        System.out.println("Jumlah Pramugari = " + getPramugari());
    }
}
