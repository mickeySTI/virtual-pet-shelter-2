package main;

import java.util.Collection;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		
		VirtualPetShelter shelter = new VirtualPetShelter(); 
		Collection<VirtualPet2> petsInShelter = shelter.getAllPets();
		
		
		shelter.addNewPet("fluffy" , "Grumpy Cat");
		
		//testing display
	
		
		
		shelter.petStatusDisplay(petsInShelter);

	}
	
		
}
