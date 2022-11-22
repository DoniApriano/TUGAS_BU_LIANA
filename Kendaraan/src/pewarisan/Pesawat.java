package pewarisan;

public class Pesawat extends Kendaraan {

    private int pilot;
    private int pramugari;
    private int penumpang;

    public Pesawat(String namaKendaraan) {
        super();
        this.namaKendaraan = namaKendaraan;
    }

    public void setPilot(int pilot) {
        this.pilot = pilot;
    }

    public int getPilot() {
        return pilot;
    }

    public void setPramugari(int pramugari) {
        this.pramugari = pramugari;
    }

    public void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    public int getPenumpang() {
        return penumpang;
    }

    public void infoPesawat() {
        System.out.println("Jumlah Pilot = " + );
    }
}
