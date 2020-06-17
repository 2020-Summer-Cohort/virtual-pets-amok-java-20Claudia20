package pets_amok;

public class RoboticCat extends RoboticsPets implements Oiling{

    public RoboticCat(String name, String desc, int boredom, int health, int happiness, int oilMaintenance) {
        super(name, desc, boredom, health, happiness, oilMaintenance);
    }

    @Override
    public String retrieveStatus() {
        return name + " " + boredom + " " + health + " " + happiness + " " + "---" + " " + "---" + " " + "---" + " " + oilMaintenance;
    }


    @Override
    public void oilMaintenance() {

    }
}