import java.util.Scanner;

public class Ifelse {

    public static void main(String[] args)
    {
        System.out.print("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);
        int inputtedNum = scanner.nextInt();
        if (inputtedNum > 5)
        {
            System.out.println("Great than 5");
        }
        else
        {
            System.out.println("less than 5");

        }

    }
}
