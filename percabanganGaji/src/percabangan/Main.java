package percabangan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gajiPokok = input.nextInt();
        int potongan = 200000;
        int gaji = gajiPokok - potongan;

        if (gajiPokok > 300000) {
            System.out.println("Gaji bersih = " + (gaji + (gajiPokok * 0.10)));
        } else {
            System.out.println("Gaji bersih = " + (gaji + (gajiPokok * 0.5)));
        }
    }

}
