package pets_amok;

public class RoboticDog extends RoboticsPets implements Walking{

    public RoboticDog(String name, String desc, int boredom, int health, int happiness, int oilMaintenance) {
        super(name, desc, boredom, health, happiness, oilMaintenance);
        this.oilMaintenance = oilMaintenance;
    }

    @Override
    public void wakADog() {

    }

//    @Override
//    public String retrieveStatus() {
//        return name + " " + boredom + "  |  " + health + "  |  " +  happiness + "     | " + "---" + "  | " + "---" +
//                "  | " + "---" + "|  " +oilMaintenance;
//    }

}
