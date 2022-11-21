package percabangan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai = input.nextInt();

        if (nilai >= 73) {
            System.out.println("nilai diatas kkm");
        } else if (nilai < 73) {
            System.out.println("nilai dibawah kkm");
        } else {
            System.out.println("nilai tidak valid");
        }
    }

}
