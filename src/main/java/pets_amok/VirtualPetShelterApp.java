package pets_amok;

import java.util.Scanner;

import static pets_amok.VirtualPetShelter.WaterOrganicPets;
import static pets_amok.VirtualPetShelter.oilRoboticPets;

public class VirtualPetShelterApp {

    public static void main(String[] args) {


        OrganicDog pet1 = new OrganicDog("Tommie", " the a curious Siberian Husky.", 30, 30, 30, 30, 30);
        OrganicCat pet2 = new OrganicCat("Angelica", " the ferocious Australian Terrier.", 30, 30, 30, 30, 30);
        RoboticDog pet3 = new RoboticDog("Chuckie", " the messy St.Bernard.", 30, 30, 30, 30);
        RoboticCat pet4 = new RoboticCat("Lillian", " the energetic Siberian Husky.", 30, 30, 30, 30);

        VirtualPetShelter shelterPets = new VirtualPetShelter();
        shelterPets.addPet(pet1);
        shelterPets.addPet(pet2);
        shelterPets.addPet(pet3);
        shelterPets.addPet(pet4);


        System.out.println("Welcome to  The Pawtner For Life Pet Shelter!");
        System.out.println("Let's meet the pets you will be working with." + "\n");

        System.out.println(pet1.getName() + pet1.getDescription() + "\n");
        System.out.println(pet2.getName() + pet2.getDescription() + "\n");
        System.out.println(pet3.getName() + pet3.getDescription() + "\n");
        System.out.println(pet4.getName() + pet4.getDescription() + "\n");

        while (true) {

            petStatus(shelterPets);

            System.out.println("\n" + "What would you like to do?");
            System.out.println("1. Feed all organic pets");
            System.out.println("2. Give water to all organic pets");
            System.out.println("3. Play with a pet");
            System.out.println("4. Take a dog for a walk");
            System.out.println("5. Clean the organic dog's cage");
            System.out.println("6. Oil all robotic pets");
            System.out.println("7. Adopt a companion");
            System.out.println("8. Admit a pet");
            System.out.println("9. Quit");

            Scanner scanner = new Scanner(System.in);
            int userResponse = scanner.nextInt();
            scanner.nextLine();

            if (userResponse == 1) {
                System.out.println("The organic pets are happily eating their favorite ice cream treats.");
                FeedOrganicPets(shelterPets);
            } else if (userResponse == 2) {
                System.out.println("Organic pets are feeling refreshed from drinking the fresh iced water.");
                WaterOrganicPets(shelterPets);
            } else if (userResponse == 3) {
                System.out.println("Type the name of the pet you would like to play with?");
                String userPlayOption = scanner.nextLine();
                System.out.println(" You get to play with " + userPlayOption + " and their favorite toy.");
                shelterPets.actionPlayWithPet(userPlayOption);
            } else if (userResponse == 4) {
                System.out.println("What dog would you like to take for a walk,Tommy or Chuckie?");
                String userWalkOption = scanner.nextLine();
                System.out.println("You can take " + userWalkOption + " for a walk.");
                shelterPets.actionWalkADog();
            } else if (userResponse == 5) {
                System.out.println(" Thank you for volunteering to clean up the dogs cages.");
            } else if (userResponse == 6) {
                System.out.println(" Thank you for oiling the robotic pets, they look happy and healthy.");
                oilRoboticPets(shelterPets);
            } else if (userResponse == 7) {
                System.out.println("You have selected to adopt a lifelong companion." + "\n" +
                        "What friend would you like to take home?");
                String userInput = scanner.nextLine();
                shelterPets.adoptPet(userInput);
                System.out.println("\n" + "Congrats! You adopted " + userInput + " as your new pet.");
            } else if (userResponse == 8) {
                System.out.println("Ah, it looks like you are bringing in a new pet. What's the name of our new friend?");
                String userInput = scanner.nextLine();
                System.out.println("Is our new friend a cat or dog?");
                String userDescription= scanner.nextLine();
               VirtualPet newPet = new VirtualPet(userInput,userDescription,30, 30,30);
               shelterPets.addPet(newPet);
                System.out.println("Thank you " + userInput + " is now part of our shelter!");

                /* else if (userResponse == 5) {
                System.out.println("You have selected to bring in a dog. What's the name of our new furry friend?");
                String userInput = scanner.nextLine();          // java is waiting for user input
                System.out.println("How would you describe the dog? (ex.breed and attributes)");
                String userDescription = scanner.nextLine();
                VirtualPet newPet = new VirtualPet(userInput, userDescription);
                shelterPets.addPet(newPet);
                System.out.println("Thank you " + userInput + " is now part of our shelter!"); */
            } else if (userResponse == 9) {
                System.out.println("Thank you for visiting The Pawtna For Life Shelter, have a good day.");
                break;
            } else {
                continue;
            }

            shelterPets.tickAll();

        }
    }

//    private static void oilRoboticPets(VirtualPetShelter shelterPets) {
//        for (VirtualPet virtualPet : shelterPets.petMap.values()){
//            if ( virtualPet instanceof RoboticsPets) {
//                ((RoboticsPets) virtualPet).oilMaintenance();
//            }
//        }
//    }

//    private static void WaterOrganicPets(VirtualPetShelter shelterPets) {
//        for (VirtualPet virtualPet : shelterPets.petMap.values()) {
//            if (virtualPet instanceof OrganicPets) {
//                ((OrganicPets) virtualPet).feed();
//            }
//        }
//    }

    private static void FeedOrganicPets(VirtualPetShelter shelterPets) {
        for (VirtualPet virtualPet : shelterPets.petMap.values()) {
            if (virtualPet instanceof OrganicPets) {
                ((OrganicPets) virtualPet).feed();
            }

        }
    }

    public static void petStatus(VirtualPetShelter petShelter) {
        System.out.println("This is the current status of our friends:");
        System.out.println(" Name|Boredom|Health|Happiness|Hunger|Thirst|Cage|Oil Level");
        System.out.println("-----|-------|------|---------|------|------|----|---------");
        for (VirtualPet petToDisplay : petShelter.retrieveAllPets()) {
            System.out.println(petToDisplay.retrieveStatus());
        }
    }
}






