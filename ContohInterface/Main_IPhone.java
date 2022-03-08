package ContohInterface;

import java.util.Scanner;

public class Main_IPhone {
    
    public static void main(String[] args) {
        iOS IPhone13ProMax = new IPhone();
        iOSUser Rasyid = new iOSUser(IPhone13ProMax);

        Rasyid.turnOnThePhone();
        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            if (aksi.equalsIgnoreCase("1")) {
                Rasyid.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                Rasyid.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                Rasyid.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")) {
                Rasyid.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0);
            } else {
                System.out.println("Aksi Tidak Terdeteksi");
            }
        }
        
    }
    
}
