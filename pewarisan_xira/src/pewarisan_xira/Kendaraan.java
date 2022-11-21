package pewarisan_xira;

public class Kendaraan {
    protected String namaKendaraan;

    public Kendaraan() {
        System.out.println("Ini adalah superclass");
    }

    public void setNaik(String nama) {
        this.namaKendaraan = nama;
        System.out.println("Kamu menaiki " + this.namaKendaraan);
    }
}
