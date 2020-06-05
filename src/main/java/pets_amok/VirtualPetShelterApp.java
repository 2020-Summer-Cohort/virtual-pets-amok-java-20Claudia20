package pets_amok;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {


        OrganicDog pet1 = new OrganicDog("Tommie", " the a curious Siberian Husky.", 30, 30, 30, 30,30);
        OrganicCat pet2 = new OrganicCat("Bono", " the ferocious Australian Terrier", 30, 30, 30, 30, 30);
        RoboticDog pet3 = new RoboticDog("Morty", " the messy St.Bernard", 30, 30, 30, 30);
        RoboticCat pet4 = new RoboticCat("Leia", " the energetic Siberian Husky", 30, 30, 30,30);

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

        petStatus( shelterPets);

        while (true) {


            System.out.println("\n" + "What would you like to do?");
            System.out.println("1. Feed all the organic pets");
            System.out.println("2. Give water to organic pets");
            System.out.println("3. Play with a pet");
            System.out.println("4. Take a pet for a walk");
            System.out.println("5. Clean dog cage");
            System.out.println("6. Oil robotic pets");
            System.out.println("7. Adopt a companion");
            System.out.println("8. Admit a pet");
            System.out.println("9. Quit");

            Scanner scanner = new Scanner(System.in);
            int userResponse = scanner.nextInt();
            scanner.nextLine();

            if (userResponse == 1) {
                System.out.println("All the pets received their favorite ice cream treats.");
                OrganicPets.actionFeedOrganicPets();
            } else if (userResponse == 2) {
                System.out.println("You have given the pets some fresh iced water.");
                OrganicPets.actionWaterOrganicPets();
            } else if (userResponse == 3) {
                System.out.println("Type the name of the dog you would like to play with?");
                String userPlayOption = scanner.nextLine();
                System.out.println(" You get to play with " + userPlayOption + " and their favorite toy.");
                shelterPets.actionPlayWithPet(userPlayOption);
            } else if (userResponse == 4) {
                System.out.println("Who do you want to take for a walk,Tommy or Chuckie?");
                String userWalkOption = scanner.nextLine();
                System.out.println("You can take " + userWalkOption + " for a walk.");
                shelterPets.actionWalkADog();
            } else if (userResponse == 5) {
                System.out.println(" Thank you for volunteering to clean up the dogs cages.");


            } else if (userResponse == 6) {
                System.out.println(" It looks like you want to oil up the robotic pets. Let's get started.");


            } else if (userResponse == 7) {
                System.out.println("You have selected to adopt a lifelong companion." + "\n" +
                        "What furry friend would you like to take home?");
                String userInput = scanner.nextLine();
                shelterPets.adoptPet(userInput);
                System.out.println("\n" + "Congrats! You adopted " + userInput + " as your new pet.");
            } else if (userResponse == 8) {
                System.out.println("Ah, it looks like you are bringing in a new dog. What's the name and breed of our new furry friend?");
                String userInput = scanner.nextLine();
             //   VirtualPet newPet = new VirtualPet(userInput);
             //  shelterPets.addPet(newPet);
                System.out.println("Thank you " + userInput + " is now part of our shelter!");
            } else if (userResponse == 9) {
                System.out.println("Thank you for visiting The Pawtna For Life Shelter, have a good day.");
                break;
            } else {
                continue;
            }

            shelterPets.tickAll();
            petStatus( shelterPets);
        }
    }

    public static void petStatus(VirtualPetShelter petShelter) {
        System.out.println("This is the current status of our friends:");
        System.out.println(" Name| Boredom|Health|Happiness|Hunger |Thirst|Cage|Oil Level");
        System.out.println("-----|--------|------|---------|-------|------|----|---------");
        for (VirtualPet petToDisplay : petShelter.retrieveAllPets()) {
            System.out.println(petToDisplay.retrieveStatus());
        }
    }
}


