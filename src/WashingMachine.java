import java.util.Scanner;

public class WashingMachine {
    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);

        System.out.println("Write ON to turn on washing machine");
        String command = stringScanner.nextLine();
        if (command.equalsIgnoreCase("ON")) {
            System.out.println("Hello");
            System.out.println("Locking the door");
            System.out.println("Choose number of program");
            int process = intScanner.nextInt();

            switch (process){
                case 1 -> System.out.println("Synthetics 1h 15min");
                case 2 -> System.out.println("Cotton 2h");
                case 3 -> System.out.println("Neutral 1h 30min");
                case 4 -> System.out.println("Rinse and spin 30min");
                case 0 -> System.out.println("Opening the door");
                default -> System.out.println("Wrong command");
            }
            if (process == 1 || process == 2 || process == 3 || process == 4) {
                System.out.println("Write START to start chosen program");
                String start = stringScanner.nextLine();
                if (start.equalsIgnoreCase("START")) {
                    System.out.println("STARTING Process number " + process);
                }
            }
        } else {
            System.out.println("Wrong command");
        }
        System.out.println("To turn off washing machine write OFF");
        String command3 = stringScanner.nextLine();
        if (command3.equalsIgnoreCase("OFF")) {
            System.out.println("Turning off...");
        }


    }
}