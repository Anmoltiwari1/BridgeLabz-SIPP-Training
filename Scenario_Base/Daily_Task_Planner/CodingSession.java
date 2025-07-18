package Daily_Task_Planner;
public class CodingSession extends Task {
    public CodingSession(String description) {
        super(description);
    }

    @Override
    public void execute() {
        System.out.println("Coding Task: " + description);
    }
}
