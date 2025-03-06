package middleearth.mu.edu.characters;

//Constructor initializes Orc character details
public class Orc extends MiddleEarthCharacter {
	public Orc(String name, double health, double power) {
		super(name, health, power);
	}
	
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target.getRace().equals("Orc") || target.getRace().equals("Elf")) {
			return false; //Does no damage towards Orc and Elf
		}
		
		double damage = this.power;
		if (target.getRace().equals("Human")) {
			damage *= 1.5; //Does extra damage towards Human
		}
		target.health -= damage;
		return true; //Attack was successful
	}
	
	//Returns the race of the character
	@Override
	public String getRace(){
		return "Orc";
	}
}
