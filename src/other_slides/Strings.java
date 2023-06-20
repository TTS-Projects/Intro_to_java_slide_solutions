package other_slides;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		//initializing variables
		Scanner userInput = new Scanner(System.in);     
        String animal = "";
  
        //prompt and wait for user input
        System.out.println("Input an animal name");
        animal = userInput.nextLine();

        //turning all input into lowercase letters
        animal = animal.toLowerCase();
        System.out.println(animal); //check if all lowercase
        //conditional to check whether dog, cat or unknown
        if( animal.equals("dog" )) {
            System.out.println("Bark Bark!");
        }
        else if (animal.equals("cat")) {
            System.out.println("Meow Meow!");
        }
        else {
            System.out.println("Unknown animal!");

        }
	}
}
