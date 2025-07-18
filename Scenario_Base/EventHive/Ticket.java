package EventHive;
public class Ticket {
    String userName;
    String eventName;

    public Ticket(String userName, String eventName) {
        this.userName = userName;
        this.eventName = eventName;
    }

    public void showTicket() {
        System.out.println("Ticket: " + userName + " registered for " + eventName);
    }
}
