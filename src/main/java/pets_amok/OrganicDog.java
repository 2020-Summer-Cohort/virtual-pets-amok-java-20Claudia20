package pets_amok;

public class OrganicDog extends OrganicPets implements Walking{

    public OrganicDog(String name, String desc, int boredom, int health, int happiness, int hunger, int thirst) {
        super(name, desc, boredom, health, happiness, hunger, thirst);
    }

    @Override
    public String retrieveStatus() {
        return name + " " + boredom  + "|" + health  + "|" + happiness  + "|" + hunger  + "|" + thirst + " " + "---" + " " + "---" + " " + "---";
    }

    @Override
    public void feed() {
        hunger -= 5;
        thirst += 2;
    }


    @Override
    public void water() {

    }
}