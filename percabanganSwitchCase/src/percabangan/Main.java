package percabangan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();

        switch (angka){
            case 1:
                System.out.println("Angka yang anda masukkan adalah " + angka);
            case 2:
                System.out.println("Angka yang anda masukkan adalah " + angka);
                break;
            case 3:
                System.out.println("Angka yang anda masukkan adalah " + angka);
                break;
            case 4:
                System.out.println("Angka yang anda masukkan adalah " + angka);
                break;
            default:
                System.out.println("MAAF, NILAI YANG ANDA MASUKKAN TYDACK VALDI");
                break;
        }

    }

}
