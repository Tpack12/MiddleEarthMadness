package middleearth.mu.edu.management;

public class MiddleEarthCouncil {
    private static MiddleEarthCouncil instance;  // Single instance
    private CharacterManager characterManager;   // Manages characters    
    private MiddleEarthCouncil() {
    	characterManager = new CharacterManager(); //Initialize CharacterManager
    }
    
    public static MiddleEarthCouncil getInstance() {
    	if (instance == null) {
    		instance = new MiddleEarthCouncil();
    	}
    	return instance;
    }
    
    public CharacterManager getCharacterManager() {
    	return characterManager;
    }
} 
