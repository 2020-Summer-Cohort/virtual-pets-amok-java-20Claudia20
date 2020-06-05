package pets_amok;

public abstract class OrganicPets extends VirtualPet implements HungerThirst {

    int hunger;
    int thirst;

    public OrganicPets(String name, String description) {
        super(name, description);
    }

    public OrganicPets(String name, String desc, int boredom, int health, int happiness, int hunger, int thirst) {
        super(name, desc, boredom, health, happiness);
        this.hunger = hunger;
        this.thirst = thirst;
    }

}
