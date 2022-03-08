package ContohInterface_Mobil;

import java.util.Scanner;

public class Jeep_Main {

    public static void main(String[] args) {

        Car Jeep = new Jeep();
        CarDriver Rasyid = new CarDriver(Jeep);

        Rasyid.TurnOnEngine();
        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Start Engine");
            System.out.println("[2] Shutdown Engine");
            System.out.println("[3] Speed Up");
            System.out.println("[4] Speed Down");
            System.out.println("[0] Out");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            if (aksi.equalsIgnoreCase("1")) {
                Rasyid.TurnOnEngine();
            } else if (aksi.equalsIgnoreCase("2")) {
                Rasyid.TurnOffEngine();
            } else if (aksi.equalsIgnoreCase("3")) {
                Rasyid.SpeedUp();
            } else if (aksi.equalsIgnoreCase("4")) {
                Rasyid.SpeedDown();
            } else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

    }
}
