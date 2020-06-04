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

    String name;
    String description;
    int boredom;
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

   public void feed(){

    }

    public void water(){

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
        boredom += 2;
        health += 2;
        happiness += 2;


    }

}







