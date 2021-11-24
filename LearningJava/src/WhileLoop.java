import java.util.Scanner;

public class WhileLoop
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean isOnRepeat = true;

        while(isOnRepeat)
        {
            System.out.println("Playing current song");
            System.out.println("If you want to change the song then answer Yes otherwise enter No");
            String userInput = scanner.next();

            if (userInput.equals("Yes") || userInput.equals("yes"))
            {
                isOnRepeat = false;
            }

        }
        System.out.println("Playing next song");
    }
}
