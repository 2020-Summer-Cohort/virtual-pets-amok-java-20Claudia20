package pets_amok;

public abstract class RoboticsPets extends VirtualPet {

    int oilMaintenance;

    public RoboticsPets(String name, String desc, int boredom, int health, int happiness, int oilMaintenance) {
        super(name, desc, boredom, health, happiness);
        this.oilMaintenance = oilMaintenance;
    }

    public int getOilMaintenance() {
        return oilMaintenance;
    }

    public void oilMaintenance(){

}
    public static void oilRoboticPets(VirtualPetShelter shelterPets) {
        for (VirtualPet virtualPet : shelterPets.petMap.values()){
            if ( virtualPet instanceof RoboticsPets) {
                ((RoboticsPets) virtualPet).oilMaintenance();
            }
        }
    }

//    public void actionOilMaintenance() {
//        oilMaintenance += 5;
//        health += 5;
//    }

}









