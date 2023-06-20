package madlib;
import java.util.Scanner;
import java.util.*;

  public class MadLib {
      public static void main(String[] args){
        
      guessNumber();
      }
      
      public static void madlib2() {
    	  Scanner userInput = new Scanner(System.in);      
          int ageLimit = 18;
    
          System.out.println("How old are you?");
          
          int age = Integer.parseInt(userInput.nextLine());


          if (age < ageLimit){
            System.out.printf("You are too young! Sorry!\n");
            System.exit(0);
          } else {

        	  Scanner userInput1 = new Scanner(System.in);
              System.out.println("Enter a name: ");
              String name = userInput.nextLine();
              System.out.println("Give me an adjective: ");
              String adjective = userInput.nextLine();
              System.out.println("Give me a verb: ");
              String verbOne = userInput.nextLine();
              System.out.println("Give me another verb: ");
              String verbTwo = userInput.nextLine();
              System.out.println("Give me a number: ");
              String number = userInput.nextLine();
              System.out.println("Give me your name: ");
              String yourName = userInput.nextLine();

              System.out.printf("Here is your story: \n");
              System.out.printf("\n Dear %s,", name);
              System.out.printf("\n You are extremely %s and I want to %s you!", adjective, verbOne);
              System.out.printf("\n I want to %s you %s times.", verbTwo, number);
              System.out.printf("\n Sincerely, %s \n", yourName);
      }
      }
          public static void madlib2Fixed() {
        	  Scanner userInput = new Scanner(System.in); //initialize the Scanner object     
              int ageLimit = 18; //setting mandatory age limit
             
              // prompt and then wait for input
              System.out.println("How old are you?");
              int age = Integer.parseInt(userInput.nextLine());

              // if age is lower than age limit,
              if (age < ageLimit){
                System.out.printf("You are too young! Sorry!\n"); // do this!
                System.exit(0); //exit the program with exit status 0 (0 means no errors)
              } else { // start the 
            	 
        	  System.out.println("Enter a name: ");
              String name = userInput.nextLine();
              System.out.println("Give me an adverb: ");
              String adverb = userInput.nextLine();
              System.out.println("Give me an adjective: ");
              String adjective = userInput.nextLine();
              System.out.println("Give me a noun: ");
              String noun = userInput.nextLine();
              System.out.println("Give me another noun: ");
              String nounTwo = userInput.nextLine();
              System.out.println("Give me a number: ");
              String number = userInput.nextLine();
              System.out.println("Give me your name: ");
              String yourName = userInput.nextLine();

              System.out.printf("Here is your story: \n");
              System.out.printf("\n Dear %s,", name);
              System.out.printf("\n You are %s %s and I want to be your %s!", adverb, adjective, noun);
              System.out.printf("\n I want to go to the %s with you in %s days.", nounTwo, number);
              System.out.printf("\n Sincerely, %s \n", yourName);
          }
          }
              
              //solution A (slide 49)
              public static void guessNumber() {
            	  Scanner userInput = new Scanner(System.in);      
                  int stored_number = 5; 
            
                  System.out.println("Guess a number between one and 10.");
                  
                  int guess = Integer.parseInt(userInput.nextLine());


                  if (guess == stored_number){
                    System.out.printf("Wow!\n");
                    System.exit(0);
                  } else {
                      System.out.printf("Nope!\n");

                  }
              }
                  
              //solution B (slide 49)
              public static void passingGrade() {
            	  Scanner userInput = new Scanner(System.in);      
                  int grade_fail = 60;
            
                  System.out.println("How old are you?");
                  
                  int grade = Integer.parseInt(userInput.nextLine());


                  if (grade < grade_fail){
                    System.out.printf("You have to take the class again! Sorry!\n");
                    System.exit(0);
                  } else {
                      System.out.printf("You passed! Good Job!\n");

                  }
              }
              
            //solution A (slide 49)
              public static void guessNumberAdvanced() {
            	  Scanner userInput = new Scanner(System.in);      
                  int stored_number = 5;
            
                  System.out.println("Guess a number between one and 10.");
                  
                  int guess = Integer.parseInt(userInput.nextLine());

                  int closeness = Math.abs(stored_number - guess);
                  if (closeness == 0){
                    System.out.printf("Wow!\n");
                    System.exit(0);
                  } else if (closeness <= 5){
                      System.out.printf("Oh! So close!\n");
                  }
                  else {
                      System.out.printf("Nope!\n");

                  }
              }
              
              public static void stringsExercise() {
            	  Scanner userInput = new Scanner(System.in);      
                  String animal = "";
            
                  System.out.println("Input an animal name");
                  String guess = userInput.nextLine();

                  if( animal.equals("dog")) {
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