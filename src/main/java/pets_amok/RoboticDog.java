package pets_amok;

public abstract class RoboticDog extends VirtualPet implements RoboticPets {
    public RoboticDog(String name, String desc) {
        super(name, desc);
    }

    public RoboticDog(String name, String desc, int boredom, int health, int happiness) {
        super(name, desc, boredom, health, happiness);
    }



}
