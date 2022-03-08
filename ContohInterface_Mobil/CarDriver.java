package ContohInterface_Mobil;

public class CarDriver {

    private Car car;

    public CarDriver(Car car) {
        this.car = car;
    }

    public void TurnOnEngine() {
        this.car.TurnOnEngine();
    }

    public void TurnOffEngine() {
        this.car.TurnOffEngine();
    }

    public void SpeedUp() {
        this.car.SpeedUp();
    }

    public void SpeedDown() {
        this.car.SpeedDown();
    }

}
