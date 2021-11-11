import java.util.Scanner;
public class Alquerque
{
    public static void main(String[] args)
    {
       String playerWhite;
       String playerBlack; 
       boolean invalidInput;
       Scanner reader = new Scanner(System.in);
       
       do
       {
            System.out.println("Welcome to Alquerque! Who is playing?:");
            System.out.println("Type 1 for computer vs computer");
            System.out.println("Type 2 for human vs computer");
            System.out.println("Type 3 for human vs human");
            String choosePlayers = reader.nextLine();
            playerWhite = "Computer White";
            playerBlack = "Computer Black";
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
                        if (playerName.equals("Computer White") || playerName.equals("Computer Black"))
                        {
                            System.out.println("Your name cannot be 'Computer White' or 'Computer Black', choose another name");
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
       System.out.println("press enter to continue");
       reader.nextLine();
       boolean gameOver = false;
       int turnCounter = 1;
       String currentPlayer;
       Board board = new Board();
       while(gameOver == false)
       {
           char[] boardState = new char[26];
           for(int i=1; i<=25;i++)
           {
               boardState[i] = '*';
           }
           for(int position : board.black())
           {
               boardState[position] = 'B';
           }
           for(int position : board.white())
           {
               boardState[position] = 'W';
           }
           System.out.println(boardState[21] + " - " + boardState[22] + " - " + boardState[23] + " - " + boardState[24] + " - " + boardState[25]);
           System.out.println("| \\|/ \\|/ \\|/ |");
           System.out.println(boardState[16] + " - " + boardState[17] + " - " + boardState[18] + " - " + boardState[19] + " - " + boardState[20]);
           System.out.println("| \\|/ \\|/ \\|/ |");
           System.out.println(boardState[11] + " - " + boardState[12] + " - " + boardState[13] + " - " + boardState[14] + " - " + boardState[15]);
           System.out.println("| \\|/ \\|/ \\|/ |");
           System.out.println(boardState[6] + " - " + boardState[7] + " - " + boardState[8] + " - " + boardState[9] + " - " + boardState[10]);
           System.out.println("| \\|/ \\|/ \\|/ |");
           System.out.println(boardState[1] + " - " + boardState[2] + " - " + boardState[3] + " - " + boardState[4] + " - " + boardState[5]);
           if (turnCounter % 2 == 1)
           {
               currentPlayer = playerWhite;
           }
           else
           {
               currentPlayer = playerBlack;
           }
           System.out.println("It is " + currentPlayer + "'s turn, what is your move?");
           


           turnCounter = turnCounter + 1;
           //gameOver=true;
       }
    }
}