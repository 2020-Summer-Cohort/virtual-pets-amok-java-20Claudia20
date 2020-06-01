package pets_amok;

public abstract class RoboticCat extends VirtualPet implements RoboticPets {

    public RoboticCat(String name, String desc) {
        super(name, desc);
    }

    public RoboticCat(String name, String desc, int boredom, int health, int happiness) {
        super(name, desc, boredom, health, happiness);
    }
}
