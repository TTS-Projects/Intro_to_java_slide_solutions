package other_slides;

import java.util.Scanner;

public class PassingGrade {
	public static void main(String[] args) {
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
             System.out.printf("You passed! Good Job!\n"); //grade was in passable range

         }
	}
}
