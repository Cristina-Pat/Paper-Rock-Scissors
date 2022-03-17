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

}
