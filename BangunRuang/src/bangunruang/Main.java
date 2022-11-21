package bangunruang;

public class Main {

    public static void main(String[] args) {

        Bola bola = new Bola("Bola");
        Kubus kubus = new Kubus("Kubus");
        Tabung tabung = new Tabung("Tabung");

        bola.setJariJari(10);
        bola.infoLuasBola();

        kubus.setSisi(10);
        kubus.infoVolumeKubus();

        tabung.setJariJari(10);
        tabung.setTinggi(10);
        tabung.infoVolumeTabung();
    }

}
