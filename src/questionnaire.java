import java.util.Scanner;


public class questionnaire {
	
	/*Purpose: Use branching statements to respond to user input
	 *Matthew Kachar
	 *matthew.kachar@marquette.edu
	 *January 13, 2014
	 * */
	public static void main (String[]args){
		
		Scanner keyboard = new Scanner (System.in);
		
		int score = 0;
		
		System.out.println("Q1: Enter an even number between 10 and 20.");
		
		int q1 = keyboard.nextInt();
		
			if (q1 == 11 || q1 == 13 || q1 == 15 || q1 == 17 || q1 == 19)
				System.out.println("Incorrect!");
			
			else{ 
				System.out.println("Correct!");
				
				score++;
				}
			
		System.out.println("Q2. What is the summation of 3 and 5?");
			
		int q2 = keyboard.nextInt();
		
			if (q2 == 8){
				System.out.println("Correct!");
				score++;
			}
			else 
				System.out.println("Incorrect!");
				
		System.out.println("Q3. How many states are there in USA?");
		
		int q3 = keyboard.nextInt();	
			
			if (q3 == 50){
				System.out.println("Correct!");
				score++;
			}
			else 
				System.out.println("Incorrect!");
		
		System.out.println("Q4. Enter a word that comes after “television” in dictionary");
		
		String answer = keyboard.next();	
			
		int result = answer.compareToIgnoreCase("televison"); 
		
			if (result > 0){
				System.out.println("Correct!");
				score++;
			}
			else 
				System.out.println("Incorrect!");
		
		System.out.println("Q5. What is symbol of Fahrenheit?");
		
		String answerq5 = keyboard.next();
		
			if (answerq5.equals("F")){ // the notation for Fahrenheit is capitol "F" 
				System.out.println("Correct!");
				score++;
			
			}
			else 
				
				System.out.println("Incorrect!");
		
		System.out.println("Q6. What is the capitol of Wisconsin?");
		
		String answerq6 = keyboard.next();	
		
			if (answerq6.equalsIgnoreCase("Madison")){
				System.out.println("Correct!");
				score++;
			}	
			else 
				System.out.println("Incorrect!");

		System.out.print("Your answered " + score + " correctly.");
			
			if (score == 6)
				System.out.println(" Good Job!");
			
			else
				System.out.println(" Better luck next time.");
			
				
	}

}
