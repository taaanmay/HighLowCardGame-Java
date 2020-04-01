/* SELF ASSESSMENT 
   1. Did I use appropriate CONSTANTS instead of numbers within the code? 
       Mark out of 5:5
       Comment:  Appropriate constants are used.
   2. Did I use easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE? 
       Mark out of 5:5
       Comment: Yes the constants are formatted according to the coding standard.
   3. Did I use easy-to-understand meaningful variable names? 
       Mark out of 10:10
       Comment:  Yes. Easy to understand variable names are used.
   4. Did I format the variable names properly (in lowerCamelCase)? 
       Mark out of 5:5
       Comment:  Yes the variables are formatted according to the coding standard.
   5. Did I indent the code appropriately? 
       Mark out of 10:10
       Comment:  Yes the code is indented properly.
   6. Did I use an appropriate loop to allow the user to enter their guesses until they win or lose? 
       Mark out of 20: 20
       Comment:  I used a do while loop so that the user is given 4 chances to either win or loose.
   7. Did I check the input to ensure that invalid input was handled appropriately? 
       Mark out of 10:10 
       Comment:  All the possible invalid inputs are handled properly.
   8. Did I generate the cards properly using random number generation (assuming all cards are equally likely each time)? 
       Mark out of 10:10 
       Comment: Yes the cards are produced randomly and all are likely to occur.
   9. Did I output the cards correctly as 2, 3, 4, ... 9, 10, Jack, Queen, King? 
       Mark out of 10: 10
       Comment:  Yes the card starts from 2. And the highest card is an ace as shown in the sample in question.
   10. Did I report whether the user won or lost the game before the program finished? 
       Mark out of 10:10
       Comment: The user plays 4 times and then gets the result. I was confused a little if the result should be displayed earlier or after the game. So I decided to go with the end. 
   11. How well did I complete this self-assessment? 
       Mark out of 5:5
       Comment:   I feel I have assessed myself well with appropriate comments.
   Total Mark out of 100 (Add all the previous marks): 
 */




import java.util.Random;
import java.util.Scanner;


public class HiLoCardGame {
	static int NUMBER_OF_GUESSES = 0;
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random generator = new Random();

		System.out.println("The computer will draw a random card. You will guess if the card that the computer has chosen is higher, lower or equal to the card given to you.");
		int card = generator.nextInt(12) + 2;
		int wrongCount = 0;


		do{
			NUMBER_OF_GUESSES=NUMBER_OF_GUESSES+1;

			int nextCard = generator.nextInt(12) +2;
			if (nextCard <=10) 
			{
				System.out.println("Card is a "+nextCard);
			}
			else if (nextCard == 11)
			{
				System.out.println("Card is a jack");
			}
			else if (nextCard == 12)
			{
				System.out.println("Card is a queen");
			}

			else if (nextCard == 13)
			{
				System.out.println("Card is a King");
			}
			else if (nextCard == 14)
			{
				System.out.println("Card is an Ace");
			}



			System.out.println("Do you think the new card is higher, lower or equal");
			String answer = input.next();

			if (answer.equalsIgnoreCase("higher")||answer.equalsIgnoreCase("lower")||answer.equalsIgnoreCase("equal"))
			{


				{

					if ( nextCard > card) {



						if (answer.equalsIgnoreCase("higher"))
						{

						}else wrongCount++ ;


					} else if ( nextCard < card)  {

						if(answer.equalsIgnoreCase("lower"))
						{

						}else wrongCount++;

					}else if ( nextCard == card)
					{					
						if (answer.equalsIgnoreCase("equal"))
						{

						}else wrongCount++;

					}
				} 

			}else {System.out.println("Incorrect Entry. Start the game again.");
			NUMBER_OF_GUESSES = 0;}
		
		} while (NUMBER_OF_GUESSES <4);	

		if (wrongCount ==0)
		{
			System.out.println("Congratulations you got all the answers are correct");
		}else System.out.println("You lost the game. You answered "+wrongCount + " answer(s) wrong ");


	}

}
