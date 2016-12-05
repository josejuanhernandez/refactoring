package insurance;

public class Motorist {
    private final int age;
    private final int pointsOnLicense;

    public Motorist(int age, int pointsOnLicense) {
        this.age = age;
        this.pointsOnLicense = pointsOnLicense;
    }

    public int getAge() {
        return age;
    }

    public int getPointsOnLicense() {
        return pointsOnLicense;
    }
}
