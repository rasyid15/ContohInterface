package ContohInterface_Mobil;

public class Xenia implements Car{
    private int Speed;
    private boolean isEngineOn;

    public Xenia() {
        this.Speed = 0;
    }

    @Override
    public void TurnOnEngine() {
        isEngineOn = true;
        System.out.println("Mesin Menyala");
        System.out.println("AC Menyala");
        System.out.println("Audio Menyala");
    }

    @Override
    public void TurnOffEngine() {
        isEngineOn = false;
        System.out.println("Kendaraan Mati");

    }

    @Override
    public void SpeedUp() {
        if (isEngineOn) {
            if (this.Speed == MAX_SPEED) {
                System.out.println("Max Speed");
                System.out.println(this.getSpeed() + "Km/h");
            } else {
                this.Speed += 10;
                System.out.println("Speed : " + this.getSpeed() + "Km/h");
            }
        } else {
            System.out.println("Start Engine First");
        }

    }

    @Override
    public void SpeedDown() {
        if (isEngineOn) {
            if (this.Speed == MIN_SPEED) {
                System.out.println("Speed = 0 Km/h");
                System.out.println(this.getSpeed() + "Km/h");
            } else {
                this.Speed -= 5;
                System.out.println("Speed : " + this.getSpeed() + "Km/h");
            }
        } else {
            System.out.println("Start Engine First");
        }
    }

    public int getSpeed() {
        return this.Speed;
    }
    
}
