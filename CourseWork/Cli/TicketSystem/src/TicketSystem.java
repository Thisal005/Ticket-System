import java.util.*;

public class TicketSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalTickets = inputCheck(input, "Enter total number of tickets: ");
        int ticketRelrate = inputCheck(input, "Enter ticket release rate: ");
        int ticketRetrate = inputCheck(input, "Enter tickets retrieval rate: ");
        int ticketCapacity = inputCheck(input, "Enter maximum ticket capacity: ");

    }

    public static int inputCheck(Scanner input, String message) {
        int value = 0;
        while (value <= 0) {
            System.out.print(message);
            if (input.hasNextInt()) {
                value = input.nextInt();
                if (value <= 0) {
                    System.out.println("Invalid! Enter a number greater than 0.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                input.next(); // Clear the invalid input
            }
        }
        return value;
    }
}
