package main;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		VirtualPetShelter shelter = new VirtualPetShelter();
		Collection<VirtualPet2> petsInShelter = shelter.getAllPets();

		Scanner input = new Scanner(System.in);

		shelter.addNewPet("fluffy", "Grumpy Cat");
		shelter.addNewPet("Mechew", "Nice Cat");
		shelter.addNewPet("Ashe", "Playful Cat");
		
	
		
		

		int userOptions = 0;
		String userChoice = "";

		while (userOptions != 5) {
			System.out.println("What would you like to do with your pet?\n");
			userOptions = input.nextInt();

			switch (userOptions) {
			case 1:
				System.out.println("You fed all the pets");
				shelter.feedAll(petsInShelter);
				break;

			case 2:
				System.out.println("You gave all the pets water to drink.");
				shelter.drinkAll(petsInShelter);
				break;
			case 3: 
				
				System.out.println("Which pet would you like to play with");
				userChoice = input.nextLine();
				VirtualPet2 choosenPet = shelter.selectPet(userChoice);
				
				shelter.playWithAPet(userChoice);
					if(petsInShelter.contains(userChoice)) {
						System.out.println("You just played with " + userChoice);
					}
				
				break;
			case 4:
				showOptions();
				shelter.petStatusDisplay(petsInShelter);
				break;
			default:
				System.out.println("Incorrect option");
				System.out.println();
				System.out.println("Please choose between 0-5\n");
				System.out.println();
				showOptions();
			}
		}
	}

	private static void showOptions() {

		System.out.println("What would you like to do with the pets?");
		System.out.println("1. Feed the pets");
		System.out.println("2. Give the pets water");
		System.out.println("3. Play with a Pet");
		System.out.println("4. Display options");
		System.out.println("5. Quit");

	}

}
