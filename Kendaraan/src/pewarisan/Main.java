package pewarisan;

public class Main {

    public static void main(String[] args) {

        Pesawat pesawat = new Pesawat("Pesawat");
        Kereta kereta = new Kereta("Kereta");

        pesawat.setPilot(2);
        pesawat.setPramugari(10);
        pesawat.setPenumpang(50);
        pesawat.infoPesawat();

        pesawat.setPilot(2);
        pesawat.setPramugari(10);
        pesawat.setPenumpang(50);
        pesawat.infoPesawat();

    }

}
