package EventHive;
public interface EventManager {
    void addEvent(Event event);
    void removeEvent(String eventName);
}
