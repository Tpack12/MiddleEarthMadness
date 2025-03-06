package middleearth.mu.edu.characters;

//Constructor initializes Human character details
class Human extends MiddleEarthCharacter {
	public Human(String name, double health, double power) {
		super(name, health, power);
	}
	
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target.getRace().equals("Human") || target.getRace().equals("Orc")) {
			return false; //Does no damage towards Human and Orc
		}
		
		double damage = this.power;
		if (target.getRace().equals("Wizard")) {
			damage *= 1.5; //Does extra damage towards Wizard
		}
		target.health -= damage;
		return true; //Attack was successful
	}
	
	//Returns the race of the character
	@Override
	public String getRace(){
		return "Human";
	}
}
