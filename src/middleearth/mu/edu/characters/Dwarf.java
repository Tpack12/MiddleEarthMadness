package middleearth.mu.edu.characters;

//Constructor initializes Dwarf character details
class Dwarf extends MiddleEarthCharacter {
	public Dwarf(String name, double health, double power) {
		super(name, health, power);
	}
	
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target.getRace().equals("Dwarf") || target.getRace().equals("Wizard")) {
			return false; //Does no damage towards Wizard
		}
		
		double damage = this.power;
		if (target.getRace().equals("Elf")) {
			damage *= 1.5; //Does extra damage towards Elf
		}
		target.health -= damage;
		return true; //Attack was successful
	}
	
	//Returns the race of the character
	@Override
	public String getRace() {
		return "Dwarf";
	}
}

