package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*In addition to the last project's requirements:

introduce methods that allow for:

 oiling/maintaining all robotic pets
 cleaning dog cages
 modify existing methods to only feed/water pets that are not robot
*/

public class VirtualPetShelter {

    Map<String, VirtualPet> petMap = new HashMap<>();

    public Collection<VirtualPet> retrieveAllPets() {
        return petMap.values();
    }
    public void addPet(VirtualPet pet) {
        petMap.put(pet.getName(), pet);
    }
    public void adoptPet(String petName) {
        petMap.remove(petName);
    }


    public void actionPlayWithPet(String petName) {
        petMap.get(petName);
    }

    public void actionWalkADog() {

    }

    public void tickAll() {
        for (VirtualPet petToTick : petMap.values())
            petToTick.tick();
    }

    public void actionFeedAllPets() {
    }

    public void actionGiveWaterToPets() {

    }


}











