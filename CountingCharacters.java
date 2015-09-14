import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {
        System.out.println("Enter some text:");
        Scanner input = new Scanner(System.in);
        String inputString = getUserInputWithWhile(input);
        System.out.print(inputString + " has " + inputString.length() + " characters");
    }

    private static String getUserInput(Scanner input) {
        String inputString = input.nextLine();
        if (inputString.isEmpty()) {
            System.out.print("You have not entered any text, please try again: ");
            return getUserInput(input);
        }
        return inputString;
    }

    private static String getUserInputWithWhile(Scanner input) {
        String inputString = input.nextLine();
        while (inputString.isEmpty()) {
            System.out.print("You have not entered any text, please try again: ");
            inputString = input.nextLine();
        }
        return inputString;
    }
}
