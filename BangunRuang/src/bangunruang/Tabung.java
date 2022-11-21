package bangunruang;

public class Tabung extends BangunRuang{

    private double tinggi;
    private double jariJari;

    public Tabung(String namaBangun) {
        super();
        this.namaBangun = namaBangun;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void infoVolumeTabung() {
        System.out.println("==================================================================");
        System.out.println("Nama Bangun = " + this.namaBangun);
        System.out.println("Tinggi Tabung = " + getTinggi());
        System.out.println("Jari-jari Tabung = " + getJariJari());
        System.out.println("Volume Tabung = " + (3.14 * getJariJari() * getJariJari() * getTinggi()));
        System.out.println("==================================================================");
    }
}
