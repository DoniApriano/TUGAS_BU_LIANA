package pewarisan;

public class Kereta extends Kendaraan{
    private int masinis;
    private int penumpang;
    private  int pramugari;

    public Kereta(String namaKendaraan) {
        super();
        this.namaKendaraan = namaKendaraan;
    }

    public void setMasinis(int masinis) {
        this.masinis = masinis;
    }

    public int getMasinis() {
        return masinis;
    }

    public void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    public int getPenumpang() {
        return penumpang;
    }

    public void setPramugari(int pramugari) {
        this.pramugari = pramugari;
    }

    public int getPramugari() {
        return pramugari;
    }

    public void infoKereta() {
        System.out.println("Nama Kendaraan = " + this.namaKendaraan);
        System.out.println("Jumlah Masinis = " + getMasinis());
        System.out.println("Jumlah Pramugari = " + getPramugari());
        System.out.println("Jumlah Penumpang = " + getPenumpang());
        System.out.println("==============================================================");
    }
}