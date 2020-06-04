package pets_amok;

public abstract class RoboticDog extends RoboticsPets {

    public RoboticDog(String name, String desc, int boredom, int health, int happiness, int oilMaintenance) {
        super(name, desc, boredom, health, happiness, oilMaintenance);
        this.oilMaintenance = oilMaintenance;
    }

}
