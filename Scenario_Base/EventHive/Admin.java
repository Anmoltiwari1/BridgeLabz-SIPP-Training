package EventHive;
import java.util.ArrayList;

public class Admin implements EventManager {
    ArrayList<Event> events = new ArrayList<>();

    @Override
    public void addEvent(Event event) {
        events.add(event);
        System.out.println(event.eventName + " added.");
    }

    @Override
    public void removeEvent(String name) {
        events.removeIf(e -> e.eventName.equals(name));
        System.out.println(name + " removed.");
    }
}
