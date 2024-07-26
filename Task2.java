package cs;
import java.util.Scanner;
import java.util.Random;

public class Task2 
{
    static void playagain() 
    {
        Scanner sn = new Scanner(System.in);
        char ch;
        do
        {
            playGame();
            System.out.println("Do you want to play the game again (y/n)?");
            ch = sn.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
        System.out.println("Game ended");
    }

    static void playGame()
    {
        Scanner sn = new Scanner(System.in);
        Random rn = new Random();
        int userScore = 0;
        int computerScore = 0;
        
        while(true) 
        {
            System.out.println("Enter the userChoice \n 1.ROCK \n 2.PAPER \n 3.SCISSOR \n 4. Quit ");
            int userChoice = sn.nextInt();
            int computerChoice = rn.nextInt(3) + 1;  
            System.out.println("Computer's choice: " + computerChoice);

            if(userChoice == 4) 
            {
                System.out.println("Game over: User score: " + userScore + " Computer score: " + computerScore);
                break;
            }
            else if(userChoice < 1 || userChoice > 4) 
            {
                System.out.println("Invalid input. Please enter a valid input.");
                continue;
            }

            if(userChoice  == computerChoice)
			{
				System.out.println("The game end in a tie");
				System.out.println("Userscore =  " + userScore);
				System.out.println("Computerscore =  " + computerScore);
			}
			else if(userChoice == 1)
			{
				if(computerChoice==2)
				{
					System.out.println("computer won");
					computerScore ++;
					System.out.println("Userscore =  " + userScore);
					System.out.println("Computerscore =  " + computerScore);
				}
				else
				{
					System.out.println("user won");
					userScore++;
					System.out.println("Userscore =  " + userScore);
					System.out.println("Computerscore =  " + computerScore);
				}
			}
			else if(userChoice == 1)
			{
				if(computerChoice==2)
				{
					System.out.println("computer won");
					computerScore ++;
					System.out.println("Userscore =  " + userScore);
					System.out.println("Computerscore =  " + computerScore);
				}
				else
				{
					System.out.println("user won");
					userScore++;
					System.out.println("Userscore =  " + userScore);
					System.out.println("Computerscore =  " + computerScore);
				}
			}
			else if(userChoice == 2)
			{
				if(computerChoice==3)
				{
					System.out.println("computer won");
					computerScore ++;
					System.out.println("Userscore =  " + userScore);
					System.out.println("Computerscore =  " + computerScore);
				}
				else
				{
					System.out.println("user won");
					userScore++;
					System.out.println("Userscore =  " + userScore);
					System.out.println("Computerscore =  " + computerScore);
				}
			}
			else if(userChoice == 3)
			{
				if(computerChoice==1)
				{
					System.out.println("computer won");
					computerScore ++;
					System.out.println("Userscore =  " + userScore);
					System.out.println("Computerscore =  " + computerScore);
				}
				else
				{
					System.out.println("user won");
					userScore++;
					System.out.println("Userscore =  " + userScore);
					System.out.println("Computerscore =  " + computerScore);
				}
			}
		

            if(userScore == 10 || computerScore == 10) {
                System.out.println("Game ends ");
                System.out.println("Total score by both players ");
                System.out.println("User score = " + userScore);
                System.out.println("Computer score = " + computerScore);
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("      GAME STARTS     ");
        System.out.println(" ROCK  PAPER  AND SCISSOR  GAME ");
        playagain();
    }
}
