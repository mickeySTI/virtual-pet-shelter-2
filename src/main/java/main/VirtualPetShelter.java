package main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	// updated map
	private Map<String, VirtualPet2> shelter = new HashMap<String, VirtualPet2>();

	public Collection<VirtualPet2> getAllPets() {
		return shelter.values();
	}

	public VirtualPet2 selectPet(String name) {
		return shelter.get(name);
	}

	public void addNewPet(VirtualPet2 pet) {
		shelter.put(pet.getName(), pet);
	}

	public void adopt(VirtualPet2 adoptedPet) {
		shelter.remove(adoptedPet, adoptedPet);
	}

	public void feedAll(Collection<VirtualPet2> virtualPets) {
		for (VirtualPet2 pet : virtualPets) {
			pet.feed();
		}
	}

	public void drinkAll(Collection<VirtualPet2> virtualPets) {
		for (VirtualPet2 pet : virtualPets) {
			pet.drink();
		}
	}

	// To pick one specific pet
	public void playWithAPet(String name) {
		selectPet(name).play();
	}

	public void tickAll(Collection<VirtualPet2> virtualPets) {
		for (VirtualPet2 pet : virtualPets) {
			pet.tick();
		}
	}

	// Display Screen
	public void petStatusDisplay(Collection<VirtualPet2> virtualPets) {
		System.out.println("Name	|Hunger	|Thirst	|Boredom\r\n" + "--------|-------|-------|-------");
		for (VirtualPet2 pet : virtualPets) {
			System.out.println(
					pet.getName() + "\t|" + pet.getHunger() + "\t|" + pet.getThirst() + "\t|" + pet.getBoredom());
		}
	}

	

}
