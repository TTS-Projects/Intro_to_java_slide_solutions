package other_slides;

import java.util.Scanner;

public class IfElsePractice {
	public static void main(String[] args) {
		
		//uncomment to run specific function
		guessingGame(); //exercise 1a
		//passingGrade(); //exercise 2
		//updatedGuessingGame(); //exercise 1b
	}
	
	public static void guessingGame() {
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
		
	}
	public static void passingGrade() {
		Scanner userInput = new Scanner(System.in);  //initialize scanner  
        int grade_fail = 60; //create a passing grade minimum
        
        //prompt and wait for user
        System.out.println("How old are you?");
        int grade = Integer.parseInt(userInput.nextLine());

        //conditional statement
        if (grade < grade_fail){
       	 System.out.printf("You have to take the class again! Sorry!\n"); //grade was too low
       	 System.exit(0); //exit with status 0
        } else {
            System.out.printf("You passed! Good Job!\n"); //grade was in possible range

        }
	}
	public static void updatedGuessingGame() {
		Scanner userInput = new Scanner(System.in);      
        int stored_number = 55;
  
        //prompt and wait for guess.
        System.out.println("Guess a number between one and 100.");
        int guess = Integer.parseInt(userInput.nextLine());
        
        //grabbing closeness of guess.
        int closeness = Math.abs(stored_number - guess); // absolute value ensures positive distance 
        if (closeness == 0){
          System.out.printf("Wow!\n");
          System.exit(0);
        } else if (closeness < 5 || closeness < 5){ //use of basic logical or operator
            System.out.printf("Oh! So close!\n");
        }
        else {
            System.out.printf("Nope!\n");

        }
	}
}
