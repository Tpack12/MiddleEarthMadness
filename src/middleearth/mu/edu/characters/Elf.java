package middleearth.mu.edu.characters;

//Constructor initializes Elf character details
class Elf extends MiddleEarthCharacter {
	public Elf(String name, double health, double power) {
		super(name, health, power);
	}
	
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target.getRace().equals("Elf") || target.getRace().equals("Dwarf")) {
			return false; //Does no damage towards Elf and Dwarf
		}
		
		double damage = this.power;
		if (target.getRace().equals("Orc")) {
			damage *= 1.5; //Does extra damage towards Orc
		}
		target.health -= damage;
		return true; //Attack was successful
	}
	
	//Returns the race of the character
	@Override
	public String getRace(){
		return "Elf";
	}
}
