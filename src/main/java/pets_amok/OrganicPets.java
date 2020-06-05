package pets_amok;

public abstract class OrganicPets extends VirtualPet {

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


    public static void actionFeedOrganicPets() {
    }

    public static void actionWaterOrganicPets() {
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }



 /*   public static void actionFeedOrganicPets() {
        for (VirtualPet petToFeed : OrganicPets) {
            if (petToFeed instanceof OrganicPets) {
                petToFeed.feed();
            }
        }
    }

    public static void actionWaterOrganicPets() {
        for (VirtualPet petToWater : OrganicPets.values()) {
            if (petToWater instanceof OrganicPets) {
                petToWater.water();
            }
        }*/
}



