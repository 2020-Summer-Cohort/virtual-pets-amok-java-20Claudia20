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

    public void addPet(VirtualPet pet) {
      petMap.put(pet.getName(), pet);
    }

    public void adoptPet(String petName) {
        petMap.remove(petName);
    }

    protected static void WaterOrganicPets(VirtualPetShelter shelterPets) {
        for (VirtualPet virtualPet : shelterPets.petMap.values()) {
            if (virtualPet instanceof OrganicPets) {
                ((OrganicPets) virtualPet).feed();
            }
        }
    }

    protected static void oilRoboticPets(VirtualPetShelter shelterPets) {
        for (VirtualPet virtualPet : shelterPets.petMap.values()){
            if ( virtualPet instanceof RoboticsPets) {
                ((RoboticsPets) virtualPet).oilMaintenance();
            }
        }
    }
    public void tickAll() {
        for (VirtualPet petToTick : petMap.values())
            petToTick.tick();
    }

}











