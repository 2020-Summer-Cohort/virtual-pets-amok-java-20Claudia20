package pets_amok;

public abstract class OrganicPets extends VirtualPet {
    int hunger;
    int thirst;

    public OrganicPets(String name, String desc, int boredom, int health, int happiness, int hunger, int thirst) {
        super(name, desc, boredom, health, happiness);
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public void feed(){
        hunger -= 5;
        thirst += 2;
    }
    public void water(){
        thirst -=5;
        happiness +=3;
    }

    protected static void WaterOrganicPets(VirtualPetShelter shelterPets) {
        for (VirtualPet virtualPet : shelterPets.petMap.values()) {
            if (virtualPet instanceof OrganicPets) {
                ((OrganicPets) virtualPet).water();
            }
        }
    }

    protected static void FeedOrganicPets(VirtualPetShelter shelterPets) {
        for (VirtualPet virtualPet : shelterPets.petMap.values()) {
            if (virtualPet instanceof OrganicPets) {
                ((OrganicPets) virtualPet).feed();
            }
        }
    }
}

//  public void actionCleanCage() {
//    cageClean = 20;
//}
//    public int getCageCleanliness() {
//  return cageCleanliness;
//}