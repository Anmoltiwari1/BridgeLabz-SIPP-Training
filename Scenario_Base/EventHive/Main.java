package EventHive;
public class Main {
    public static void main(String[] args) {
        Event e1 = new Event("CodeFest");
        User user = new User("Anmol");

        Ticket ticket = user.registerForEvent(e1);
        ticket.showTicket();

        Admin admin = new Admin();
        admin.addEvent(e1);
        admin.removeEvent("CodeFest");
    }
}
