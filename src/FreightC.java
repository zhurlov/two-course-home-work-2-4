public class FreightC < C extends Trucks > extends Driver {
    public FreightC(String tygachIvanPetrovich, boolean possessionOfDriversLicense, String experience) {
        super(tygachIvanPetrovich, possessionOfDriversLicense, experience);
    }

    @Override
    public String startMoving() {
        return CarS.PIT_STOP[1];
    }

    @Override
    public String stop() {
        return "Stop";
    }

    @Override
    public String refuelTheCar() {
        return "Дизельным топливом и с включенным двигателем";
    }

    @Override
    public String toString() {
        return getTygachIvanPetrovich() + " стаж " + getExperience() + " управляет автомобилем класса - " + startMoving() + ", который можно заправлять " + refuelTheCar();

    }
}
