import java.util.Scanner;

public class WashingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write START to start washing machine");
        String command = scanner.nextLine();
        if (command.equalsIgnoreCase("START")) {
            System.out.println("Starting Washing Machine");
        } else {
            System.out.println("Wrong command");
        }

    }
}
