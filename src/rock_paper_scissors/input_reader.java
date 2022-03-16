package rock_paper_scissors;

import java.util.Scanner;

/**
 * InputReader reads text input from the Terminal window.
 * 
 * @version 16 March 2022
 */
public class input_reader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the Terminal window.
     */
    public input_reader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user. 
     */
    public String getInput() 
    {     
      String word = reader.nextLine();
      return word;                    
    }
}