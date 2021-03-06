package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class VirtualPetShelter {

    Map<String, VirtualPet> petMap = new HashMap<>();

    public Collection<VirtualPet> retrieveAllPets() {
        return petMap.values();
    }


    public void actionPlayWithPet(String petName) {
        petMap.get(petName);
    }


    public void actionWalkADog() {

    }

    public void actionCleanCage(){

    }

    public void addPet(VirtualPet pet) {
        petMap.put(pet.getName(), pet);
    }

    public void adoptPet(String petName) {
        petMap.remove(petName);
    }

    public void tickAll() {
        for (VirtualPet petToTick : petMap.values())
            petToTick.tick();
    }

    public static void petStatus(VirtualPetShelter petShelter) {
        System.out.println("\n" + "This is the current status of our friends:");
        System.out.println("Name|Boredom|Health|Happiness|Hunger|Thirst|Cage|Oil Level");
        System.out.println("-----|------|------|---------|------|------|----|---------");
        for (VirtualPet petToDisplay : petShelter.retrieveAllPets()) {
            System.out.println(petToDisplay.retrieveStatus());
        }
    }
}













