package pets_amok;

public class OrganicDog extends VirtualDogs implements OrganicPets {


    public OrganicDog(String name, String desc) {
        super(name, desc);
    }

    public OrganicDog(String name, String desc, int boredom, int health, int happiness) {
        super(name, desc, boredom, health, happiness);
    }

    @Override
    public void walkAllDogs() {

    }

    @Override
    public void getHunger() {

    }

    @Override
    public void getThirst() {

    }
}
