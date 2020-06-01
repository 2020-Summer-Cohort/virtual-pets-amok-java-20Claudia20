package pets_amok;
/*  create a model that allows for dogs and cats, either of which may be robotic
 -introduce an attribute (instance variable) representing overall health that is updated
  as a result of other attributes moving in a negative or positive direction, influencing happiness
     introduce methods that allow for:
         oiling robotic pets
          walking dogs, decreasing the likelihood that organic dogs will soil their cages, while increasing happiness in all dogs
do not allow:
   feeding/watering robotic pets
   oiling organic pets
   modify the tick method to return a value indicating the amount of waste a pet creates, which should contribute to either
(optionally, create accessor methods to retrieve these values instead):amount of waste in an individual dog cage
*/


public class VirtualPet {
    //instance variables
    private String name;
    private String description;
    private int hunger;
    private int thirst;
    private int boredom;
    private int health;

    public VirtualPet(String name, String desc){
        this.name = name;
        this.description = desc;
    }
    public VirtualPet(String name, String desc, int hunger, int thirst,  int boredom , int health) {
        this.name = name;
        this.description = desc;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.health = health;
    }

    //create getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHunger(){
        return hunger;
    }

    public int getThirst(){
        return thirst;

    }
    public int getBoredom() {
        return boredom;
    }


    public int getHealth() {
        return health;
    }

    public void actionFeedAnimals() { hunger -= 5; }
    public void actionGiveWaterToAnimals() {
        thirst -= 5;
    }
    public void actionPlayWithAPet() {
        boredom -= 5;
    }


    public void tick() {
        hunger = hunger +=2;
        thirst = thirst +=2;
        boredom = boredom +=2;
    }
}







