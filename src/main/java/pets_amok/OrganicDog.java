package pets_amok;

public abstract class OrganicDog extends OrganicPets {

    public OrganicDog(String name, String description, int boredom, int health, int happiness, int hunger, int thirst){
        super(name, description, boredom, health, happiness, hunger, thirst);
    }

    public abstract void actionWalkAllDogs();

}

