package bangunruang;

public class Kubus extends BangunRuang {
    private String namaBangunRuang;

    public Kubus(String nama) {
        super();
        this.namaBangunRuang = nama;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    private double getJariJari() {
        return this.jariJari;
    }

    public void infoKubus() {
        System.out.println("Nama Bangun Ruang : " + this.namaBangunRuang);
        System.out.println("Jari-jari : " + getJariJari());
        System.out.println("Keliling " + this.namaBangunRuang + " = " + (12 * getJariJari()));
    }
}
