import java.util.Random;
import java.util.Scanner;
/**
 * Operators and Random Logic question
 *
 * @author (Edgar Verastegui)
 * @version (2.0)
 */
public class RandomLogic {
        
    public void askQuestion()
    {
        Random random = new Random();
        
        /*
         *  Asking question
         */
        
        // Answers for question that will be asked
        String[] answers = {"==","=","!=","/="};
        // Correct answer number, starting at 0
        int answer = 2; // != is the correct answer
        
        // Creates array w answer values 0-however many answers there are (usually 4)
        int[] answerOrder = new int[answers.length];
        for (int i=0; i<answerOrder.length; i++)
        {
            answerOrder[i] = i;
        }
        
        // Randomizes answer value order by swapping values in the array created above
        for (int i=0; i<answerOrder.length; i++)
        {
            int randomNum = random.nextInt(answerOrder.length);    //random number within array
            int originalNum = answerOrder[i];                      //saving original number of array at i
            answerOrder[i] = answerOrder[randomNum];               //changing value of array at i to random number generated
            answerOrder[randomNum] = originalNum;                  //setting value of array at randomNum to original value at i so original value is not lost
        }
        
        // Prints question
        System.out.println("Which operator do you use to test if two numbers are not equal to each other?");
       
        // Prints answers, numbered, however many there are
        for (int i=0; i<answerOrder.length; i++)
        {
            System.out.println((i+1) + ". " + answers[answerOrder[i]]);
        }
        
        /*
         *  Checking Answer
         */
        
        
        
        
        Scanner scanner = new Scanner(System.in);
        int guess = -1; // -1 is placeholder to initialize.
        
        while (!(guess > -1 && guess < 4))  // Checks if answer provided is 1-4, if not, asks again for input
        {
            System.out.println("Enter an answer 1-4");
            
            while(!scanner.hasNextInt()) // Scanner looking for integer input from user. If not an integer, will ask again.
            {
                System.out.println("Enter an answer 1-4");
                scanner.next();     // Scanner asking for next input in loop until integer is given
            }
            guess = scanner.nextInt()-1;    // User input assigned to "guess". -1 to make it array compatible
        }
        
        
        int correctAnswer = -1; //initializing
        
        // Checks randomized array to see where the correct answer is. Location is stored as correctAnswer. User will see the location and give that as their answer
        for (int i=0; i<answers.length; i++)
        {
            if(answerOrder[i] == answer) correctAnswer = i; // correctAnswer given value of location of answer in randomized array
        }
        
        // Compares user input to correct answer.
        if (guess == correctAnswer) System.out.println("Correct! :D");
        else System.out.println("Incorrect! :(");
        
        // Prints out correct answer
        System.out.println("Correct answer: " + (correctAnswer+1) + ": " + answers[answer]);
    }
}
