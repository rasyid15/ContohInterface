package ContohInterface;

import java.util.Scanner;

public class Main_Samsung {

    public static void main(String[] args) {

        Phone SamsungNote20 = new Samsung();
        PhoneUser Rasyid = new PhoneUser(SamsungNote20);

        Rasyid.turnOnThePhone();
        Scanner input = new Scanner(System.in);
        int aksi;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextInt();

            switch (aksi) {
                case 1:
                    Rasyid.turnOnThePhone();
                    break;
                case 2:
                    Rasyid.turnOffThePhone();
                    break;
                case 3:
                    Rasyid.makePhoneLouder();
                    break;
                case 4:
                    Rasyid.makePhoneSilent();
                    break;
                case 0:
                    System.exit(aksi);
                    break;
                default:
                    System.out.println("Aksi Tidak Terdeteksi");

            }

        }

    }
}
