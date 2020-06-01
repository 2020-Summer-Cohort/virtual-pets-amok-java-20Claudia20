package pets_amok;
/*
     -introduce methods that allow for:
         oiling robotic pets
          walking dogs, decreasing the likelihood that organic dogs will soil their cages, while increasing happiness in all dogs
do not allow:
   feeding/watering robotic pets
   oiling organic pets
   modify the tick method to return a value indicating the amount of waste a pet creates, which should contribute to either
(optionally, create accessor methods to retrieve these values instead):amount of waste in an individual dog cage
*/


public class VirtualPet {
    public static void main(String[] args) {

    }
    //instance variables
    public String name;
    public String description;
    public int boredom;
    public int health;
    public int happiness;

    public VirtualPet(String name, String desc) {
        this.name = name;
        this.description = desc;
    }

    public VirtualPet(String name, String desc, int boredom, int health, int happiness) {
        this.name = name;
        this.description = desc;
        this.boredom = boredom;
        this.health = health;
        this.happiness = happiness;
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

   public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void actionPlayWithAPet() {
        boredom -= 5;
        happiness +=5;
    }


    public void tick() {
        boredom += 2;
        health =+2;
        happiness += 2;

    }


}







