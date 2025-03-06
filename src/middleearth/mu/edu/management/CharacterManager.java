package middleearth.mu.edu.management;

import middleearth.mu.edu.character.MiddleEarthCharacter;

public class CharacterManager {
	private middleearth.mu.edu.characters.MiddleEarthCharacter[] characters;
	private int size;
	
	public CharacterManager() {
		characters = new MiddleEarthCharacter[5];
		size = 0;
	}
	
	public boolean addCharacter(MiddleEarthCharacter c) {
		if (size >= characters.length) {
			resizeArray();
		}
		characters[size++] = c;
		return true;
	}
	
	public MiddleEarthCharacter getCharacter(String name) {
		for (int i = 0; i < size; i++) {
			if (characters[i].getName().equalsIgnoreCase(name)) {
				return characters[i];
			}
		}
		return null;
	}
	
}
