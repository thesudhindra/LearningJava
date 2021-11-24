import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int StudentAge = 15;
        double StudentGPA = 3.45;


        boolean attendance = true;
        String Name = "Sudhindra Deshpande";
        char StudFirstInitial = Name.charAt(0);
        char StudLastInitial=Name.charAt(10);
        String n1 = "Client";
        String n2= "Admin";
        String n3 = " ";
        System.out.println(StudentGPA);
        System.out.println("what you want to update?");
        Scanner input = new Scanner(System.in);
        StudentGPA = input.nextDouble();
        System.out.println(Name + " now has GPA of "+ StudentGPA);




//        System.out.println(StudentAge);
//        System.out.println(StudentGPA);

//        System.out.println(StudFirstInitial);
//        System.out.println(StudLastInitial);
//        System.out.println(attendance);
//        System.out.println(Name);
//        System.out.println(n1+n3+n2);
    }
}
