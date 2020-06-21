package pets_amok;

public class VirtualPet {

    public String name;
    private String description;
    public int boredom;
    int health;
    int happiness;
    //   int cageCleanliness;
    //   int eliminateWaste;

    public VirtualPet(String name, String desc, int boredom, int health, int happiness) {
        this.name = name;
        this.description = desc;
        this.boredom = boredom;
        this.health = health;
        this.happiness = happiness;
        //     this.eliminateWaste = eliminateWaste;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getHealth() {
        return health;
    }

    public int getHappiness() {
        return happiness;
    }

    public void actionPlayWithPet() {
        boredom -= 5;
        happiness += 5;
    }

    public void tick() {
//        boredom += 2;
//        health += 2;
//        happiness += 2;
    }


    public String retrieveStatus() {
        return name;
    }

}










