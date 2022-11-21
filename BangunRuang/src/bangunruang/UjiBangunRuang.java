package bangunruang;

public class UjiBangunRuang  {
    public static void main(String[] args) throws Exception {
        Bola bola = new Bola("Bola");
        Kubus kubus = new Kubus("Kubus");
        Tabung tabung = new Tabung("Tabung");

        bola.setJariJari(10);
        bola.infoBola();
        System.out.println("======================");
        kubus.setJariJari(10);
        kubus.infoKubus();
        System.out.println("=======================");
        tabung.setJariJari(9);
        tabung.setTinggi(10);
        tabung.infoTabung();
    }
}
