package middleearth.mu.edu.characters;

public abstract class MiddleEarthCharacter {
    protected String name;
    protected double health;
    protected double power;
    
    public MiddleEarthCharacter(String name, double health, double power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }
	
    public abstract boolean attack(MiddleEarthCharacter target);
    
    public abstract String getRace();
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Race: " + getRace() +
                ", Health: " + health + ", Power: " + power);
    }
    
    //Getters and Setters
    public String getName() { return name; }
    public double getHealth() { return health; }
    public double getPower() { return power; }

    public void setHealth(double health) { this.health = health; }
    public void setPower(double power) { this.power = power; }
}
	