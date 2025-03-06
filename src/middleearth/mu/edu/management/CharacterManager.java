package middleearth.mu.edu.management;

import middleearth.mu.edu.characters.MiddleEarthCharacter;

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
	
	public boolean updateCharacter(MiddleEarthCharacter character, String name, int health, int power) {
		for (int i = 0; i < size; i++) {
			if (characters[i] == character) {
				characters[i].setHealth(health);
				characters[i].setPower(power);
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteCharacter(MiddleEarthCharacter character) {
        for (int i = 0; i < size; i++) {
            if (characters[i] == character) {
                // Shift elements left to remove the character
                for (int j = i; j < size - 1; j++) {
                    characters[j] = characters[j + 1];
                }
                characters[size - 1] = null; // Nullify last element
                size--; // Reduce size
                return true;
            }
        }
        return false;
    }
	
	public void displayAllCharacters() {
        if (size == 0) {
            System.out.println("No characters available.");
            return;
        }

        System.out.println("\n===== All Characters =====");
        for (int i = 0; i < size; i++) {
            characters[i].displayInfo();
        }
        System.out.println("==========================");
    }
	
	private void resizeArray() {
        MiddleEarthCharacter[] newArray = new MiddleEarthCharacter[characters.length * 2];
        System.arraycopy(characters, 0, newArray, 0, characters.length);
        characters = newArray;
    }
	
	public int getSize() {
        return size;
    }
	
	public MiddleEarthCharacter getCharacterAt(int index) {
        if (index >= 0 && index < size) {
            return characters[index];
        }
        return null;
    }
}

