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
}
