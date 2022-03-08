
package ContohInterface_Mobil;

import java.util.Scanner;

public class Xenia_Main {
    
    public static void main(String[] args) {

        Car Xenia = new Xenia();
        CarDriver Rasyid = new CarDriver(Xenia);

        Rasyid.TurnOnEngine();
        Scanner input = new Scanner(System.in);
        int aksi;

        while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Start Engine");
            System.out.println("[2] Shutdown Engine");
            System.out.println("[3] Speed Up");
            System.out.println("[4] Speed Down");
            System.out.println("[0] Out");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextInt();

            switch (aksi) {
                case 1:
                    Rasyid.TurnOnEngine();
                    break;
                case 2:
                    Rasyid.TurnOffEngine();
                    break;
                case 3:
                    Rasyid.SpeedUp();
                    break;
                case 4:
                    Rasyid.SpeedDown();
                    break;
                case 0:
                    System.exit(aksi);
                    break;
                default:
                    System.out.println("Aksi Anda Salah");

            }

        }

    }
}
