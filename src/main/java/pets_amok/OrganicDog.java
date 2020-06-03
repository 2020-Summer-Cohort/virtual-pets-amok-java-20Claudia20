package pets_amok;

public abstract class OrganicDog extends VirtualDogs implements OrganicPets {

    public OrganicDog(String name, String desc) {
        super(name, desc);
    }

    //declare variables
    public int hunger;
    public int thirst;
    public int boredom;
    public int cageClean;
    public int eliminateWaste;

    //create new constructors
    public OrganicDog(String name, String desc, int boredom, int health, int happiness, int hunger, int thirst, int cageClean, int eliminateWaste) {
        super(name, desc, boredom, health, happiness);
        this.hunger = hunger;
        this.thirst = thirst;
        this.cageClean = cageClean;
        this.eliminateWaste = eliminateWaste;
    }


    public void actionCleanCage() {
        cageClean = 20;
    }


    @Override
    public void actionWalkAllDogs() {


    }

}
