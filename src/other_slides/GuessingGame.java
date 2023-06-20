package other_slides;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);  //initialize Scanner 
        int stored_number = 5; //create a stored number
        
        //prompt and wait for input
        System.out.println("Guess a number between one and 10.");
        int guess = Integer.parseInt(userInput.nextLine());

        //conditional
        if (guess == stored_number){
        	//guess was correct
          System.out.printf("Wow!\n");
          System.exit(0);
        } else {
        	//guess was incorrect
            System.out.printf("Nope!\n");
            
        }
		
		
		
		//updatedGuessingGame();
	}
	
	public static void updatedGuessingGame() {
		
	}
}
