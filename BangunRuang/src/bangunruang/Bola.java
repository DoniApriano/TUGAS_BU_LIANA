package bangunruang;

public class Bola extends BangunRuang{
    private double jariJari;

    public Bola(String namaBangundatar) {
        super();
        this.namaBangun = namaBangundatar;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void infoLuasBola() {
        System.out.println("==================================================================");
        System.out.println("Nama bangun = " + this.namaBangun);
        System.out.println("Jari-jari = " + getJariJari());
        System.out.println("Luas Permukaan Bola = " + (4 * 3.14 * getJariJari() * getJariJari()));
        System.out.println("==================================================================");
    }
}
