package main;

public class VirtualPet2 {

	private int hunger = (int) (Math.random() * 51) + 0;;
	private int thirst = (int) (Math.random() * 51) + 0;;
	private int boredom = (int) (Math.random() * 51) + 0;;
	private String name = "";
	private String description = "";

	public VirtualPet2() {
	
	}
	
	public VirtualPet2(String name, String description) {
	this.name = name;
	this.description = description;
		
	}
		

	public VirtualPet2(int hunger, int thirst, int boredom) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
	}
	
	public VirtualPet2(String name, String description, int hunger, int thirst, int boredom) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.name = name;
		this.description = description;
	}
			
	public int getHunger() {
		return this.hunger;
	}

	public int getThirst() {
		return this.thirst;
	}

	public int getBoredom() {
		return this.boredom;
	}

	public void feed() {
		this.hunger--;
		
		if(this.hunger < 0) {
			this.hunger = 0;
		}	
		
	}

	public void drink() {
		this.thirst--;
		
		if(this.thirst <0) {
			this.thirst = 0;
		}
	}

	public void play() {
		this.boredom--;
		if(this.boredom < 0) {
			this.boredom = 0;
		}
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
		
	}

	public void setThirst(int thirst) {
		this.thirst = thirst;
		
		
	}

	public void setBoredom(int boredom) {
		this.boredom = boredom;
		
	}

	public void tick() {
		
		this.hunger++;
		this .thirst++;
		this.boredom++;
		
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
	
		return this.description ;
	}
	
	

}