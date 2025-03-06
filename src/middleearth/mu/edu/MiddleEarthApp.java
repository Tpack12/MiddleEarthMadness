package middleearth.mu.edu;

import middleearth.mu.edu.menu.Menu;
import middleearth.mu.edu.management.MiddleEarthCouncil;
import middleearth.mu.edu.management.CharacterManager;
import java.util.Scanner;


public class MiddleEarthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MiddleEarthCouncil council = MiddleEarthCouncil.getInstance(); // Singleton instance
        CharacterManager manager = council.getCharacterManager(); // Access to character management

        Menu menu = new Menu(scanner, manager); // Create menu handler
        menu.display(); // Start menu interaction

        scanner.close();
    }
}

