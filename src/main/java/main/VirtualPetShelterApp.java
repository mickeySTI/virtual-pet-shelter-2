package main;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		
		VirtualPetShelter shelter = new VirtualPetShelter();
		Collection<VirtualPet2> petsInShelter = shelter.getAllPets();
		
		
		
		VirtualPet2 Fluffy = new VirtualPet2("Fluffy", "Grumpy");
		
		VirtualPet2 FeFe = new VirtualPet2("FeFe", "Playful");
		
		VirtualPet2 Mechew = new VirtualPet2("Mechew", "Lazy");
		
		 
		shelter.addNewPet(Fluffy);
		shelter.addNewPet(FeFe);
		shelter.addNewPet(Mechew);
		
		

		Scanner input = new Scanner(System.in);


		int userOptions = 0;
	
		
		showOptions();

		while (userOptions != 7) {
			
			System.out.println("What would you like to do with the pets?\n");
			userOptions = input.nextInt();

			switch (userOptions) {
			case 1:
				System.out.println("You fed all the pets");
				shelter.feedAll(petsInShelter);
				shelter.tickAll(petsInShelter);
				shelter.petStatusDisplay(petsInShelter);
				break;

			case 2:
				System.out.println("You gave all the pets water to drink.");
				shelter.drinkAll(petsInShelter);
				shelter.tickAll(petsInShelter);
				shelter.petStatusDisplay(petsInShelter);
				break;
			case 3: 
				
				System.out.println("Which pet would you like to play with?");
				String playPet = input.nextLine();
				displayJustThePets(petsInShelter);
				shelter.playWithAPet(playPet);
				System.out.println("You played with " + playPet);
				shelter.tickAll(petsInShelter);
				break;
				
			case 4:
				System.out.println("Which pet would you like to adopt");
				displayJustThePets(petsInShelter);
				String adoptedPet = input.nextLine();
				VirtualPet2 adoptee =  shelter.selectPet(adoptedPet);
				shelter.adopt(adoptee);
				break;
			case 5:
					System.out.println("Please give the new pet a name: ");
					String petName = input.nextLine();
			case 6:
				showOptions();
				shelter.petStatusDisplay(petsInShelter);
				shelter.tickAll(petsInShelter);
				break;
			case 7:
				System.exit(0);
			default:
				System.out.println("Incorrect option");
				System.out.println();
				System.out.println("Please choose between 0-5\n");
				System.out.println();
				showOptions();
			}
		}
	}

	private static void displayJustThePets(Collection<VirtualPet2> virtualPets) {
		for (VirtualPet2 pet : virtualPets) {
			System.out.println(pet.getName());
		}	
	}

	private static void showOptions() {

		System.out.println("What would you like to do with the pets?");
		System.out.println("1. Feed the pets");
		System.out.println("2. Give the pets water");
		System.out.println("3. Play with a Pet");		
		System.out.println("4. Adopt a pet");
		System.out.println("4. Accept a new pet");
		System.out.println("6. Display options");
		System.out.println("7. Quit");

	}

}
