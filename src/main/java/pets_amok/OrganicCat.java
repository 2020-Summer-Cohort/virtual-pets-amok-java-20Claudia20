package pets_amok;

public  class OrganicCat extends OrganicPets {

    public OrganicCat(String name, String desc, int boredom, int health, int happiness, int hunger, int thirst) {
        super(name, desc, boredom, health, happiness, hunger, thirst);
    }

    @Override
    public String retrieveStatus() {
        return name + " " + boredom + " " + health + " " + happiness + " " + hunger +" " + thirst + " " + "---" + " " + "---" + " " + "---";

    }

    @Override
    public void feed() {

    }

    @Override
    public void water() {

    }
}