package bangunruang;

public class Tabung extends BangunRuang {
    private String namaBangunRuang;
    private double tinggi;

    public Tabung(String nama) {
        super();
        this.namaBangunRuang = nama;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    private double getJariJari() {
        return this.jariJari;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    private double getTinggi() {
        return this.tinggi;
    }

    public void infoTabung() {
        System.out.println("Nama Bangun Ruang = " + this.namaBangunRuang);
        System.out.println("Jari-jari = " + getJariJari());
        System.out.println("Volume " + this.namaBangunRuang + " = " + (3.14 * getJariJari() * getJariJari() * getTinggi()));
    }

    while (alive) {
        
    }
}