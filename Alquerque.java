import java.util.Scanner;
public class Alquerque
{
    public static void main(String[] args)
    {
       String playerWhite;
       String playerBlack; 
       boolean invalidInput;
       Scanner reader = new Scanner(System.in);
       System.out.println("Welcome to Alquerque! Who is playing?:");
       System.out.println("Type 1 for computer vs computer");
       System.out.println("Type 2 for human vs computer");
       System.out.println("Type 3 for human vs human");
       String choosePlayers = reader.nextLine();
       do
       {
           playerWhite = "";
           playerBlack = "";
            invalidInput = false;
            switch(choosePlayers)
            {
                case "1":
                    System.out.println("The computer is now playing vs itself.");
                    break;
                case "2":
                    boolean invalidColor;
                    do
                    {
                        invalidColor = false;
                        System.out.println("You are now playing against the computer. Do you want to play as black or white? White is starting.");
                        String playerColor = reader.nextLine();
                        if (playerColor.equals("black") || playerColor.equals("Black"))
                        {
                            System.out.println("What is your name?:");
                            playerBlack = reader.nextLine();
                            System.out.println(playerBlack);
                        }
                        else if (playerColor.equals("white") || playerColor.equals("White"))
                        {
                            System.out.println("What is your name?:");
                            playerWhite = reader.nextLine();
                        }
                        else
                        {
                            System.out.println("Invalid input, try again");
                            invalidColor = true;
                        }
                    }while(invalidColor == true);
                    break;
                case "3":
                    boolean invalidName;
                    do
                    {
                        invalidName = false;
                        System.out.println("You are playing against another human player. Who is playing white? White is starting.");
                        String playerName = reader.nextLine();
                        //System.out.println(playerName);
                        if (playerName.equals(""))
                        {
                            System.out.println("Your name cannot be nothing, try again.");
                            invalidName = true;
                        }
                        playerWhite = playerName;
                        //System.out.println(playerWhite);
                    }while(invalidName == true);
                    do
                    {
                        invalidName = false;
                        System.out.println("Who is playing black?");
                        String playerName = reader.nextLine();
                        if (playerName.equals(""))
                        {
                            System.out.println("Your name cannot be nothing, try again.");
                            invalidName = true;
                        }
                        playerBlack = playerName;
                    }while(invalidName == true);
                    break;
                default:
                    System.out.println("Invalid input, try again");
                    invalidInput = true;
                    break;
            }
       }while(invalidInput == true);
       System.out.println("player white is: " + playerWhite);
       System.out.println("player black is: " + playerBlack);
    }
}