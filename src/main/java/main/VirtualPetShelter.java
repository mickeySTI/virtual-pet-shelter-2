package main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private  Map<Integer, VirtualPet2> shelter = new HashMap<Integer, VirtualPet2>();

	
	public Collection<VirtualPet2> getAllPets(){
		return shelter.values();
	}
	
	public VirtualPet2 selectPet(String name) {
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
	

}	
	
