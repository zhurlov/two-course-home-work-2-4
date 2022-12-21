public abstract class Driver {

    private String fullName;
    private boolean possessionOfDriversLicense;
    private String experience;

    public Driver(String fullName, boolean possessionOfDriversLicense, String experience) {
        this.fullName = Validate.validateString(fullName, "ошибка");
        this.possessionOfDriversLicense = Validate.validateBoolean(possessionOfDriversLicense, true);
        this.experience = Validate.validateString(experience, "ошибка");
    }

    public String getTygachIvanPetrovich() {
        return fullName;
    }

    public boolean isPossessionOfDriversLicense() {
        return possessionOfDriversLicense;
    }

    public String getExperience() {
        return experience;
    }

    public abstract String startMoving();

    public abstract String stop();

    public abstract String refuelTheCar();

}
