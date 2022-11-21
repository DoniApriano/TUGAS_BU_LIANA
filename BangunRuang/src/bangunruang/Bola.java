package bangunruang;

public class Bola extends BangunRuang{
    private String namaBangunRuang;

    public Bola(String nama){
        super();
        this.namaBangunRuang = nama;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    private double getJariJari() {
        return this.jariJari;
    }

    public void infoBola() {
        System.out.println("Nama Bangun Ruang : " + this.namaBangunRuang);
        System.out.println("Jari-jari : " + getJariJari());
        System.out.println("Luas " + this.namaBangunRuang + " = " + (4 * 3.14 * getJariJari() * getJariJari()));
    }
}