package rock_paper_scissors;
import java.util.Random;

import rock_paper_scissors.input_reader;

public class rock_paper_scissors {
	
    // Fields of the class RockPaperScissors
	private input_reader reader;
    private int yourScore;
    private int computerScore;
    private Random ran;
    
    /**
    * Constructor for objects of class RockPaperScissors
    */
    public rock_paper_scissors()
    {
      reader = new input_reader();
      yourScore = 0;
      computerScore = 0;
      ran = new Random(1);
    }
    
    /**
     * Print the prompt with the user's input
     */
    public void printPrompt()
    {
        System.out.println();
        System.out.println();
        System.out.print("Enter your choice, paper, rock or scissors ");
        System.out.print("> ");                // print prompt
    }
    /**
     * Return the user's input for a round of the game.
     * 
     * @return userInput The user's input.
     */
    public String userChoice() 
    {
        String userInput = reader.getInput().trim().toLowerCase(); // no leading and trailing space, in lowercase
        return userInput;
    }
    
    /**
     * Return a generated random computer's choice of "rock" (value 0), "paper" (value 1) 
     * or "scissors" (value 2).
     * 
     * @return result A Strings, where this is one of the choices.
     *         
     */
    public String computerChoice() 
    {
        int upperbound = 2;
        int intRandom = ran.nextInt(upperbound+1);
        String result = "";
        
        switch(intRandom) {
            case 0:
                result = "rock";
                break;
            case 1: 
            	result = "paper";
                break;
            case 2: 
               result = "scissors";
                break;
            default:
                result = "error";
                break;
        }
        
        return result;
    }
    
    /**
     * Determine the winner of the round according to the game's rules, 
     * returning "draw", "you" or "computer", as appropriate.
     * 
     * If yourChoice is an invalid string then the computer is chosen as the winner of this round.
     * 
     * @param yourChoice The user's choice for this round. 
     * @param computerChoice The computer's choice for this round.
     * 
     * @return result The winner of the round, or draw whether both choices are the same.
     */
    public String findWinner(String yourChoice, String computerChoice) 
    {
    	 String result = "";
         

         if (yourChoice.equals(computerChoice)){
             result = "draw";
         }
         else if (yourChoice.equals("rock") && computerChoice.equals("paper")){
             computerScore ++;
             result = "computer";
         }
         else if (yourChoice.equals("scissors") && computerChoice.equals("paper")){
             yourScore ++;
             result = "you";
         }
         else if (yourChoice.equals("paper") && computerChoice.equals("rock")){
             yourScore ++;
             result = "you";
         }
         else if (yourChoice.equals("scissors") && computerChoice.equals("rock")){
             computerScore ++;
             result = "computer";
         }
         else if (yourChoice.equals("paper") && computerChoice.equals("scissors")){
             computerScore ++;
             result = "computer";
         }
         else if (yourChoice.equals("rock") && computerChoice.equals("scissors")){
             yourScore ++;
             result = "you";
         }
         else {
             computerScore ++;
             result = "computer";
         }
         return result;
     }
}
