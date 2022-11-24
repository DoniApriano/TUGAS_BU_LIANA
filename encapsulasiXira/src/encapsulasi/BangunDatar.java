package encapsulasi;


public class BangunDatar {
    private double tinggi;
    private double alas;

    public BangunDatar() {
        System.out.println("Ini adlah bangun datar segitiga");
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getAlas() {
        return alas;
    }

    public  void  infoSegitiga() {
        System.out.println("tinggi = " + getTinggi());
        System.out.println("alas = " + getAlas());
        System.out.println("Luas = " + (getAlas() * getTinggi() /2));
    }
}
