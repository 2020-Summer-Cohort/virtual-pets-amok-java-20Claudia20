package pets_amok;

public abstract class VirtualDogs extends VirtualPet {

    public VirtualDogs(String name, String desc) {
        super(name, desc);
    }

    public VirtualDogs(String name, String description, int boredom, int health, int happiness){
        super(name, description, boredom, health, happiness);

    }

    public abstract void walkAllDogs();

}
