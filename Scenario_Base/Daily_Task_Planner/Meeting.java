package Daily_Task_Planner;
public class Meeting extends Task {
    public Meeting(String description) {
        super(description);
    }

    @Override
    public void execute() {
        System.out.println("Meeting Task: " + description);
    }
}
