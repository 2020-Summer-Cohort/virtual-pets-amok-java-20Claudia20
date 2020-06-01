package pets_amok;
/* done- create a model that allows for dogs and cats, either of which may be robotic
 done -introduce an attribute (instance variable) representing overall health that is updated
       as a result of other attributes moving in a negative or positive direction, influencing happiness
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
    //instance variables
    private String name;
    private String description;
    private int boredom;
    private int health;
    private int happiness;

    public VirtualPet(String name, String desc){
        this.name = name;
        this.description = desc;
    }
    public VirtualPet(String name, String desc,  int boredom , int health, int happiness) {
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

    public void actionPlayWithAPet() {
        boredom -= 5;
    }


    public void tick() {
        boredom = boredom +=2;
        happiness = happiness +=2;

    }
}







