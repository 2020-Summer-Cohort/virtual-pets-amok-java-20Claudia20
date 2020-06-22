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

//    @Override
//    public void tick() {
//        super.tick();
//        thirst += 2;
//        hunger +=2;
//    }

    public static void WaterOrganicPets(VirtualPetShelter shelterPets) {
        for (VirtualPet virtualPet : shelterPets.petMap.values()) {
            if (virtualPet instanceof OrganicPets) {
                ((OrganicPets) virtualPet).water();
            }
        }
    }

    public static void FeedOrganicPets(VirtualPetShelter shelterPets) {
        for (VirtualPet virtualPet : shelterPets.petMap.values()) {
            if (virtualPet instanceof OrganicPets) {
                ((OrganicPets) virtualPet).feed();
            }
        }
    }


}
