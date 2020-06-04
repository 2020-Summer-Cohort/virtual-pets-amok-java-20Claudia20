package pets_amok;

public class OrganicPets extends VirtualPet {

    int hunger;
    int thirst;

    public OrganicPets(String name, String desc, int boredom, int health, int happiness, int hunger, int thirst) {
        super(name, desc, boredom, health, happiness);
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    @Override
    public void feed() {

    }

    @Override
    public  void water(){

    }

    public static void actionFeedOrganicPets() {
        for (VirtualPet petToFeed : petMap.values()) {
            if (petToFeed instanceof OrganicPets) {
                petToFeed.feed();
            }
        }
    }

    public static void actionWaterOrganicPets() {
        for (VirtualPet petToWater : petMap.values()) {
            if (petToWater instanceof OrganicPets) {
                petToWater.water();
            }
        }
    }
}

       /* public void actionFeedOrganicPets() {
            hunger -= 5;
        }
        public void actionWaterOrganicPets () {
            thirst -= 5;
        }
        */

