import chn.util.ConsoleIO;
import apcslib.*;

public class IO {

    private ConsoleIO console;

    public IO()
    {
        console = new ConsoleIO();
    }


    public void printQuestion(String number, String question)
    {

        String title = Format.center("Question "+ number, 40);
        System.out.println(title);
        System.out.println(question);
    }

    public void printOptions(String A, String B, String C, String D)
    {
        System.out.println("A) " + A);
        System.out.println("B) " + B);
        System.out.println("C) " + C);
        System.out.println("D) " + D);
    }

    /**
     * This method uses chn.util.ConsoleIO to get input from user.
     * The choice will be converted to capital letter.
     * If the input isn't expected, the method will prompt error and
     * try again until it is accepted. If user enters "X", the caller should
     * check and act accordingly.
     *
     * @param Nothing
     * @return choice, a string that is "A", "B", "C, "D", or "X"
     */
    public String getInput()
    {
        boolean successful = false;
        String choice = "";

        while (!successful) {
            System.out.println("Enter A, B, C, D, or X to skip --> ");
            choice = console.readLine();
            choice = choice.toUpperCase();
            if (choice.equals("A") || choice.equals("B") || choice.equals("C")
                    || choice.equals("D") || choice.equals("X")) {
                successful = true;
            }
            else {
                System.out.println("Invalid input, try again");
            }

        }

        return choice;
    }

    public void checkAnswer(String question, String choice)
    {
        if (choice.equals("X")) {
            System.out.println("Question skipped");
            return;
        }
        else if (question.equals("1") || question.equals("3")) {
            if (choice.equals("C")) {
                System.out.println("Correct :)");
            }
            else {
                System.out.println("Incorrect :(");
            }
        }
        else if (question.equals("2")) {
            if (choice.equals("A")) {
                System.out.println("Correct :)");
            }
            else {
                System.out.println("Incorrect :(");
            }
        }
    }

    public void askQuestion (){

        printQuestion("1", "What does console.readline accomplish?");
        printOptions("It is a method that returns user input as an integer", "It prints out user input to the command line",
                "It is a method that returns user input as a string", "It centers the text");
        String choice = getInput();
        checkAnswer("1", choice);

    }

}