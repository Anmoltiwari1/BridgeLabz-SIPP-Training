import java.util.Scanner;

class MovieTicket {
    static String movieName = "Avengers: Endgame";
    static int availableSeats = 50;
    static final int ticketPrice = 200;

    String customerName;
    int numberOfTickets;
    int totalPrice;

    public boolean bookTickets(String name, int tickets) {
        if (tickets <= availableSeats && tickets > 0) {
            customerName = name;
            numberOfTickets = tickets;
            totalPrice = tickets * ticketPrice;
            availableSeats -= tickets;
            return true;
        } else {
            return false;
        }
    }

    public void displayBookingDetails() {
        System.out.println("\nBooking Successful!");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Movie: " + movieName);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Total Price: ₹" + totalPrice);
        System.out.println("Remaining Seats: " + availableSeats);
    }
}

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueBooking = true;

        System.out.println("Welcome to Movie Ticket Booking System!");
        System.out.println("Movie: " + MovieTicket.movieName);
        System.out.println("Ticket Price: ₹" + MovieTicket.ticketPrice);
        System.out.println("Total Seats Available: " + MovieTicket.availableSeats);

        while (continueBooking && MovieTicket.availableSeats > 0) {
            MovieTicket ticket = new MovieTicket();

            System.out.print("\nEnter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter number of tickets to book: ");
            int tickets = sc.nextInt();
            sc.nextLine();  // Consume newline

            if (ticket.bookTickets(name, tickets)) {
                ticket.displayBookingDetails();
            } else {
                System.out.println("\nSorry! Not enough seats available or invalid number entered.");
            }

            if (MovieTicket.availableSeats == 0) {
                System.out.println("\nAll tickets sold out!");
                break;
            }

            System.out.print("\nDo you want to book more tickets? (yes/no): ");
            String choice = sc.nextLine();

            if (!choice.equalsIgnoreCase("yes")) {
                continueBooking = false;
            }
        }

        System.out.println("\nThank you for using the Movie Ticket Booking System!");
        sc.close();
    }
}
