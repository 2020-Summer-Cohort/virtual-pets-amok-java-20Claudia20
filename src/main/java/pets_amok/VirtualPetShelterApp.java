package pets_amok;

import java.util.Scanner;

/*In addition to the last project's requirements:
add options to:
 walk all dogs
 clean dog cages
 oil all robotic pets

 */

public class VirtualPetShelterApp {

    public static void main(String[] args) {

        VirtualPet organicDog1 = new VirtualPet(" Tommy", " is a curious Siberian Husky.", 30, 30, 30);
        VirtualPet organicCat1 = new VirtualPet("Lillian", " is a fluffy Persian Cat.", 30, 30, 30);
        VirtualPet roboticDog1 = new VirtualPet(" Chuckie", " is a playful Chihuahua.", 30, 30, 30);
        VirtualPet roboticCat1 = new VirtualPet("Angelica", " is a mischievous Bengal Cat", 30, 30, 30);

        VirtualPetShelter shelterPets = new VirtualPetShelter();
        shelterPets.addPet(organicDog1);
        shelterPets.addPet(organicCat1);
        shelterPets.addPet(roboticDog1);
        shelterPets.addPet(roboticCat1);

        System.out.println("Welcome to the Pawtna's for Life Virtual Pet Shelter!");
        System.out.println("Let's meet the pets you will be working with. Notice we have both Organic and Robotic Pets." + "\n");
        int petCount = 1;
        for (VirtualPet petToDisplay : shelterPets.retrieveAllPets()) {
            System.out.println(petCount + ". " + petToDisplay.getName()  + petToDisplay.getDescription());
            petCount++;
        }

        while (true) {

            System.out.println("\n" + "Check out the status of our friends:");
            System.out.println("\n" + " Name: Hunger| Thirst| Boredom| Health|Happiness");
            System.out.println("--------------------------------------");
            for (VirtualPet petToDisplay : shelterPets.retrieveAllPets()) {
                System.out.println(petToDisplay.getName() + ": " + petToDisplay.getHunger() + petToDisplay.getThirst() + petToDisplay.getBoredom() + " | " + petToDisplay.getHealth()
                        + " | " + petToDisplay.getHappiness());
            }
            System.out.println("\n" + "What would you like to do?");
            System.out.println("1. Feed pets");
            System.out.println("2. Give water to pets");
            System.out.println("3. Play with any pet");
            System.out.println("4. Walk all the pets");
            System.out.println("5. Clean pet cages");
            System.out.println("6. Oil robot pets");
            System.out.println("7. Adopt a companion");
            System.out.println("8. Admit a new pet");
            System.out.println("9. Quit");

            Scanner scanner = new Scanner(System.in);
            int userResponse = scanner.nextInt();
            scanner.nextLine();

            if (userResponse == 1) {
                System.out.println("You selected to feed the organic pets their favorite treats.");
                shelterPets.actionFeedAllPets();
            } else if (userResponse == 2) {
                System.out.println("You selected to give all the dogs some fresh iced water.");
                shelterPets.actionGiveWaterToPets();
            } else if (userResponse == 3) {
                System.out.println("Type the name of the dog you would like to play with?");
                System.out.println(organicDog1.getName() + "," + organicCat1.getName() + "," + roboticDog1.getName() + "," + roboticCat1.getName() + ":");
                String userPlayOption = scanner.nextLine();
                System.out.println("You can take " + userPlayOption + " to the park.");
                shelterPets.actionPlayWithPet(userPlayOption);
            } else if (userResponse == 4) {
                System.out.println("You have selected to adopt a lifelong companion." + "\n" +
                        "What furry friend would you like to take home?");
                String userInput = scanner.nextLine();
                shelterPets.adoptPet(userInput);
                System.out.println("\n" + "Congrats! You adopted " + userInput + " as your new pet.");
            } else if (userResponse == 5) {
                System.out.println("You have selected to bring in a dog. What's the name of our new furry friend?");
                String userInput = scanner.nextLine();          // java is waiting for user input
                System.out.println("How would you describe the dog? (ex.breed and attributes)");
                String userDescription = scanner.nextLine();
                VirtualPet newPet = new VirtualPet(userInput, userDescription);
                shelterPets.addPet(newPet);
                System.out.println("Thank you " + userInput + " is now part of our shelter!");
            } else if (userResponse == 6) {
                System.out.println("Thank you for visiting The Furry Friends Shelter, have a good day.");
                break;
            } else {
                continue;
            }
            shelterPets.tickAll();
        }
    }
}


