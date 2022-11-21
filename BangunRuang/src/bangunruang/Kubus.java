package bangunruang;

public class Kubus extends BangunRuang{

    private double sisi;

    public Kubus(String namaBangun) {
        super();
        this.namaBangun = namaBangun;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void infoVolumeKubus() {
        System.out.println("==================================================================");
        System.out.println("Nama bangun = " + this.namaBangun);
        System.out.println("Sisi = " + getSisi());
        System.out.println("Volume Kubus = " + (getSisi() * getSisi() * getSisi()));
        System.out.println("==================================================================");
    }
}
