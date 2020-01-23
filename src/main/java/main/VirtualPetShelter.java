package main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private  Map<Integer, VirtualPet2> shelter = new HashMap<Integer, VirtualPet2>();

	
	public Collection<VirtualPet2> getAllPets(){
		return shelter.values();
	}
	
	public VirtualPet2 selectPet(int name) {
		return shelter.get(name);
	}
	
	

	public void addNewPet(String namePara, String descriptionPara) {
		Integer petKey = this.shelter.size()+1;
		VirtualPet2 newPet = new VirtualPet2(namePara, descriptionPara);
		this.shelter.put(petKey, newPet);
		
	}
	

	public void adopt(VirtualPet2 adoptedPet) {
		shelter.remove(adoptedPet.getName(), adoptedPet);
	}
	
	
	public void feedAll(Collection<VirtualPet2> virtualPets){
		for(VirtualPet2 pet: virtualPets) {
			pet.feed();
		}
	}
	public void drinkAll(Collection<VirtualPet2> virtualPets){
		for(VirtualPet2 pet: virtualPets) {
			pet.drink();
		}
	}
	// To pick one specific pet
	public void playWithAPet(String name){
			shelter.get(name).play();
		}
	
	public void tickAll(Collection<VirtualPet2> virtualPets){
		for(VirtualPet2 pet: virtualPets) {
			pet.tick();
		}
	}
	
	// Display Screen
	public void petStatusDisplay(Collection<VirtualPet2> virtualPets) {
		System.out.println(
				"Name	|Hunger	|Thirst	|Boredom\r\n" + 
				"--------|-------|-------|-------");
		for(VirtualPet2 pet: virtualPets) {
			System.out.println(pet.getName() + "\t|" + pet.getHunger() + "\t|" + pet.getThirst() + "\t|" + pet.getBoredom());
		}
		
	}
		
		


}	
	
