import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number between 50 and 300: ");
        String input = scanner.nextLine();
        int convertedInput = Integer.parseInt(input);


        if ((convertedInput < 50) || (convertedInput > 300)) {
            System.out.println("Null: " + convertedInput);
            System.out.println("is not between 50 and 300 try again.");
        } else {
            System.out.println("Yes");
        }
    }
}

