package middleearth.mu.edu.menu;

import middleearth.mu.edu.management.CharacterManager;
import middleearth.mu.edu.characters.*;
import java.util.Scanner;

public class menu {
	private Scanner scanner;
	private CharacterManager manager;
	
	public menu(Scanner scanner, CharacterManager manager) {
		this.scanner = scanner;
		this.manager = manager;
	}
	
	public void display() {
		while (true) {
			System.out.println("\n===== Middle-Earth Character Management =====");
			System.out.println("1. Add a new character");
			System.out.println("2. View all characters");
			System.out.println("3. Update a character");
			System.out.println("4. Delete a character");
			System.out.println("5. Execute all characters attack actions");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");
			
			int choice = scanner.nextInt();
			scanner.nextLine(); //Consume newLine
			
			switch (choice) {
			case 1 -> addCharacter();
			case 2 -> manager.displayAllCharacters();
			case 3 -> updateCharacter();
			case 4 -> deleteCharacter();
			case 5 -> exectureAttacks();
			case 6 -> {
				System.out.println("Exiting Middle-Earth Madness...");
				return;
			}
			default -> System.out.println("Invalid choice. Please try again.");
			}
		}
	}
	
	private void addCharacter() {
		System.out.println("Enter character name: ");
		String name = scanner.nextLine();
		System.out.println("Enter health: ");
		double health = scanner.nextDouble();
		System.out.println("Enter power: ");
		double power = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Select race: ");
		System.out.println("1. Elf\n2. Dwarf\n3. Human\n4. Orc\n5. Wizard");
		int raceChoice = scanner.nextInt();
		scanner.nextLine();
		
		MiddleEarthCharacter character = switch (raceChoice) {
		case 1 -> new Elf(name, health, power);
		case 2 -> new Dwarf(name, health, power);
		case 3 -> new Human(name, health, power);
		case 4 -> new Orc(name, health, power);
		case 5 -> new Wizard(name, health, power);
		default -> {
			System.out.println("Invalid choice. Character not created.");
			yield null;
		}
		
		};
		
		if (character != null) {
			if(manager.addCharacter(character)) {
				System.out.println("Character added successfully!");
			} else {
				System.out.println("Failed to add character");
			}
		}
		
	}
	
	private void updateCharacter() {
		System.out.println("Enter character name to update: ");
		String name = scanner.nextLine();
		
		MiddleEarthCharacter character = manager.getCharacter(name);
		if (character == null) {
			System.out.println("Character not found.");
			return;
		}
		
		System.out.println("Enter new health: ");
		double health = scanner.nextDouble();
		System.out.println("Enter a new power: ");
		double power = scanner.nextDouble();
		scanner.nextLine();
		
		if (manager.updateCharacter(character, name, (int) health,, (int) power)) {
			System.out.println("Character updated successfully!");
		} else {
			System.out.println("Update failed.");
		}
	}

}
