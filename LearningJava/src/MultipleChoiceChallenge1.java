import java.util.Objects;
import java.util.Scanner;

public class MultipleChoiceChallenge1 {

    public static void main(String[] args) {



        boolean isRepeat = true;
        String ansChoice1 = "5";
        String ansChoice2 = "7";
        String ansChoice3 = "8";
        String question = "Which number comes after 6?";
        while(isRepeat)
        {

            System.out.println(question);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();

            if (Objects.equals(answer, ansChoice2)) {
                System.out.println("Congratulations, Answer is correct!!");
                isRepeat = false;
            }
            else
                System.out.println("Sorry, "+ansChoice2+" is the correct answer, Try again");
        }

    }
}
