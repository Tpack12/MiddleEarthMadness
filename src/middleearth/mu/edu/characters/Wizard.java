package middleearth.mu.edu.characters;

//Constructor initializes Wizard character details
class Wizard extends MiddleEarthCharacter {
	public Wizard(String name, double health, double power) {
		super(name, health, power);
	}
	
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target.getRace().equals("Wizard") || target.getRace().equals("Human")) {
			return false; //Does no damage towards Wizard and Human
		}
		
		double damage = this.power;
		if (target.getRace().equals("Dwarf")) {
			damage *= 1.5; //Does extra damage towards Dwarf
		}
		target.health -= damage;
		return true; //Attack was successful
	}
	
	//Returns the race of the character
	@Override
	public String getRace(){
		return "Wizard";
	}
}
