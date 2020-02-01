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


		String userOptions = "0";
	
		System.out.println("What would you like to do with the pets?");
		while (userOptions != "7") {
			showOptions();
			userOptions = input.nextLine();
			
			switch (userOptions) {
			case "1":
				System.out.println("You fed all the pets");
				shelter.feedAll(petsInShelter);
				shelter.tickAll(petsInShelter);
				shelter.petStatusDisplay(petsInShelter);
				break;

			case "2":
				System.out.println("You gave all the pets water to drink.");
				shelter.drinkAll(petsInShelter);
				shelter.tickAll(petsInShelter);
				shelter.petStatusDisplay(petsInShelter);
				break;
			case "3": 
				
				System.out.println("Which pet would you like to play with?");
				displayJustThePets(petsInShelter);
				String playPet = input.nextLine();
				shelter.playWithAPet(playPet);
				System.out.println("You played with " + playPet);
				shelter.tickAll(petsInShelter);
				break;
				
			case "4":
				System.out.println("Which pet would you like to adopt");
				displayJustThePets(petsInShelter);
				String adoptee = input.nextLine();
				System.out.println("\n"+adoptee +" has been adopted!");
				shelter.adopt(adoptee);
				shelter.tickAll(petsInShelter);
				break;
			case "5":
					System.out.println("Please give the new pet a name: ");
					String petName = input.nextLine();
					System.out.println("Please give the new pet a description: ");
					String petDescription = input.nextLine();
					shelter.addNewPet(new VirtualPet2(petName,petDescription));
					System.out.println("You took in " + petName +" the " + petDescription.toLowerCase() +"!");
					shelter.tickAll(petsInShelter);
					break;
			case "6":
				shelter.petStatusDisplay(petsInShelter);
				break;
			case "7":
				System.exit(0);
			default:
				System.out.println("\nIncorrect option");
				System.out.println();
				System.out.println("Please choose between 0-5\n");
				System.out.println();
			}
		}
	}

	private static void displayJustThePets(Collection<VirtualPet2> virtualPets) {
		for (VirtualPet2 pet : virtualPets) {
			System.out.println(pet.getName());
		}	
	}

	private static void showOptions() {

		System.out.println("\n");
		System.out.println("1. Feed the pets");
		System.out.println("2. Give the pets water");
		System.out.println("3. Play with a Pet");		
		System.out.println("4. Adopt a pet");
		System.out.println("5. Accept a new pet");
		System.out.println("6. Show pet status");
		System.out.println("7. Quit");

	}

}
