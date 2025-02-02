import java.util.Scanner;

public class Input
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        User newUser = new User();

        System.out.println("Hello and thank you for choosing Texas General, we'd like to ask you a few questions for record keeping.\n");
        
        System.out.print("Would you like to continue? (y/n): ");
        char cont = scanner.next().charAt(0);  // grabbing the character to determine if the user would like to continue

        if (cont == 'y' || cont == 'Y') // Creates a branch where user agrees to answer questions
        {
            System.out.print("What is your name?: "); // Asks user then stores input in class
            newUser.name = scanner.next();

            System.out.print("How old are you?: "); // same as above
            newUser.age = scanner.nextInt();

            System.out.print("How much do you weigh?: "); // same as above
            newUser.weight = scanner.nextFloat();

            System.out.print("Do you smoke tobacco?: (y/n) ");
            char smokes = Character.toUpperCase(scanner.next().charAt(0)); // Grabs the user's input as a character, and converts it to uppercase
            newUser.isSmoker = (smokes == 'Y'); // sets the boolean value to true if user said yes


            System.out.println("--Patient Information-- \n");
            System.out.println("Name: " + newUser.name);
            System.out.println("Age: " + newUser.age);
            System.out.println("Weight: " + newUser.weight + " lbs");
            System.out.println("Smoker: " + newUser.isSmoker);
        }
        else
        {
            System.out.println("Thank you, have a wonderful day.");
        }
        
    }
}
