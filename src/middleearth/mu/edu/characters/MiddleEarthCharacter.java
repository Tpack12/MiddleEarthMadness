package middleearth.mu.edu.characters;

abstract class MiddleEarthCharacter {
	String name;
	double health;
	double power;

	//Constructor that initializes the name, health, and power of a character
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	//Method to handle the attack logic
	public abstract boolean attack(MiddleEarthCharacter target);
	
	//Method to get the race of the character
	public abstract String getRace();
	
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Health: " + health);
		System.out.println("Power: " + power);
		System.out.println("Race: " + getRace());
	}
	
}
	