import java.util.Scanner;

public class lab2_2 {
    public static void main(String[] args) {
        int user;
        Scanner input = new Scanner(System.in);
        String[] srp = new String[] {"scissor", "rock", "paper"}; 
        int bot = (int) (Math.random() * 3);

        System.out.print("scissor (0), rock (1), paper (2) : ");
        user = input.nextInt();

        if(bot == user)
        {
            System.out.println("The computer is " + srp[bot] +". You are " + srp[user] +" too. It is a draw");
        }
        else if (user == 0 && bot == 2)
        {
            System.out.println("The computer is " + srp[bot] +". You are " + srp[user] +". you won");
        }
        else if (user == 0 && bot == 1)
        {
            System.out.println("The computer is " + srp[bot] +". You are " + srp[user] +". you lose");
        }
        else if (user == 1 && bot == 0)
        {
            System.out.println("The computer is " + srp[bot] +". You are " + srp[user] +". you won");
        }
        else if (user == 1 && bot == 2)
        {
            System.out.println("The computer is " + srp[bot] +". You are " + srp[user] +". you lose");
        }
        else if (user == 2 && bot == 1)
        {
            System.out.println("The computer is " + srp[bot] +". You are " + srp[user] +". you won");
        }
        else if (user == 2 && bot == 0)
        {
            System.out.println("The computer is " + srp[bot] +". You are " + srp[user] +". you lose");
        }
    }
}
