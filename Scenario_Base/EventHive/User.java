package EventHive;
public class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    public Ticket registerForEvent(Event event) {
        return new Ticket(name, event.eventName);
    }
}
