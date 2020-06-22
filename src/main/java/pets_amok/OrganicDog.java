package pets_amok;

public class OrganicDog extends OrganicPets implements Walking {

    int cageCleanliness;

    public OrganicDog(String name, String desc, int boredom, int health, int happiness, int hunger, int thirst, int cageCleanliness) {
        super(name, desc, boredom, health, happiness, hunger, thirst);
        this.cageCleanliness = cageCleanliness;
    }

    public int getCageCleanliness() {
        return cageCleanliness;
    }

    public OrganicDog(String name, String desc, int boredom, int health, int happiness, int hunger, int thirst) {
        super(name, desc, boredom, health, happiness, hunger, thirst);
    }


    public void actionCleanCage() {
        cageCleanliness += 5;
    }

    @Override
    public String retrieveStatus() {
        return name + " " + boredom + "   |  " + health + "  |  " + happiness + "     |  " + hunger + "  |  "
                + thirst + "  | " + cageCleanliness + " | " + "---";
    }

    @Override
    public void wakADog() {

    }
}

