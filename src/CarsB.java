public class CarsB < B extends CarS > extends Driver {

    public CarsB(String tygachIvanPetrovich, boolean possessionOfDriversLicense, String experience) {
        super(tygachIvanPetrovich, possessionOfDriversLicense, experience);
    }

    public void driverB(B b){
        refuelTheCar();
        System.out.println("Водитель категории В");
    }

    @Override
    public String startMoving() {
        return CarS.PIT_STOP[2];
    }

    @Override
    public String stop() {
        return "Stop";
    }

    @Override
    public String refuelTheCar() {
        return "бензин не ниже 92";
    }

    @Override
    public String toString() {
        return getTygachIvanPetrovich() + " стаж " + getExperience() + " управляет автомобилем класса - " + startMoving() + ", который можно заправлять " + refuelTheCar();
    }
}
